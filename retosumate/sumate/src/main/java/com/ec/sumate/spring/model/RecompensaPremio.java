package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the recompensas_premios database table.
 * 
 */
@Entity
@Table(name="recompensas_premios")
public class RecompensaPremio implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RecompensaPremioPK id;

	private int icondicionpremio;

	private int itiporecompensa;

	//bi-directional many-to-one association to Premio
	@ManyToOne
	@JoinColumn(name="idpremio")
	private Premio premio;

	//bi-directional many-to-one association to Recompensa
	@ManyToOne
	@JoinColumn(name="idrecompensa")
	private Recompensa recompensa;

	//bi-directional many-to-one association to Recompensasaccione
	@ManyToOne
	@JoinColumn(name="ideventorecompensa")
	private Recompensasaccion recompensasaccione;

	public RecompensaPremio() {
	}

	public RecompensaPremioPK getId() {
		return this.id;
	}

	public void setId(RecompensaPremioPK id) {
		this.id = id;
	}

	public int getIcondicionpremio() {
		return this.icondicionpremio;
	}

	public void setIcondicionpremio(int icondicionpremio) {
		this.icondicionpremio = icondicionpremio;
	}

	public int getItiporecompensa() {
		return this.itiporecompensa;
	}

	public void setItiporecompensa(int itiporecompensa) {
		this.itiporecompensa = itiporecompensa;
	}

	public Premio getPremio() {
		return this.premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Recompensa getRecompensa() {
		return this.recompensa;
	}

	public void setRecompensa(Recompensa recompensa) {
		this.recompensa = recompensa;
	}

	public Recompensasaccion getRecompensasaccione() {
		return this.recompensasaccione;
	}

	public void setRecompensasaccione(Recompensasaccion recompensasaccione) {
		this.recompensasaccione = recompensasaccione;
	}

}