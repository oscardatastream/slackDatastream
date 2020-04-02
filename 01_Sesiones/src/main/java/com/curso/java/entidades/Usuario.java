/**
 * 
 */
package com.curso.java.entidades;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Octavio Robleto
 * @see https://orobleto.github.io/octaviorobleto.github.io/
 * 
 */

public class Usuario {
	private String usuario;
	private String clave;
	private Integer id;
	static AtomicInteger CANTIDAD_USUARIOS = new AtomicInteger(0);

	/**
	 * @param usuario
	 * @param clave
	 */
	public Usuario(String usuario, String clave) {
		CANTIDAD_USUARIOS.getAndIncrement();
		this.usuario = usuario;
		this.clave = clave;
		this.id = getCantidad(); 
	}

	@Override
	public String toString() {
		return id + "\t" + usuario;
	}

	/**
	 * @return the usuario
	 */
	public String getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario the usuario to set
	 */
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the clave
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * @param clave the clave to set
	 */
	public void setClave(String clave) {
		this.clave = clave;
	}
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	

	/**
	 * @return the cantidad
	 */
	public static int getCantidad() {
		return CANTIDAD_USUARIOS.intValue();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((usuario == null) ? 0 : usuario.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (usuario == null) {
			if (other.usuario != null)
				return false;
		} else if (!usuario.equals(other.usuario))
			return false;
		return true;
	}

}
