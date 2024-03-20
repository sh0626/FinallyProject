package com.health.dao;

import java.util.List;

import com.health.domain.Exercise;
import com.health.domain.Journal;


public interface JournalDao {

	//운동일지 리스트 출력
	List<Journal> JournalList(int no);

	//운동일지 상세 출력
	List<Exercise> getExercise(int journalNo);
	
	void insertJournal(Journal journal);
	
	void insertExercise(Exercise exercise);
	
	Journal JournalList2(int journalNo);
}
