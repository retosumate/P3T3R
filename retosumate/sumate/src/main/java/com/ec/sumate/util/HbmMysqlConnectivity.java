package com.ec.sumate.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HbmMysqlConnectivity {
	protected SessionFactory sessionFactory;
	
	public HbmMysqlConnectivity(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
}
