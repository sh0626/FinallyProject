package com.health.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.dao.JournalDao;
import com.health.domain.Journal;
import com.health.domain.Exercise;

@Service
public class JournalServiceImpl implements JournalService {

	@Autowired
	private JournalDao journalDao;
	
	//운동일지 리스트 출력
	@Override
	public Map<String, Object> journalList(int no) {
		List<Journal> getJournal = journalDao.JournalList(no);
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("jList", getJournal);
		

		return modelMap;
	}

	//운동일지 상세 출력
	@Override
	public Map<String, Object> exerciseList(int journalNo) {
		
		List<Exercise> getExercise = journalDao.getExercise(journalNo);
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("eList", getExercise);
		

		return modelMap;
	}

	//운동일지 게시판 작성
	@Override
	public void insertJournal(Journal journal) {
		 journalDao.insertJournal(journal);
		
	}

	//운동일지 상세 작성
	@Override
	public void insertExercise(Exercise exercise) {
		
		journalDao.insertExercise(exercise);
		
	}
	
	//운동일지 게시판 삭제
	@Override
	public void deleteJournal(int journalNo) {
		journalDao.deleteJournal(journalNo);
		
	}

	//운동일지 상세 삭제
	@Override
	public void deleteExercise(int exerciseNo) {
		journalDao.deleteExercise(exerciseNo);
		
	}
	
	//일지 정보
	@Override
	public Journal getJounal(int journalNo) {				
		return journalDao.JournalList2(journalNo);
	}



}
