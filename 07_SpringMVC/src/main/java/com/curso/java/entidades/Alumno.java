package com.curso.java.entidades;

import java.io.Serializable;

public class Alumno implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tipoDoc;
	private String documento;
	private String razonSocial;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * @param tipoDoc
	 * @param documento
	 * @param razonSocial
	 */
	public Alumno(String tipoDoc, String documento, String razonSocial) {
		this.tipoDoc = tipoDoc;
		this.documento = documento;
		this.razonSocial = razonSocial;
	}


	/**
	 * @return the tipoDoc
	 */
	public String getTipoDoc() {
		return tipoDoc;
	}
	/**
	 * @param tipoDoc the tipoDoc to set
	 */
	public void setTipoDoc(String tipoDoc) {
		this.tipoDoc = tipoDoc;
	}
	/**
	 * @return the documento
	 */
	public String getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(String documento) {
		this.documento = documento;
	}
	/**
	 * @return the razonSocial
	 */
	public String getRazonSocial() {
		return razonSocial;
	}
	/**
	 * @param razonSocial the razonSocial to set
	 */
	public void setRazonSocial(String razonSocial) {
		this.razonSocial = razonSocial;
	}
	

}
