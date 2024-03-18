package com.health.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import com.health.dao.ScheduleDAO;
import com.health.domain.ScheduleDTO;

@Service
public class ScheduleService {

	@Inject
	private ScheduleDAO dao;
	
	public List<ScheduleDTO> showSchedule() throws Exception {
		return dao.showSchedule();
	}
	
	public void addSchedule(ScheduleDTO dto) throws Exception{
		dao.addSchedule(dto);
	}
}