package com.health.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.domain.Journal;

@Repository
public class JournalDaoImpl implements JournalDao {
	private static final String NAME_SPACE = "com.health.mapper.JournalMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<Journal> JournalList(int no) {

		return sqlSession.selectList(NAME_SPACE +".getJournalList", no);
	}

}
