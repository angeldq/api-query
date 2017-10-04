package com.api.query.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="\"T_TIPO_DOC\"")
public class TipoDocumento {
	
	@Id
	@Column (name="\"SE_ITIPO_DOC\"")
	private long idtipoDoc;
	@Column (name="\"SE_IIDIOMA\"")
	private int idioma;
	@Column (name="\"IN_CODIGO\"")
	private int codigo;
	@Column (name="\"VC_DESC\"")
	private String descripcion;
	
	public TipoDocumento() {}
	
	public TipoDocumento(long idtipoDoc, int idioma, int codigo, String descripcion) {
		super();
		this.idtipoDoc = idtipoDoc;
		this.idioma = idioma;
		this.codigo = codigo;
		this.descripcion = descripcion;
	}



	public long getIdtipoDoc() {
		return idtipoDoc;
	}

	public void setIdtipoDoc(long idtipoDoc) {
		this.idtipoDoc = idtipoDoc;
	}

	public long getIdioma() {
		return idioma;
	}

	public void setIdioma(int idioma) {
		this.idioma = idioma;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	

}
