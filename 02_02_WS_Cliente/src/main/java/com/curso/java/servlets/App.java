/**
 * 
 */
package com.curso.java.servlets;

import java.net.MalformedURLException;
import java.net.URL;

import com.curso.java.servicios.ConvertirCadenasService;
import com.curso.java.servicios.TratadoDeCadenas;

/**
 * @author Octavio Robleto
 * @see https://orobleto.github.io/octaviorobleto.github.io/
 * 2 abr. 2020
 */
public class App {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			URL URL_WSDL= new URL("http://localhost:8080/02_01_WS_Server/services/ConvertirCadenas?wsdl");
			TratadoDeCadenas tratadoCadenas;
			ConvertirCadenasService convertirCadenasService = new ConvertirCadenasService(URL_WSDL);
			tratadoCadenas = convertirCadenasService.getConvertirCadenasPort();
			System.out.println(tratadoCadenas.convertirCadaPalabraCadenaMayuscula("hola jj"));
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	

	}

}
