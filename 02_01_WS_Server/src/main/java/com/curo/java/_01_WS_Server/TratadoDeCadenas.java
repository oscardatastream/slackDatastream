/**
 * 
 */
package com.curo.java._01_WS_Server;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Octavio Robleto Clase trabajar cadenas de caracteres
 */

@WebService(name = "TratadoDeCadenas" ,serviceName = "TratadoDeCadenasServicio",targetNamespace = "http://octaviorobleto.curso/TratadoDeCadenasServicio")
public class TratadoDeCadenas {

	@WebMethod
	@WebResult(name = "cadenaMayuscula")
	public String convertirCadenaMayuscula(@WebParam(name = "cadena") String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.toUpperCase();
		}

	}

	@WebMethod
	@WebResult(name = "cadenaMinuscula")
	public String convertirCadenaMinuscula(@WebParam(name = "cadena") String cadena) {

		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.toLowerCase();
		}
	}

	@WebMethod
	@WebResult(name = "cadenaPrimeraLetraMinuscula")
	public String convertirPrimeraLetraCadenaMinuscula(@WebParam(name = "cadena") String cadena) {

		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.substring(0, 1).toLowerCase() + cadena.substring(1, cadena.length()).toUpperCase();
		}
	}

	@WebMethod
	@WebResult(name = "cadenaPrimeraLetraMayuscula")
	public String convertirPrimeraLetraCadenaMayuscula(@WebParam(name = "cadena") String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.substring(0, 1).toUpperCase() + cadena.substring(1, cadena.length()).toLowerCase();
		}
	}

	@WebMethod
	@WebResult(name = "cadenaCadaPalabraMayuscula")
	public String convertirCadaPalabraCadenaMayuscula(@WebParam(name = "cadena") String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			String[] cadenaDividida = cadena.split(" ");
			cadena = "";
			for (String palabra : cadenaDividida) {
				cadena += convertirPrimeraLetraCadenaMayuscula(palabra) + " ";
			}
			return cadena.trim();
		}
	}

	@WebMethod
	@WebResult(name = "cadenaCadaPalabraMainuscula")
	public String convertirCadaPalabraCadenaMinuscula(@WebParam(name = "cadena") String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			String[] cadenaDividida = cadena.split(" ");
			cadena = "";
			for (String palabra : cadenaDividida) {
				cadena += convertirPrimeraLetraCadenaMinuscula(palabra) + " ";
			}
			return cadena.trim();
		}

	}
}
