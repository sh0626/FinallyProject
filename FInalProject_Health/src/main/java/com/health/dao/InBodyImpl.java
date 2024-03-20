package com.health.dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.health.domain.InBodyDTO;

@Repository
public class InBodyImpl implements InBodyDAO {
	private static final String NAME_SPACE = "com.health.mapper.InBodyMapper";
	
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public List<InBodyDTO> InBodyList() {
		return sqlSession.selectList(NAME_SPACE + ".getInBody");
	}
	
	@Override
	public void insertInBody(InBodyDTO inBodyDTO) {
		// TODO Auto-generated method stub
		sqlSession.insert(NAME_SPACE + ".addInBody", inBodyDTO);
	}

}
