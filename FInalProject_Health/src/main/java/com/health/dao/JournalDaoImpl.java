package com.health.dao;

import java.util.ArrayList;
import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.domain.Journal;
import com.health.domain.Exercise;

@Repository
public class JournalDaoImpl implements JournalDao {
	private static final String NAME_SPACE = "com.health.mapper.JournalMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	//운동일지 리스트 출력
	@Override
	public List<Journal> JournalList(int no) {

		return sqlSession.selectList(NAME_SPACE +".getJournalList", no);
	}

	//운동일지 상세 출력
	@Override
	public List<Exercise> getExercise(int journalNo) {
	
		return sqlSession.selectList(NAME_SPACE +".getExercise", journalNo);
	}
	//운동일지 게시판 작성
	@Override
	public void insertJournal(Journal journal) {
	
		sqlSession.insert(NAME_SPACE+".insertJournal", journal);
		
	}
	//운동일지 상세 작성
	@Override
	public void insertExercise(Exercise exercise) {
		sqlSession.insert(NAME_SPACE + ".insertExercise", exercise); 
		
	}
	//운동일지 게시판 삭제
	@Override
	public void deleteJournal(int journalNo) {
		sqlSession.delete(NAME_SPACE+".deleteJournal", journalNo);
		
	}
	//운동일지 상세 삭제
	@Override
	public void deleteExercise(int exerciseNo) {
		sqlSession.delete(NAME_SPACE+".deleteExercise", exerciseNo);
		
	}
	//일지 정보
	@Override
	public Journal JournalList2(int journalNo) {
		
		return sqlSession.selectOne(NAME_SPACE+".getJournalList2", journalNo);
	}

}
