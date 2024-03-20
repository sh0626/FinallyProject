package com.health.controller;

import java.io.PrintWriter;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

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
import com.health.service.JournalService;

@Controller
public class JournalController {

	@Autowired
	private JournalService service;

	
	
	/*@PostMapping("/eWriteProcess") 
	public String insertExercise(
			@RequestParam(value="journalNo", required=false) int journalNo, 
			ExerciseList exercises) {	    
	    
	    service.insertExercises(exercises);
	   
	    return "redirect:/journalDetail?journalNo=" + journalNo; 
	}*/
	
	/*
	@PostMapping("/eWriteProcess") 
	public String insertExercise(
			@RequestParam(value="journalNo", required=false) int journalNo, 
			ArrayList<Exercise> exercises) {	    
	    
	    service.insertExercises(exercises);
	   
	    return "redirect:/journalDetail?journalNo=" + journalNo; 
	}
	*/
	
	@PostMapping("/eWriteProcess") 
	public String insertExercise(String exerciseCate, String exerciseName,
	        @RequestParam(value="journalNo", required=false) int journalNo, 
	        @RequestParam(value="exerciseWeight", required=false) int exerciseWeight, 
	        @RequestParam(value="exerciseSet", required=false) int exerciseSet, 
	        @RequestParam(value="exerciseRep", required=false) int exerciseRep) { 
	    Exercise exercise = new Exercise();
	    exercise.setExerciseCate(exerciseCate);
	    exercise.setExerciseName(exerciseName);
	    exercise.setExerciseWeight(exerciseWeight);
	    exercise.setExerciseSet(exerciseSet); 
	    exercise.setExerciseRep(exerciseRep);
	    exercise.setFK_exercise_journal(journalNo);
	    
	    service.insertExercise(exercise);
	   
	    return "redirect:/journalDetail?journalNo=" + journalNo; 
	}
	 
	
	@PostMapping("/jWriteProcess")
	public String insertJournal(String journalTitle,
			@RequestParam(value = "no", required=false, defaultValue = "1") int no) {
		
		Journal journal = new Journal();
		journal.setJournalTitle(journalTitle);
		journal.setFK_journal_user(no);
		
		service.insertJournal(journal);
		return "redirect:trainingJournal";
	}
	
	

	
	
	@RequestMapping(value = "/trainingJournal", method = RequestMethod.GET)
	public String getJournal(Model model,
		@RequestParam(value = "no", required=false, defaultValue = "1") int no) {
		Map<String, Object> modelMap = service.journalList(no);
		model.addAllAttributes(modelMap);
		return "trainingJournal";
	}

	@GetMapping("/journalDetail")
	public String getExercise(Model model, int journalNo) {
		Map<String, Object> modelMap = service.exerciseList(journalNo);
		model.addAllAttributes(modelMap);
		model.addAttribute("journalNo", journalNo);
		return "journalDetail";
	}
	
	
	@GetMapping("/exerciseWrite")
	public String getDetail(Model model, int journalNo) {
		
		
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
	public String deleteExercises(@RequestParam("selectedItems") int[] selectedItems, int journalNo) {
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
