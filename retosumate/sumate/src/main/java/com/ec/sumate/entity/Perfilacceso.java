package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.List;


/**
 * The persistent class for the perfilacceso database table.
 * 
 */
@Entity
public class Perfilacceso implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idperfilacceso")
	private int idperfilacceso;

	@Column(name="iactivo")
	private int iactivo;

	@Column(name="vdescripcion")
	private String vdescripcion;

	//bi-directional many-to-one association to Usuario
	@OneToMany(mappedBy="perfilacceso")
	private List<Usuario> lstUsuarios;

	public Perfilacceso() {
	}

	public int getIdperfilacceso() {
		return this.idperfilacceso;
	}

	public void setIdperfilacceso(int idperfilacceso) {
		this.idperfilacceso = idperfilacceso;
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

	public List<Usuario> getLstUsuarios() {
		return this.lstUsuarios;
	}

	public void setLstUsuarios(List<Usuario> lstUsuarios) {
		this.lstUsuarios = lstUsuarios;
	}

	public Usuario addLstUsuario(Usuario lstUsuario) {
		getLstUsuarios().add(lstUsuario);
		lstUsuario.setPerfilacceso(this);

		return lstUsuario;
	}

	public Usuario removeLstUsuario(Usuario lstUsuario) {
		getLstUsuarios().remove(lstUsuario);
		lstUsuario.setPerfilacceso(null);

		return lstUsuario;
	}

}