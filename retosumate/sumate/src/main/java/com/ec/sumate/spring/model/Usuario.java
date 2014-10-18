package com.ec.sumate.spring.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the usuarios database table.
 * 
 */
@Entity
@Table(name="usuarios")
public class Usuario implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idusuario;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dfechacreacion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dfechamodificacion;

	private int iactivo;

	private int icantidadarticulos;

	private int icantidadbadges;

	private int icantidadpuntos;

	private int itipousuario;

	private String vapellidomaterno;

	private String vapellidopaterno;

	private String varchivoimagen;

	private String vcalle;

	private String vcodigopostal;

	private String vcontrasena;

	private String vemail;

	private String ventrecalles;

	private String vlogin;

	private String vnombres;

	private String vnumexterior;

	private String vnuminterior;

	private String vposicionglobal;

	private String vubicacion;

	//bi-directional many-to-one association to EventosUsuario
	@OneToMany(mappedBy="usuario")
	private List<EventoUsuario> lstEventosUsuarios;

	//bi-directional many-to-many association to Clasificacione
	@ManyToMany
	@JoinTable(
		name="usuarios_clasificaciones"
		, joinColumns={
			@JoinColumn(name="idusuario")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idclasificacion")
			}
		)
	private List<Clasificacion> clasificaciones;

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

	//bi-directional many-to-one association to Perfilacceso
	@ManyToOne
	@JoinColumn(name="idperfilacceso")
	private Perfilacceso perfilacceso;

	//bi-directional one-to-one association to UsuariosPremio
	@OneToOne(mappedBy="usuario")
	private UsuarioPremio lstUsuariosPremios;

	public Usuario() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
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

	public int getIcantidadarticulos() {
		return this.icantidadarticulos;
	}

	public void setIcantidadarticulos(int icantidadarticulos) {
		this.icantidadarticulos = icantidadarticulos;
	}

	public int getIcantidadbadges() {
		return this.icantidadbadges;
	}

	public void setIcantidadbadges(int icantidadbadges) {
		this.icantidadbadges = icantidadbadges;
	}

	public int getIcantidadpuntos() {
		return this.icantidadpuntos;
	}

	public void setIcantidadpuntos(int icantidadpuntos) {
		this.icantidadpuntos = icantidadpuntos;
	}

	public int getItipousuario() {
		return this.itipousuario;
	}

	public void setItipousuario(int itipousuario) {
		this.itipousuario = itipousuario;
	}

	public String getVapellidomaterno() {
		return this.vapellidomaterno;
	}

	public void setVapellidomaterno(String vapellidomaterno) {
		this.vapellidomaterno = vapellidomaterno;
	}

	public String getVapellidopaterno() {
		return this.vapellidopaterno;
	}

	public void setVapellidopaterno(String vapellidopaterno) {
		this.vapellidopaterno = vapellidopaterno;
	}

	public String getVarchivoimagen() {
		return this.varchivoimagen;
	}

	public void setVarchivoimagen(String varchivoimagen) {
		this.varchivoimagen = varchivoimagen;
	}

	public String getVcalle() {
		return this.vcalle;
	}

	public void setVcalle(String vcalle) {
		this.vcalle = vcalle;
	}

	public String getVcodigopostal() {
		return this.vcodigopostal;
	}

	public void setVcodigopostal(String vcodigopostal) {
		this.vcodigopostal = vcodigopostal;
	}

	public String getVcontrasena() {
		return this.vcontrasena;
	}

	public void setVcontrasena(String vcontrasena) {
		this.vcontrasena = vcontrasena;
	}

	public String getVemail() {
		return this.vemail;
	}

	public void setVemail(String vemail) {
		this.vemail = vemail;
	}

	public String getVentrecalles() {
		return this.ventrecalles;
	}

	public void setVentrecalles(String ventrecalles) {
		this.ventrecalles = ventrecalles;
	}

	public String getVlogin() {
		return this.vlogin;
	}

	public void setVlogin(String vlogin) {
		this.vlogin = vlogin;
	}

	public String getVnombres() {
		return this.vnombres;
	}

	public void setVnombres(String vnombres) {
		this.vnombres = vnombres;
	}

	public String getVnumexterior() {
		return this.vnumexterior;
	}

	public void setVnumexterior(String vnumexterior) {
		this.vnumexterior = vnumexterior;
	}

	public String getVnuminterior() {
		return this.vnuminterior;
	}

	public void setVnuminterior(String vnuminterior) {
		this.vnuminterior = vnuminterior;
	}

	public String getVposicionglobal() {
		return this.vposicionglobal;
	}

	public void setVposicionglobal(String vposicionglobal) {
		this.vposicionglobal = vposicionglobal;
	}

	public String getVubicacion() {
		return this.vubicacion;
	}

	public void setVubicacion(String vubicacion) {
		this.vubicacion = vubicacion;
	}

	public List<EventoUsuario> getLstEventosUsuarios() {
		return this.lstEventosUsuarios;
	}

	public void setLstEventosUsuarios(List<EventoUsuario> lstEventosUsuarios) {
		this.lstEventosUsuarios = lstEventosUsuarios;
	}

	public EventoUsuario addLstEventosUsuario(EventoUsuario lstEventosUsuario) {
		getLstEventosUsuarios().add(lstEventosUsuario);
		lstEventosUsuario.setUsuario(this);

		return lstEventosUsuario;
	}

	public EventoUsuario removeLstEventosUsuario(EventoUsuario lstEventosUsuario) {
		getLstEventosUsuarios().remove(lstEventosUsuario);
		lstEventosUsuario.setUsuario(null);

		return lstEventosUsuario;
	}

	public List<Clasificacion> getClasificaciones() {
		return this.clasificaciones;
	}

	public void setClasificaciones(List<Clasificacion> clasificaciones) {
		this.clasificaciones = clasificaciones;
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

	public Perfilacceso getPerfilacceso() {
		return this.perfilacceso;
	}

	public void setPerfilacceso(Perfilacceso perfilacceso) {
		this.perfilacceso = perfilacceso;
	}

	public UsuarioPremio getLstUsuariosPremios() {
		return this.lstUsuariosPremios;
	}

	public void setLstUsuariosPremios(UsuarioPremio lstUsuariosPremios) {
		this.lstUsuariosPremios = lstUsuariosPremios;
	}

}