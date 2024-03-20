package com.health.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.health.domain.Exercise;
import com.health.domain.Journal;


public interface JournalService {
	//운동일지 리스트
	Map<String, Object> journalList(int no);
	
	//운동 일지 상세
	Map<String, Object> exerciseList(int journalNo);
	
	void insertJournal(Journal journal);
	
	void insertExercise(Exercise exercise);
	
	
	void deleteExercise(int exerciseNo);

	void deleteJournal(int journalNo);
	Journal getJounal(int journalNo);
	
}
