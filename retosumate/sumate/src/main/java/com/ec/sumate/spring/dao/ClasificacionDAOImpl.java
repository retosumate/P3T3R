package com.ec.sumate.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ec.sumate.spring.database.DBUtlMysqlConnectivity;
import com.ec.sumate.spring.model.Clasificacion;

public class ClasificacionDAOImpl extends DBUtlMysqlConnectivity implements ClasificacionDAO {
	
	public ClasificacionDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	@Transactional
	public List<Clasificacion> getList() {
		@SuppressWarnings("unchecked")
		List<Clasificacion> lstClasificaciones = (List<Clasificacion>) getSession().createCriteria(Clasificacion.class).setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
		return lstClasificaciones;
	}

}
