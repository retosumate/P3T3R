package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the premios database table.
 * 
 */
@Entity
@Table(name="premios")
public class Premio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idpremio;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dfechacreacion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dfechamodificacion;

	private int iactivo;

	private int idpremioagrupador;

	private int idtipopremio;

	private int npuntosganados;

	private String varchivoimagen;

	private String vdescripcion;

	//bi-directional many-to-one association to RecompensasPremio
	@OneToMany(mappedBy="premio")
	private List<RecompensaPremio> lstRecompensasPremios;

	//bi-directional many-to-one association to UsuariosPremio
	@OneToMany(mappedBy="premio")
	private List<UsuarioPremio> lstUsuariosPremios;

	public Premio() {
	}

	public int getIdpremio() {
		return this.idpremio;
	}

	public void setIdpremio(int idpremio) {
		this.idpremio = idpremio;
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

	public int getIactivo() {
		return this.iactivo;
	}

	public void setIactivo(int iactivo) {
		this.iactivo = iactivo;
	}

	public int getIdpremioagrupador() {
		return this.idpremioagrupador;
	}

	public void setIdpremioagrupador(int idpremioagrupador) {
		this.idpremioagrupador = idpremioagrupador;
	}

	public int getIdtipopremio() {
		return this.idtipopremio;
	}

	public void setIdtipopremio(int idtipopremio) {
		this.idtipopremio = idtipopremio;
	}

	public int getNpuntosganados() {
		return this.npuntosganados;
	}

	public void setNpuntosganados(int npuntosganados) {
		this.npuntosganados = npuntosganados;
	}

	public String getVarchivoimagen() {
		return this.varchivoimagen;
	}

	public void setVarchivoimagen(String varchivoimagen) {
		this.varchivoimagen = varchivoimagen;
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
		lstRecompensasPremio.setPremio(this);

		return lstRecompensasPremio;
	}

	public RecompensaPremio removeLstRecompensasPremio(RecompensaPremio lstRecompensasPremio) {
		getLstRecompensasPremios().remove(lstRecompensasPremio);
		lstRecompensasPremio.setPremio(null);

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
		lstUsuariosPremio.setPremio(this);

		return lstUsuariosPremio;
	}

	public UsuarioPremio removeLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().remove(lstUsuariosPremio);
		lstUsuariosPremio.setPremio(null);

		return lstUsuariosPremio;
	}

}