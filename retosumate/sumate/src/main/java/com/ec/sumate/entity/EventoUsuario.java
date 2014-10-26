package com.ec.sumate.entity;

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
	@Column(name="id")
	private EventoUsuarioPK id;

	@Column(name="itipoasociacion")
	private int itipoasociacion;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="idevento", insertable=false, updatable=false)
	private Evento evento;

	//bi-directional many-to-one association to Usuario
	@ManyToOne
	@JoinColumn(name="idusuario", insertable=false, updatable=false)
	private Usuario usuario;

	public EventoUsuario() {
	}

	public EventoUsuarioPK getId() {
		return this.id;
	}

	public void setId(EventoUsuarioPK id) {
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