package com.ec.sumate.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.springframework.transaction.annotation.Transactional;

import com.ec.sumate.entity.Usuario;
import com.ec.sumate.util.HbmMysqlConnectivity;

public class UsuarioDAOImpl extends HbmMysqlConnectivity implements UsuarioDAO {
	
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
	
	@Override
	@Transactional
	public Usuario getUserById(Long usuarioId) {
		Usuario usuario = (Usuario) getSession().load(Usuario.class, usuarioId);
		return usuario;
	}

}
