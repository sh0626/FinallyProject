package com.health.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.health.domain.Exercise;
import com.health.domain.Journal;


public interface JournalService {
	//운동일지 리스트
	Map<String, Object> journalList(int no);	
	
	//운동일지 상세
	Map<String, Object> exerciseList(int journalNo);
	
	//운동일지 게시판 작성
	void insertJournal(Journal journal);
	
	//운동일지 상세 작성
	void insertExercise(Exercise exercise);	
	
	//운동일지 게시판 삭제
	void deleteJournal(int journalNo);

	//운동일지 상세 삭제
	void deleteExercise(int exerciseNo);
	
	//일지 정보
	Journal getJounal(int journalNo);
	
}
