package com.health.dao;

import java.util.List;

import com.health.domain.Journal;
import com.health.domain.exercise;

public interface JournalDao {

	//운동일지 리스트 출력
	List<Journal> JournalList(int no);

	//운동일지 상세 출력
	List<exercise> getExercise(int journalNo);
	
	void insertJournal(Journal journal);
}
