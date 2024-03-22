package com.health.dao;

import java.util.List;

import com.health.domain.InBodyDTO;

public interface InBodyDAO {
	//인바디 목록 들고옴
	List<InBodyDTO> InBodyList(int no);
	
	//인바디 사진 넣기
	void insertInBody(InBodyDTO inBodyDTO);
	
}
