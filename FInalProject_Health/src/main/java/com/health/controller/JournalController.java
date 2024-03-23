package com.health.controller;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.domain.Exercise;
import com.health.domain.Journal;
import com.health.domain.Member;
import com.health.service.JournalService;

@Controller
public class JournalController {

	@Autowired
	private JournalService service;
	 
	@PostMapping("/eWriteProcess") 
	public String insertExercise(
			HttpServletRequest request, HttpSession session, 
			@RequestParam(value="exerciseCate", required=false)String[] exerciseCates, 
			@RequestParam(value="exerciseName", required=false)String[] exerciseNames,
	        @RequestParam(value="journalNo", required=false) int journalNo, 
	        @RequestParam(value="exerciseWeight", required=false) int[] exerciseWeights, 
	        @RequestParam(value="exerciseSet", required=false) int[] exerciseSets, 
	        @RequestParam(value="exerciseRep", required=false) int[] exerciseReps) { 
		
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		if(member == null){
			return "redirect:loginForm";
		}
	    for(int i=0; i <exerciseCates.length; i++) {
		Exercise exercise = new Exercise();
	    exercise.setExerciseCate(exerciseCates[i]);
	    exercise.setExerciseName(exerciseNames[i]);
	    exercise.setExerciseWeight(exerciseWeights[i]);
	    exercise.setExerciseSet(exerciseSets[i]); 
	    exercise.setExerciseRep(exerciseReps[i]);
	    exercise.setFK_exercise_journal(journalNo);
	    service.insertExercise(exercise);
	    }
	   
	    return "redirect:/journalDetail?journalNo=" + journalNo; 
	}

	
	@PostMapping("/jWriteProcess")
	public String insertJournal(String journalTitle,			
			HttpServletRequest request, HttpSession session ,
			@RequestParam(value = "no", required=false) Integer no) {
		
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		if(member == null){
			return "redirect:loginForm";
		}
		no= member.getUserNo();
		
		
		Journal journal = new Journal();
		journal.setJournalTitle(journalTitle);
		journal.setFK_journal_user(no);
		
		service.insertJournal(journal);
		return "redirect:trainingJournal";
	}
	
	@RequestMapping(value = "/trainingJournal", method = RequestMethod.GET)
	public String getJournal(Model model,
			HttpServletRequest request, HttpSession session ,
		@RequestParam(value = "no", required=false) Integer no) {
		
		session = request.getSession();
		System.out.println("session:" +session);
		Member member = (Member) session.getAttribute("member");
		System.out.println("member:" +member);
		if(member == null){
			return "redirect:loginForm";
		}
		no= member.getUserNo();
		System.out.println("no:" +no);
	    
		Map<String, Object> modelMap = service.journalList(no);
		model.addAllAttributes(modelMap);
		System.out.println("model:" +model);
		return "trainingJournal";
	}

	@GetMapping("/journalDetail")
	public String getExercise(Model model, int journalNo,
			HttpServletRequest request, HttpSession session) {
		
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		if(member == null){
			return "redirect:loginForm";
		}
		
		Map<String, Object> modelMap = service.exerciseList(journalNo);
		model.addAllAttributes(modelMap);
		model.addAttribute("journalNo", journalNo);
		return "journalDetail";
	}
	
	
	@GetMapping("/exerciseWrite")
	public String getDetail(Model model, int journalNo,
			HttpServletRequest request, HttpSession session) {
		
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		if(member == null){
			return "redirect:loginForm";
		}
		
		Journal journal = service.getJounal(journalNo);
		model.addAttribute(journal);
		
		return "exerciseWrite";
	}
	
	/* @RequestMapping("/delete")
	public String deleteExercise(ArrayList<Integer> selectedItems, int journalNo) {
	    if (selectedItems != null && !selectedItems.isEmpty()) {
	        service.deleteExercise(selectedItems);
	    }
		service.deleteExercise(selectedItems); 
		return "redirect:journalDetail?journalNo=" + journalNo;
	}*/

	@RequestMapping("/delete")
	public String deleteExercises(@RequestParam("selectedItems") int[] selectedItems, int journalNo,
			HttpServletRequest request, HttpSession session) {
		
		session = request.getSession();
		Member member = (Member) session.getAttribute("member");
		if(member == null){
			return "redirect:loginForm";
		}
		
		for (int exerciseNo : selectedItems) {
	        service.deleteExercise(exerciseNo);
	    }
	    return "redirect:journalDetail?journalNo=" + journalNo;
	}

	@RequestMapping("/deleteJ")
	public String deleteJournal(int journalNo) {	  
	        service.deleteJournal(journalNo);
	    return "redirect:trainingJournal";
	}
	
}
