package com.curso.java.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.curo.java._01_WS_Server.TratadoDeCadenas;
import com.curo.java._01_WS_Server.TratadoDeCadenasProxy;



/**
 * @author Octavio Robleto
 * 
 */

@WebServlet(name = "tratadoCadenas", urlPatterns = "/transformar")
public class CadenasServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	TratadoDeCadenas tratadoCadenas;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadenasServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int opcion = Integer.parseInt(request.getParameter("opcion"));
		String cadena = request.getParameter("cadena");

		tratadoCadenas = new TratadoDeCadenasProxy(
				"http://localhost:8080/02_02_WS_WSDL/services/TratadoDeCadenas?wsdl");

		switch (opcion) {
		case 1:
			cadena = tratadoCadenas.convertirCadenaMayuscula(cadena);
			break;
		case 2:
			cadena = tratadoCadenas.convertirCadenaMinuscula(cadena);
			break;
		case 3:
			cadena = tratadoCadenas.convertirCadaPalabraCadenaMayuscula(cadena);
			break;
		case 4:
			cadena = tratadoCadenas.convertirCadaPalabraCadenaMinuscula(cadena);
			break;
		case 5:
			cadena = tratadoCadenas.convertirPrimeraLetraCadenaMayuscula(cadena);
			break;
		case 6:
			cadena = tratadoCadenas.convertirPrimeraLetraCadenaMinuscula(cadena);
			break;
		}
		
		//seteamos el atributo mensaje
		request.setAttribute("cadena", cadena);
			
		//reenviamos la peticion con los objetos request y response
		RequestDispatcher rd = request.getRequestDispatcher("cadenas.jsp");
		rd.forward(request, response);
	}

}
