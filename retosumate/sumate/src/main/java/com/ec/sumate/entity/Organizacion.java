package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the organizaciones database table.
 * 
 */
@Entity
@Table(name="organizaciones")
public class Organizacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idorganizacion")
	private int idorganizacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechacreacion")
	private Date dfechacreacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechamodificacion")
	private Date dfechamodificacion;

	@Column(name="iactivo")
	private int iactivo;

	@Column(name="itipo")
	private int itipo;

	@Column(name="vachivoimagen")
	private String varchivoimagen;

	@Column(name="vdescripcion")
	private String vdescripcion;

	@Column(name="vposicionglobal")
	private String vposicionglobal;

	@Column(name="vrazonsocial")
	private String vrazonsocial;

	@Column(name="vrfc")
	private String vrfc;

	@Column(name="vubicacion")
	private String vubicacion;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="organizacion")
	private List<Evento> lstEventos;

	//bi-directional many-to-one association to Colonia
	@ManyToOne
	@JoinColumn(name="idcolonia")
	private Colonia colonia;

	//bi-directional many-to-one association to Estado
	@ManyToOne
	@JoinColumn(name="idestado")
	private Estado estado;

	//bi-directional many-to-one association to Municipio
	@ManyToOne
	@JoinColumn(name="idmunicipio")
	private Municipio municipio;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="idpais")
	private Pais pais;

	//bi-directional many-to-one association to UsuariosPremio
	@OneToMany(mappedBy="organizacion")
	private List<UsuarioPremio> lstUsuariosPremios;

	public Organizacion() {
	}

	public int getIdorganizacion() {
		return this.idorganizacion;
	}

	public void setIdorganizacion(int idorganizacion) {
		this.idorganizacion = idorganizacion;
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

	public int getItipo() {
		return this.itipo;
	}

	public void setItipo(int itipo) {
		this.itipo = itipo;
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

	public String getVposicionglobal() {
		return this.vposicionglobal;
	}

	public void setVposicionglobal(String vposicionglobal) {
		this.vposicionglobal = vposicionglobal;
	}

	public String getVrazonsocial() {
		return this.vrazonsocial;
	}

	public void setVrazonsocial(String vrazonsocial) {
		this.vrazonsocial = vrazonsocial;
	}

	public String getVrfc() {
		return this.vrfc;
	}

	public void setVrfc(String vrfc) {
		this.vrfc = vrfc;
	}

	public String getVubicacion() {
		return this.vubicacion;
	}

	public void setVubicacion(String vubicacion) {
		this.vubicacion = vubicacion;
	}

	public List<Evento> getLstEventos() {
		return this.lstEventos;
	}

	public void setLstEventos(List<Evento> lstEventos) {
		this.lstEventos = lstEventos;
	}

	public Evento addLstEvento(Evento lstEvento) {
		getLstEventos().add(lstEvento);
		lstEvento.setOrganizacion(this);

		return lstEvento;
	}

	public Evento removeLstEvento(Evento lstEvento) {
		getLstEventos().remove(lstEvento);
		lstEvento.setOrganizacion(null);

		return lstEvento;
	}

	public Colonia getColonia() {
		return this.colonia;
	}

	public void setColonia(Colonia colonia) {
		this.colonia = colonia;
	}

	public Estado getEstado() {
		return this.estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Municipio getMunicipio() {
		return this.municipio;
	}

	public void setMunicipio(Municipio municipio) {
		this.municipio = municipio;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<UsuarioPremio> getLstUsuariosPremios() {
		return this.lstUsuariosPremios;
	}

	public void setLstUsuariosPremios(List<UsuarioPremio> lstUsuariosPremios) {
		this.lstUsuariosPremios = lstUsuariosPremios;
	}

	public UsuarioPremio addLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().add(lstUsuariosPremio);
		lstUsuariosPremio.setOrganizacion(this);

		return lstUsuariosPremio;
	}

	public UsuarioPremio removeLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().remove(lstUsuariosPremio);
		lstUsuariosPremio.setOrganizacion(null);

		return lstUsuariosPremio;
	}

}