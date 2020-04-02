/**
 * 
 */
package com.curso.java.interfaces;


import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * @author Octavio Robleto
 * @see https://orobleto.github.io/octaviorobleto.github.io/
 * 31 mar. 2020
 */

@WebService(name = "TratadoDeCadenas", serviceName = "TratadoDeCadenasServicio", targetNamespace = "https://orobleto.github.io/octaviorobleto.github.io/")

public interface IConvertirCadenas {

	/**
	 * Convierte toda la cadena en mayusculas
	 * 
	 * @param cadena recibe la cadena a convertir
	 */
	@WebMethod
	@WebResult(name = "nuevaCadena")
	public String convertirCadenaMayuscula(@WebParam(name = "cadena") String cadena);

	/**
	 * Convierte toda la cadena en minusculas
	 * 
	 * @param cadena recibe la cadena a convertir
	 */
	@WebMethod
	@WebResult(name = "nuevaCadena")
	public String convertirCadenaMinuscula(@WebParam(name = "cadena") String cadena);

	/**
	 * Convierte la primera letra de la cadena en mayusculas y el resto en
	 * minusculas
	 * 
	 * @param cadena recibe la cadena a convertir
	 */
	@WebMethod
	@WebResult(name = "nuevaCadena")
	public String convertirPrimeraLetraCadenaMayuscula(@WebParam(name = "cadena") String cadena);

	/**
	 * Convierte la primera letra de la cadena en minusculas y el resto en
	 * mayusculas
	 * 
	 * @param cadena recibe la cadena a convertir
	 */
	@WebMethod
	@WebResult(name = "nuevaCadena")
	public String convertirPrimeraLetraCadenaMinuscula(@WebParam(name = "cadena") String cadena);

	/**
	 * Convierte la primera letra de cada palabra de la cadena en mayusculas y el
	 * resto en minusculas
	 * 
	 * @param cadena recibe la cadena a convertir
	 */
	@WebMethod
	@WebResult(name = "nuevaCadena")
	public String convertirCadaPalabraCadenaMayuscula(@WebParam(name = "cadena") String cadena);

	/**
	 * Convierte la primera letra de cada palabra de la cadena en minusculas y el
	 * resto en mayusculas
	 * 
	 * @param cadena recibe la cadena a convertir
	 */
	@WebMethod
	@WebResult(name = "nuevaCadena")
	public String convertirCadaPalabraCadenaMinuscula(@WebParam(name = "cadena") String cadena);

}
