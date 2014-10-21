package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the clasificaciones database table.
 * 
 */
@Entity
@Table(name="clasificaciones")
public class Clasificacion implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer idclasificacion;

	private Integer iactivo;

	private Integer idclasificacionpadre;

	private String vdescripcion;

	//bi-directional many-to-many association to Evento
	@ManyToMany(mappedBy="lstClasificaciones")
	private List<Evento> lstEventos;

	//bi-directional many-to-many association to Usuario
	@ManyToMany(mappedBy="clasificaciones")
	private List<Usuario> lstUsuarios;

	public Clasificacion() {
	}

	public Integer getIdclasificacion() {
		return this.idclasificacion;
	}

	public void setIdclasificacion(Integer idclasificacion) {
		this.idclasificacion = idclasificacion;
	}

	public Integer getIactivo() {
		return this.iactivo;
	}

	public void setIactivo(Integer iactivo) {
		this.iactivo = iactivo;
	}

	public Integer getIdclasificacionpadre() {
		return this.idclasificacionpadre;
	}

	public void setIdclasificacionpadre(Integer idclasificacionpadre) {
		this.idclasificacionpadre = idclasificacionpadre;
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

	public List<Usuario> getLstUsuarios() {
		return this.lstUsuarios;
	}

	public void setLstUsuarios(List<Usuario> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}

}