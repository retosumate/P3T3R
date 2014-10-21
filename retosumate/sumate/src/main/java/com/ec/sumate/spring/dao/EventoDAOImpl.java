package com.ec.sumate.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ec.sumate.spring.database.DBUtlMysqlConnectivity;
import com.ec.sumate.spring.model.Evento;

public class EventoDAOImpl extends DBUtlMysqlConnectivity implements EventoDAO {
	
	public EventoDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	@Transactional
	public List<Evento> getList() {
		@SuppressWarnings("unchecked")
		List<Evento> listEventos = (List<Evento>) getSession().createCriteria(Evento.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return listEventos;
	}

}
