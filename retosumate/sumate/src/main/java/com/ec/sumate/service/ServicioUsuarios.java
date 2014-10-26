package com.ec.sumate.service;

import java.util.List;

import com.ec.sumate.entity.Usuario;

public interface ServicioUsuarios {
	
	public List<Usuario> getUsuarios();

	public Usuario getUsuarioById(Long userId);

}
