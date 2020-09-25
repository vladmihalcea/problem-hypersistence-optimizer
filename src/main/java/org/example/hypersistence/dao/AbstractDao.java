package org.example.hypersistence.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public class AbstractDao<T> {

	@Autowired
	private SessionFactory sessionFactory;

	private final Class<T> entityClass;

	public AbstractDao(Class<T> entityClass) {
		this.entityClass = entityClass;
	}

	protected SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
