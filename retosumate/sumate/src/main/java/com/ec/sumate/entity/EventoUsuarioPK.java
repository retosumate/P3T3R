package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the eventos_usuarios database table.
 * 
 */
@Embeddable
public class EventoUsuarioPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="idevento")
	private int idevento;

	@Column(name="idusuario")
	private int idusuario;

	public EventoUsuarioPK() {
	}
	
	public int getIdevento() {
		return this.idevento;
	}
	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}
	public int getIdusuario() {
		return this.idusuario;
	}
	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof EventoUsuarioPK)) {
			return false;
		}
		EventoUsuarioPK castOther = (EventoUsuarioPK)other;
		return 
			(this.idevento == castOther.idevento)
			&& (this.idusuario == castOther.idusuario);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idevento;
		hash = hash * prime + this.idusuario;
		
		return hash;
	}
}