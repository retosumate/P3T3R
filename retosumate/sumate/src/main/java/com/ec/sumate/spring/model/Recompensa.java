package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the recompensas database table.
 * 
 */
@Entity
@Table(name="recompensas")
public class Recompensa implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idrecompensa;

	private int iactivo;

	private String vdescripcion;

	//bi-directional many-to-many association to Evento
	@ManyToMany(mappedBy="recompensas")
	private List<Evento> lstEventos;

	//bi-directional many-to-one association to RecompensasPremio
	@OneToMany(mappedBy="recompensa")
	private List<RecompensaPremio> lstRecompensasPremios;

	//bi-directional many-to-one association to UsuariosPremio
	@OneToMany(mappedBy="recompensa")
	private List<UsuarioPremio> lstUsuariosPremios;

	public Recompensa() {
	}

	public int getIdrecompensa() {
		return this.idrecompensa;
	}

	public void setIdrecompensa(int idrecompensa) {
		this.idrecompensa = idrecompensa;
	}

	public int getIactivo() {
		return this.iactivo;
	}

	public void setIactivo(int iactivo) {
		this.iactivo = iactivo;
	}

	public String getVdescripcion() {
		return this.vdescripcion;
	}

	public void setVdescripcion(String vdescripcion) {
		this.vdescripcion = vdescripcion;
	}

	public List<Evento> getLstEventos() {
		return this.lstEventos;
	}

	public void setLstEventos(List<Evento> lstEventos) {
		this.lstEventos = lstEventos;
	}

	public List<RecompensaPremio> getLstRecompensasPremios() {
		return this.lstRecompensasPremios;
	}

	public void setLstRecompensasPremios(List<RecompensaPremio> lstRecompensasPremios) {
		this.lstRecompensasPremios = lstRecompensasPremios;
	}

	public RecompensaPremio addLstRecompensasPremio(RecompensaPremio lstRecompensasPremio) {
		getLstRecompensasPremios().add(lstRecompensasPremio);
		lstRecompensasPremio.setRecompensa(this);

		return lstRecompensasPremio;
	}

	public RecompensaPremio removeLstRecompensasPremio(RecompensaPremio lstRecompensasPremio) {
		getLstRecompensasPremios().remove(lstRecompensasPremio);
		lstRecompensasPremio.setRecompensa(null);

		return lstRecompensasPremio;
	}

	public List<UsuarioPremio> getLstUsuariosPremios() {
		return this.lstUsuariosPremios;
	}

	public void setLstUsuariosPremios(List<UsuarioPremio> lstUsuariosPremios) {
		this.lstUsuariosPremios = lstUsuariosPremios;
	}

	public UsuarioPremio addLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().add(lstUsuariosPremio);
		lstUsuariosPremio.setRecompensa(this);

		return lstUsuariosPremio;
	}

	public UsuarioPremio removeLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().remove(lstUsuariosPremio);
		lstUsuariosPremio.setRecompensa(null);

		return lstUsuariosPremio;
	}

}