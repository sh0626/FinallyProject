package com.health.service;

import java.util.Map;


public interface JournalService {
	//운동일지 리스트
	Map<String, Object> journalList(int no);
	
	//운동 일지 상세
	Map<String, Object> exerciseList(int journalNo);
	
}
