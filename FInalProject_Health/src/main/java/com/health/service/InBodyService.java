package com.health.service;

import java.util.Map;

import com.health.domain.InBodyDTO;

public interface InBodyService {
	Map<String, Object> getInBody(int no);
	public abstract void insertInBody(InBodyDTO inBodyDTO);
}
