/**
 * 
 */
package com.curso.java.entidades;

/**
 * @author Octavio Robleto
 * Clase para crear Usuarios
 */
public class Usuario {
	private String usuario;
	private String clave;

	/**
	 * @param usuario
	 * @param clave
	 */
	public Usuario(String usuario, String clave) {
		this.usuario = usuario;
		this.clave = clave;
	}

	@Override
	public String toString() {
		return "Usuario [usuario=" + usuario + ", clave=" + clave + "]";
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
