package com.health.service;

import java.util.Map;

import com.health.domain.InBodyDTO;

public interface InBodyService {
	Map<String, Object> getInBody();
	public abstract void insertInBody(InBodyDTO inBodyDTO);
}
