package com.ec.sumate.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the recompensas_premios database table.
 * 
 */
@Embeddable
public class RecompensaPremioPK implements Serializable {
	// default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name = "idrecompensa")
	private int idrecompensa;

	@Column(name = "idrecompensapremio")
	private int ideventorecompensa;

	@Column(name = "idpremio")
	private int idpremio;

	public RecompensaPremioPK() {
	}

	public int getIdrecompensa() {
		return this.idrecompensa;
	}

	public void setIdrecompensa(int idrecompensa) {
		this.idrecompensa = idrecompensa;
	}

	public int getIdeventorecompensa() {
		return this.ideventorecompensa;
	}

	public void setIdeventorecompensa(int ideventorecompensa) {
		this.ideventorecompensa = ideventorecompensa;
	}

	public int getIdpremio() {
		return this.idpremio;
	}

	public void setIdpremio(int idpremio) {
		this.idpremio = idpremio;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof RecompensaPremioPK)) {
			return false;
		}
		RecompensaPremioPK castOther = (RecompensaPremioPK) other;
		return (this.idrecompensa == castOther.idrecompensa)
				&& (this.ideventorecompensa == castOther.ideventorecompensa)
				&& (this.idpremio == castOther.idpremio);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.idrecompensa;
		hash = hash * prime + this.ideventorecompensa;
		hash = hash * prime + this.idpremio;

		return hash;
	}
}