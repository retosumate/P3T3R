package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the eventos_media database table.
 * 
 */
@Entity
@Table(name="eventos_media")
public class EventoMedia implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idevento;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dfechacreacion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dfechamodificacion;

	private int itipomedia;

	private String varchivomedia;

	//bi-directional one-to-one association to Evento
	@OneToOne
	@JoinColumn(name="idevento")
	private Evento evento;

	public EventoMedia() {
	}

	public int getIdevento() {
		return this.idevento;
	}

	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}

	public Date getDfechacreacion() {
		return this.dfechacreacion;
	}

	public void setDfechacreacion(Date dfechacreacion) {
		this.dfechacreacion = dfechacreacion;
	}

	public Date getDfechamodificacion() {
		return this.dfechamodificacion;
	}

	public void setDfechamodificacion(Date dfechamodificacion) {
		this.dfechamodificacion = dfechamodificacion;
	}

	public int getItipomedia() {
		return this.itipomedia;
	}

	public void setItipomedia(int itipomedia) {
		this.itipomedia = itipomedia;
	}

	public String getVarchivomedia() {
		return this.varchivomedia;
	}

	public void setVarchivomedia(String varchivomedia) {
		this.varchivomedia = varchivomedia;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

}