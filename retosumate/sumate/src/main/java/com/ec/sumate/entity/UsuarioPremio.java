package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.Date;


/**
 * The persistent class for the usuarios_premios database table.
 * 
 */
@Entity
@Table(name="usuarios_premios")
public class UsuarioPremio implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="idusuario")
	private int idusuario;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="dfechaganado")
	private Date dfechaganado;

	//bi-directional many-to-one association to Evento
	@ManyToOne
	@JoinColumn(name="idevento")
	private Evento evento;

	//bi-directional many-to-one association to Organizacione
	@ManyToOne
	@JoinColumn(name="idorganizacion")
	private Organizacion organizacion;

	//bi-directional many-to-one association to Premio
	@ManyToOne
	@JoinColumn(name="idpremio")
	private Premio premio;

	//bi-directional many-to-one association to Recompensa
	@ManyToOne
	@JoinColumn(name="idrecompensa")
	private Recompensa recompensa;

	//bi-directional one-to-one association to Usuario
	@OneToOne
	@JoinColumn(name="idusuario")
	private Usuario usuario;

	public UsuarioPremio() {
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public Date getDfechaganado() {
		return this.dfechaganado;
	}

	public void setDfechaganado(Date dfechaganado) {
		this.dfechaganado = dfechaganado;
	}

	public Evento getEvento() {
		return this.evento;
	}

	public void setEvento(Evento evento) {
		this.evento = evento;
	}

	public Organizacion getOrganizacion() {
		return this.organizacion;
	}

	public void setOrganizacion(Organizacion organizacion) {
		this.organizacion = organizacion;
	}

	public Premio getPremio() {
		return this.premio;
	}

	public void setPremio(Premio premio) {
		this.premio = premio;
	}

	public Recompensa getRecompensa() {
		return this.recompensa;
	}

	public void setRecompensa(Recompensa recompensa) {
		this.recompensa = recompensa;
	}

	public Usuario getUsuario() {
		return this.usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

}