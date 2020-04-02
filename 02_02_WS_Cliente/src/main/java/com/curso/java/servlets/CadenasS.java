package com.curso.java.servlets;

import java.io.IOException;
import java.net.URL;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

import com.curso.java.servicios.ConvertirCadenasService;
import com.curso.java.servicios.TratadoDeCadenas;

/**
 * @author Octavio Robleto
 * 
 */

@WebServlet(name = "tratadoCadenas", urlPatterns = "/transformar")
public class CadenasS extends HttpServlet {
	private static final long serialVersionUID = 1L;
	final static Logger logger = Logger.getLogger(CadenasS.class);
	TratadoDeCadenas tratadoCadenas;
	ConvertirCadenasService convertirCadenasService;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CadenasS() {
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
	
		URL URL_WSDL = new URL("http://localhost:8080/02_01_WS_Server/services/ConvertirCadenas?wsdl");
		
		logger.info("URL WSDL ->" + URL_WSDL.toString());
		logger.info("Cadena Original ->" + cadena);
		
		convertirCadenasService = new ConvertirCadenasService(URL_WSDL);

		tratadoCadenas = convertirCadenasService.getConvertirCadenasPort();

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

		logger.info("Cadena Transformada ->" + cadena);
		// seteamos el atributo mensaje
		request.setAttribute("cadena", cadena);

		// reenviamos la peticion con los objetos request y response
		RequestDispatcher rd = request.getRequestDispatcher("cadenas.jsp");
		rd.forward(request, response);
	}

}
