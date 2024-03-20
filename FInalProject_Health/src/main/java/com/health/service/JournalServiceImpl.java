package com.health.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.health.dao.JournalDao;
import com.health.domain.Journal;
import com.health.domain.Exercise;


@Service
public class JournalServiceImpl implements JournalService {

	@Autowired
	private JournalDao journalDao;
	
	@Override
	public Map<String, Object> journalList(int no) {
		List<Journal> getJournal = journalDao.JournalList(no);
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("jList", getJournal);
		

		return modelMap;
	}

	@Override
	public Map<String, Object> exerciseList(int journalNo) {
		
		List<Exercise> getExercise = journalDao.getExercise(journalNo);
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("eList", getExercise);
		

		return modelMap;
	}

	@Override
	public void insertJournal(Journal journal) {
		 journalDao.insertJournal(journal);
		
	}

	@Override
	public void insertExercise(Exercise exercise) {
		
		journalDao.insertExercise(exercise);
		
	}
	

	
	@Override
	public Journal getJounal(int journalNo) {
		
		
		return journalDao.JournalList2(journalNo);
	}


}
