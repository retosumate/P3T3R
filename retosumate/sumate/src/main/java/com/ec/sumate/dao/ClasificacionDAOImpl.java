package com.ec.sumate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ec.sumate.entity.Clasificacion;
import com.ec.sumate.util.HbmMysqlConnectivity;

public class ClasificacionDAOImpl extends HbmMysqlConnectivity implements ClasificacionDAO {
	
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
