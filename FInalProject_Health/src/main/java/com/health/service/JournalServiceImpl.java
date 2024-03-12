package com.health.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.health.dao.JournalDao;
import com.health.domain.Journal;

@Service
public class JournalServiceImpl implements JournalService {

	@Autowired
	private JournalDao journalDao;
	
	@Override
	public Map<String, Object> journalList(int no) {
		List<Journal> getJournal = journalDao.JournalList(no);
		
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("jList", getJournal);
		

		return modelMap;
	}

}
