package com.health.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.health.service.JournalService;

@Controller
public class JournalController {

	@Autowired
	private JournalService service;
	
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
		return "journalDetail";
	}
	
}
