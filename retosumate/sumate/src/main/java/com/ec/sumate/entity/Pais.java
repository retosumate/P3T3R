package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the paises database table.
 * 
 */
@Entity
@Table(name="paises")
public class Pais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idpais")
	private int idpais;

	@Column(name="iactivo")
	private int iactivo;

	@Column(name="vdescripcion")
	private String vdescripcion;

	@Column(name="vposicionglobal")
	private String vposicionglobal;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="pais")
	private List<Evento> lstEventos;

	//bi-directional many-to-one association to Organizacione
	@OneToMany(mappedBy="pais")
	private List<Organizacion> lstOrganizaciones;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="pais")
	private List<Usuario> lstUsuarios;

	public Pais() {
	}

	public int getIdpais() {
		return this.idpais;
	}

	public void setIdpais(int idpais) {
		this.idpais = idpais;
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

	public String getVposicionglobal() {
		return this.vposicionglobal;
	}

	public void setVposicionglobal(String vposicionglobal) {
		this.vposicionglobal = vposicionglobal;
	}

	public List<Evento> getLstEventos() {
		return this.lstEventos;
	}

	public void setLstEventos(List<Evento> lstEventos) {
		this.lstEventos = lstEventos;
	}

	public Evento addLstEvento(Evento lstEvento) {
		getLstEventos().add(lstEvento);
		lstEvento.setPais(this);

		return lstEvento;
	}

	public Evento removeLstEvento(Evento lstEvento) {
		getLstEventos().remove(lstEvento);
		lstEvento.setPais(null);

		return lstEvento;
	}

	public List<Organizacion> getLstOrganizaciones() {
		return this.lstOrganizaciones;
	}

	public void setLstOrganizaciones(List<Organizacion> lstOrganizaciones) {
		this.lstOrganizaciones = lstOrganizaciones;
	}

	public Organizacion addLstOrganizacione(Organizacion lstOrganizacione) {
		getLstOrganizaciones().add(lstOrganizacione);
		lstOrganizacione.setPais(this);

		return lstOrganizacione;
	}

	public Organizacion removeLstOrganizacione(Organizacion lstOrganizacione) {
		getLstOrganizaciones().remove(lstOrganizacione);
		lstOrganizacione.setPais(null);

		return lstOrganizacione;
	}

	public List<Usuario> getLstUsuarios() {
		return this.lstUsuarios;
	}

	public void setLstUsuarios(List<Usuario> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}

	public Usuario addLstUsuario(Usuario lstUsuario) {
		getLstUsuarios().add(lstUsuario);
		lstUsuario.setPais(this);

		return lstUsuario;
	}

	public Usuario removeLstUsuario(Usuario lstUsuario) {
		getLstUsuarios().remove(lstUsuario);
		lstUsuario.setPais(null);

		return lstUsuario;
	}

}