package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the estados database table.
 * 
 */
@Entity
@Table(name="estados")
public class Estado implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idestado;

	private int iactivo;

	private String vdescripcion;

	private String vposicionglobal;

	//bi-directional many-to-one association to Evento
	@OneToMany(mappedBy="estado")
	private List<Evento> lstEventos;

	//bi-directional many-to-one association to Organizacione
	@OneToMany(mappedBy="estado")
	private List<Organizacion> lstOrganizaciones;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="estado")
	private List<Usuario> lstUsuarios;

	public Estado() {
	}

	public int getIdestado() {
		return this.idestado;
	}

	public void setIdestado(int idestado) {
		this.idestado = idestado;
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
		lstEvento.setEstado(this);

		return lstEvento;
	}

	public Evento removeLstEvento(Evento lstEvento) {
		getLstEventos().remove(lstEvento);
		lstEvento.setEstado(null);

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
		lstOrganizacione.setEstado(this);

		return lstOrganizacione;
	}

	public Organizacion removeLstOrganizacione(Organizacion lstOrganizacione) {
		getLstOrganizaciones().remove(lstOrganizacione);
		lstOrganizacione.setEstado(null);

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
		lstUsuario.setEstado(this);

		return lstUsuario;
	}

	public Usuario removeLstUsuario(Usuario lstUsuario) {
		getLstUsuarios().remove(lstUsuario);
		lstUsuario.setEstado(null);

		return lstUsuario;
	}

}