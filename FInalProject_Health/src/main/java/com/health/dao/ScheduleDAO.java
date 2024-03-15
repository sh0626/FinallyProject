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

	private static final String namespace = "com.management.schedule.ScheduleDAO";
	private static final String NAME_SPACE = "com.health.mapper.JournalMapper";
	
	public List<ScheduleDTO> showSchedule(String id) throws Exception {
		return sqlSession.selectList(namespace + ".showSchedule", id);
	}

	public void addSchedule(ScheduleDTO dto) throws Exception {
		sqlSession.insert(namespace + ".addSchedule", dto);
	}
}