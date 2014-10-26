package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;
import java.util.List;


/**
 * The persistent class for the eventos database table.
 * 
 */
@Entity
@Table(name="eventos")
public class Evento implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idevento")
	private int idevento;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechacreacion")
	private Date dfechacreacion;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechafin")
	private Date dfechafin;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechainicio")
	private Date dfechainicio;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechamodificacion")
	private Date dfechamodificacion;

	@Column(name="iactivo")
	private int iactivo;

	@Column(name="icapacidadmaxvoluntarios")
	private int icapacidadmaxvoluntarios;

	@Column(name="icapacidadminvoluntarios")
	private int icapacidadminvoluntarios;

	@Column(name="ideventopadre")
	private int ideventopadre;

	@Column(name="iestatus")
	private int iestatus;

	@Column(name="iobjetivobenficiados")
	private int iobjetivobenficiados;

	@Column(name="itipo")
	private int itipo;

	@Column(name="itotalbeneficiados")
	private int itotalbeneficiados;

	@Column(name="itotalvoluntarios")
	private int itotalvoluntarios;

	@Column(name="vdescripcion")
	private String vdescripcion;

	@Column(name="vposicionglobal")
	private String vposicionglobal;

	@Column(name="vresumen")
	private String vresumen;

	@Column(name="vsubtitulo")
	private String vsubtitulo;

	@Column(name="vtitulo")
	private String vtitulo;

	@Column(name="vubicacion")
	private String vubicacion;

	//bi-directional many-to-many association to Clasificacione
	@ManyToMany
	@JoinTable(
		name="eventos_clasificaciones"
		, joinColumns={
			@JoinColumn(name="idevento")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idclasificacion")
			}
		)
	private List<Clasificacion> lstClasificaciones;

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

	//bi-directional many-to-one association to Organizacione
	@ManyToOne
	@JoinColumn(name="idorganizacion")
	private Organizacion organizacion;

	//bi-directional many-to-one association to Pais
	@ManyToOne
	@JoinColumn(name="idpais")
	private Pais pais;

	//bi-directional many-to-many association to Recompensa
	@ManyToMany
	@JoinTable(
		name="eventos_recompensas"
		, joinColumns={
			@JoinColumn(name="idevento")
			}
		, inverseJoinColumns={
			@JoinColumn(name="idrecompensa")
			}
		)
	private List<Recompensa> recompensas;

	//bi-directional one-to-one association to EventosMedia
	@OneToOne(mappedBy="evento")
	private EventoMedia lstEventosMedia;

	//bi-directional many-to-one association to EventosUsuario
	@OneToMany(mappedBy="evento")
	private List<EventoUsuario> lstEventosUsuarios;

	//bi-directional many-to-one association to UsuariosPremio
	@OneToMany(mappedBy="evento")
	private List<UsuarioPremio> lstUsuariosPremios;

	public Evento() {
	}

	public int getIdevento() {
		return this.idevento;
	}

	public void setIdevento(int idevento) {
		this.idevento = idevento;
	}

	public Date getDfechacreacion() {
		return this.dfechacreacion;
	}

	public void setDfechacreacion(Date dfechacreacion) {
		this.dfechacreacion = dfechacreacion;
	}

	public Date getDfechafin() {
		return this.dfechafin;
	}

	public void setDfechafin(Date dfechafin) {
		this.dfechafin = dfechafin;
	}

	public Date getDfechainicio() {
		return this.dfechainicio;
	}

	public void setDfechainicio(Date dfechainicio) {
		this.dfechainicio = dfechainicio;
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

	public int getIcapacidadmaxvoluntarios() {
		return this.icapacidadmaxvoluntarios;
	}

	public void setIcapacidadmaxvoluntarios(int icapacidadmaxvoluntarios) {
		this.icapacidadmaxvoluntarios = icapacidadmaxvoluntarios;
	}

	public int getIcapacidadminvoluntarios() {
		return this.icapacidadminvoluntarios;
	}

	public void setIcapacidadminvoluntarios(int icapacidadminvoluntarios) {
		this.icapacidadminvoluntarios = icapacidadminvoluntarios;
	}

	public int getIdeventopadre() {
		return this.ideventopadre;
	}

	public void setIdeventopadre(int ideventopadre) {
		this.ideventopadre = ideventopadre;
	}

	public int getIestatus() {
		return this.iestatus;
	}

	public void setIestatus(int iestatus) {
		this.iestatus = iestatus;
	}

	public int getIobjetivobenficiados() {
		return this.iobjetivobenficiados;
	}

	public void setIobjetivobenficiados(int iobjetivobenficiados) {
		this.iobjetivobenficiados = iobjetivobenficiados;
	}

	public int getItipo() {
		return this.itipo;
	}

	public void setItipo(int itipo) {
		this.itipo = itipo;
	}

	public int getItotalbeneficiados() {
		return this.itotalbeneficiados;
	}

	public void setItotalbeneficiados(int itotalbeneficiados) {
		this.itotalbeneficiados = itotalbeneficiados;
	}

	public int getItotalvoluntarios() {
		return this.itotalvoluntarios;
	}

	public void setItotalvoluntarios(int itotalvoluntarios) {
		this.itotalvoluntarios = itotalvoluntarios;
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

	public String getVresumen() {
		return this.vresumen;
	}

	public void setVresumen(String vresumen) {
		this.vresumen = vresumen;
	}

	public String getVsubtitulo() {
		return this.vsubtitulo;
	}

	public void setVsubtitulo(String vsubtitulo) {
		this.vsubtitulo = vsubtitulo;
	}

	public String getVtitulo() {
		return this.vtitulo;
	}

	public void setVtitulo(String vtitulo) {
		this.vtitulo = vtitulo;
	}

	public String getVubicacion() {
		return this.vubicacion;
	}

	public void setVubicacion(String vubicacion) {
		this.vubicacion = vubicacion;
	}

	public List<Clasificacion> getLstClasificaciones() {
		return this.lstClasificaciones;
	}

	public void setLstClasificaciones(List<Clasificacion> lstClasificaciones) {
		this.lstClasificaciones = lstClasificaciones;
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

	public Organizacion getOrganizacion() {
		return this.organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}

	public Pais getPais() {
		return this.pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public List<Recompensa> getRecompensas() {
		return this.recompensas;
	}

	public void setRecompensas(List<Recompensa> recompensas) {
		this.recompensas = recompensas;
	}

	public EventoMedia getLstEventosMedia() {
		return this.lstEventosMedia;
	}

	public void setLstEventosMedia(EventoMedia lstEventosMedia) {
		this.lstEventosMedia = lstEventosMedia;
	}

	public List<EventoUsuario> getLstEventosUsuarios() {
		return this.lstEventosUsuarios;
	}

	public void setLstEventosUsuarios(List<EventoUsuario> lstEventosUsuarios) {
		this.lstEventosUsuarios = lstEventosUsuarios;
	}

	public EventoUsuario addLstEventosUsuario(EventoUsuario lstEventosUsuario) {
		getLstEventosUsuarios().add(lstEventosUsuario);
		lstEventosUsuario.setEvento(this);

		return lstEventosUsuario;
	}

	public EventoUsuario removeLstEventosUsuario(EventoUsuario lstEventosUsuario) {
		getLstEventosUsuarios().remove(lstEventosUsuario);
		lstEventosUsuario.setEvento(null);

		return lstEventosUsuario;
	}

	public List<UsuarioPremio> getLstUsuariosPremios() {
		return this.lstUsuariosPremios;
	}

	public void setLstUsuariosPremios(List<UsuarioPremio> lstUsuariosPremios) {
		this.lstUsuariosPremios = lstUsuariosPremios;
	}

	public UsuarioPremio addLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().add(lstUsuariosPremio);
		lstUsuariosPremio.setEvento(this);

		return lstUsuariosPremio;
	}

	public UsuarioPremio removeLstUsuariosPremio(UsuarioPremio lstUsuariosPremio) {
		getLstUsuariosPremios().remove(lstUsuariosPremio);
		lstUsuariosPremio.setEvento(null);

		return lstUsuariosPremio;
	}

}