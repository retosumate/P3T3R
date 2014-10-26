package com.ec.sumate.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ec.sumate.dao.UsuarioDAOImpl;
import com.ec.sumate.entity.Usuario;
import com.ec.sumate.service.ServicioUsuarios;

@Service
public class ServicioUsuariosImpl implements ServicioUsuarios {

	@Resource
	private UsuarioDAOImpl usuarioDao;
	
	@Override
	public List<Usuario> getUsuarios() {
		return usuarioDao.getList();
	}
	
	@Override
	public Usuario getUsuarioById(Long userId) {
		return usuarioDao.getUserById(userId);
	}

}
