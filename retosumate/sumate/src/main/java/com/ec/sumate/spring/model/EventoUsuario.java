package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the eventos_usuarios database table.
 * 
 */
@Entity
@Table(name="eventos_usuarios")
public class EventoUsuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private EventosUsuarioPK id;

	private int itipoasociacion;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="idevento")
	private Evento evento;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public EventoUsuario() {
	}

	public EventosUsuarioPK getId() {
		return this.id;
	}

	public void setId(EventosUsuarioPK id) {
		this.id = id;
	}

	public int getItipoasociacion() {
		return this.itipoasociacion;
	}

	public void setItipoasociacion(int itipoasociacion) {
		this.itipoasociacion = itipoasociacion;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}