package com.ec.sumate.dao;

import java.util.List;

import com.ec.sumate.entity.Usuario;

public interface UsuarioDAO {
	
	public List<Usuario> getList();

	public Usuario getUserById(Long usuarioId);
}
