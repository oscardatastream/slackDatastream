package com.curso.java.servlets;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.curso.java.entidades.Usuario;

/**
 * @author Octavio Robleto
 * 
 */

@WebServlet(name = "validacion", urlPatterns = "/sesiones")
public class Validacion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Validacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void principal(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		boolean iniciar = Boolean.parseBoolean( request.getParameter("iniciar"));
		HttpSession sesionUsuario = request.getSession();
		
		if (iniciar) {
			String usuario = request.getParameter("usuario");
			String clave = request.getParameter("clave");

			
			
			if (existeUsuario(usuario, clave)) {
				sesionUsuario.setAttribute("haySesion", "si");
				sesionUsuario.setAttribute("sesionUsuario", new Usuario(usuario, clave));
				response.sendRedirect("bienvenido.jsp");
			}else {
				sesionUsuario.setAttribute("haySesion", "no");
				response.sendRedirect("index.jsp");
			}

		}else {
			sesionUsuario.invalidate();
			response.sendRedirect("index.jsp");
		}
		
		


	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		principal(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		principal(request, response);
	}

	private boolean existeUsuario(String usuario, String clave) {

		boolean existe = false;

		for (Usuario usuarioTMP : usuariosTMP()) {
			if (usuarioTMP.getUsuario().equals(usuario) && usuarioTMP.getClave().equals(clave)) {
				existe = true;
				break;
			}
		}
		return existe;

	}
	
	private List<Usuario> usuariosTMP(){
		List<Usuario> listaUsuarios = new ArrayList<>();
		listaUsuarios.add(new Usuario("administrador", "1234"));
		listaUsuarios.add(new Usuario("usuario1", "9876"));
		listaUsuarios.add(new Usuario("usuario2", "8566"));
		listaUsuarios.add(new Usuario("usuario3", "1588"));
		listaUsuarios.add(new Usuario("usuario4", "0125"));
		
		return listaUsuarios;
	}

}
