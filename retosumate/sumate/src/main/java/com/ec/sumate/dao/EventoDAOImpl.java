package com.ec.sumate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ec.sumate.entity.Evento;
import com.ec.sumate.util.HbmMysqlConnectivity;

public class EventoDAOImpl extends HbmMysqlConnectivity implements EventoDAO {
	
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
