package com.health.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.dao.InBodyDAO;
import com.health.domain.InBodyDTO;

@Service
public class InBodyServiceImpl implements InBodyService {
	@Autowired
	private InBodyDAO inBodyDAO;

	@Override
	public Map<String, Object> getInBody() {
		List<InBodyDTO> getInBody = inBodyDAO.InBodyList();

		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("inBody", getInBody);
		return modelMap;
	}

	@Override
	public void insertInBody(InBodyDTO inBodyDTO) {
		// TODO Auto-generated method stub
		inBodyDAO.insertInBody(inBodyDTO);
	}

}
