package com.health.dao;

import java.util.List;

import com.health.domain.Exercise;
import com.health.domain.Journal;


public interface JournalDao {

	//운동일지 리스트 출력
	List<Journal> JournalList(int no);

	//운동일지 상세 출력
	List<Exercise> getExercise(int journalNo);

	//운동일지 게시판 작성
	void insertJournal(Journal journal);
	
	//운동일지 상세 작성
	void insertExercise(Exercise exercise);

	//운동일지 게시판 삭제
	void deleteJournal(int journalNo);
	
	//운동일지 상세 삭제
	void deleteExercise(int exerciseNo);
	
	//일지 정보
	Journal JournalList2(int journalNo);
}
