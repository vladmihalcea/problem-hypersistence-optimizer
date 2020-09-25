package org.example.hypersistence.dao;

import org.example.hypersistence.domain.Library;
import org.springframework.stereotype.Repository;

@Repository
public class LibraryDao extends AbstractDao<Library> {

	public LibraryDao() {
		super(Library.class);
	}

	public void deleteAll() {
		getSession().createQuery("DELETE FROM Library WHERE id < 1").executeUpdate();
	}
}
