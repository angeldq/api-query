package com.api.query.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="\"T_MONEDA\"")
public class Moneda {
	
	@Id
	@Column(name="\"SE_IMONEDA\"")
	private long idmoneda;
	@Column(name="\"CH_CODIGO\"")
	private String codigo;
	@Column(name="\"SE_IIDIOMA\"")
	private int idioma;
	
	public Moneda() {}
		
	public Moneda(long idmoneda, String codigo) {
		super();
		this.idmoneda = idmoneda;
		this.codigo = codigo;
	}

	public long getIdmoneda() {
		return idmoneda;
	}
	public int getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	public void setIdmoneda(long idmoneda) {
		this.idmoneda = idmoneda;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	
}
