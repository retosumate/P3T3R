package com.ec.sumate.spring.database;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class DBUtlMysqlConnectivity {
	protected SessionFactory sessionFactory;
	
	public DBUtlMysqlConnectivity(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
