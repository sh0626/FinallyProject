package com.health.dao;

import java.util.List;

import com.health.domain.Journal;

public interface JournalDao {

	List<Journal> JournalList(int no);
}
