package com.health.dao;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import com.health.domain.ScheduleDTO;

@Repository
public class ScheduleDAO {

	@Inject
	private SqlSession sqlSession;

	//ScheduleDAO
	private static final String NAME_SPACE = "com.health.mapper.ScheduleMapper";
	
	public List<ScheduleDTO> showSchedule() throws Exception {
		return sqlSession.selectList(NAME_SPACE + ".showSchedule");
	}

	public void addSchedule(ScheduleDTO dto) throws Exception {
		sqlSession.insert(NAME_SPACE + ".addSchedule", dto);
	}
}