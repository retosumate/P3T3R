package com.ec.sumate.spring.model;

import java.sql.Date;


public class Usuario {

	private int idUsuario;
	private String vNombres;
	private String vApellidos;
	private String vEmail;
	private String vLogin;
	private String vContrasenia;
	private int iTipo;
	private int iActivo;
	private Date dFechaCreacion;
	private Date dFechaUltimaModificacion;
	
	public int getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(int idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getvNombres() {
		return vNombres;
	}

	public void setvNombres(String vNombres) {
		this.vNombres = vNombres;
	}

	public String getvApellidos() {
		return vApellidos;
	}

	public void setvApellidos(String vApellidos) {
		this.vApellidos = vApellidos;
	}

	public String getvEmail() {
		return vEmail;
	}

	public void setvEmail(String vEmail) {
		this.vEmail = vEmail;
	}

	public String getvLogin() {
		return vLogin;
	}

	public void setvLogin(String vLogin) {
		this.vLogin = vLogin;
	}

	public String getvContrasenia() {
		return vContrasenia;
	}

	public void setvContrasenia(String vContrasenia) {
		this.vContrasenia = vContrasenia;
	}

	public int getiTipo() {
		return iTipo;
	}

	public void setiTipo(int iTipo) {
		this.iTipo = iTipo;
	}

	public int getiActivo() {
		return iActivo;
	}

	public void setiActivo(int iActivo) {
		this.iActivo = iActivo;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date dFechaCreacion) {
		this.dFechaCreacion = dFechaCreacion;
	}

	public Date getdFechaUltimaModificacion() {
		return dFechaUltimaModificacion;
	}

	public void setdFechaUltimaModificacion(Date dFechaUltimaModificacion) {
		this.dFechaUltimaModificacion = dFechaUltimaModificacion;
	}
}
