package com.api.query.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="\"T_DOMINIO_DOC\"")
public class DominioDoc {
	
		@Id
		@Column (name="\"SE_IDOMINIO_DOC\"")
		private long iddominio;
		@Column (name="\"SE_IPARAM_DOC\"")
		private long idparam;
		@Column (name="\"VC_CODIGO\"")
		private String codigo;
		@Column (name="\"VC_DESC_CORTA\"")
		private String descripcionCorta;
		@Column (name="\"VC_DESC\"")
		private String descripcion;
		
		public DominioDoc() {}
		
		public DominioDoc(long iddominio, long idparam, String codigo, String descripcionCorta, String descripcion) {
			super();
			this.iddominio = iddominio;
			this.idparam = idparam;
			this.codigo = codigo;
			this.descripcionCorta = descripcionCorta;
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

		public long getIddominio() {
			return iddominio;
		}

		public void setIddominio(long iddominio) {
			this.iddominio = iddominio;
		}

		public String getCodigo() {
			return codigo;
		}

		public void setCodigo(String codigo) {
			this.codigo = codigo;
		}

		public String getDescripcionCorta() {
			return descripcionCorta;
		}

		public void setDescripcionCorta(String descripcionCorta) {
			this.descripcionCorta = descripcionCorta;
		}
		
}
