package com.ec.sumate.spring.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ec.sumate.spring.database.DBUtlMysqlConnectivity;
import com.ec.sumate.spring.model.Usuario;

public class UsuarioDAOImpl extends DBUtlMysqlConnectivity implements UsuarioDAO {
	
	public UsuarioDAOImpl(SessionFactory sessionFactory) {
		super(sessionFactory);
	}

	@Override
	@Transactional
	public List<Usuario> getList() {
		@SuppressWarnings("unchecked")
		List<Usuario> listUsuarios = (List<Usuario>) getSession()
				.createCriteria(Usuario.class)
				.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY).list();
				
		return listUsuarios;
	}

}
