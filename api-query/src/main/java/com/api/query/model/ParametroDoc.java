package com.api.query.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="\"T_PARAMETRO_DOC\"")
public class ParametroDoc {

	@Id
	@Column (name="\"SE_IPARAM_DOC\"")
	private long idparam;
	@Column (name="\"VC_DESC\"")
	private String descripcion;
	
	public ParametroDoc() {}
	public ParametroDoc(long idparam, String descripcion) {
		super();
		this.idparam = idparam;
		this.descripcion = descripcion;
	}
	public long getIdparam() {
		return idparam;
	}
	public void setIdparam(long idparam) {
		this.idparam = idparam;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	
	
	
}
