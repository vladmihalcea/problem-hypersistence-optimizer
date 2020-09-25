package org.example.hypersistence.service;

import org.example.hypersistence.dao.LibraryDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class LibraryService {

	@Autowired
	private LibraryDao dao;

	@Transactional
	public void deleteAll() {
		dao.deleteAll();
	}
}
