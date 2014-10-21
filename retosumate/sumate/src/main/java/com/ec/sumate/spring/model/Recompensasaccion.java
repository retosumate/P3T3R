package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the recompensasacciones database table.
 * 
 */
@Entity
@Table(name="recompensasacciones")
public class Recompensasaccion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int ideventorecompensa;

	private int iactivo;

	private int itipoaccion;

	private String vdescripcion;

	//bi-directional many-to-one association to RecompensasPremio
	@OneToMany(mappedBy="recompensasaccione")
	private List<RecompensaPremio> lstRecompensasPremios;

	public Recompensasaccion() {
	}

	public int getIdeventorecompensa() {
		return this.ideventorecompensa;
	}

	public void setIdeventorecompensa(int ideventorecompensa) {
		this.ideventorecompensa = ideventorecompensa;
	}

	public int getIactivo() {
		return this.iactivo;
	}

	public void setIactivo(int iactivo) {
		this.iactivo = iactivo;
	}

	public int getItipoaccion() {
		return this.itipoaccion;
	}

	public void setItipoaccion(int itipoaccion) {
		this.itipoaccion = itipoaccion;
	}

	public String getVdescripcion() {
		return this.vdescripcion;
	}

	public void setVdescripcion(String vdescripcion) {
		this.vdescripcion = vdescripcion;
	}

	public List<RecompensaPremio> getLstRecompensasPremios() {
		return this.lstRecompensasPremios;
	}

	public void setLstRecompensasPremios(List<RecompensaPremio> lstRecompensasPremios) {
		this.lstRecompensasPremios = lstRecompensasPremios;
	}

	public RecompensaPremio addLstRecompensasPremio(RecompensaPremio lstRecompensasPremio) {
		getLstRecompensasPremios().add(lstRecompensasPremio);
		lstRecompensasPremio.setRecompensasaccione(this);

		return lstRecompensasPremio;
	}

	public RecompensaPremio removeLstRecompensasPremio(RecompensaPremio lstRecompensasPremio) {
		getLstRecompensasPremios().remove(lstRecompensasPremio);
		lstRecompensasPremio.setRecompensasaccione(null);

		return lstRecompensasPremio;
	}

}