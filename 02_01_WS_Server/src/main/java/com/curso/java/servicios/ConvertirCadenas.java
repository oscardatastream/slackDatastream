/**
 * 
 */
package com.curso.java.servicios;

import com.curso.java.interfaces.IConvertirCadenas;

/**
 * @author Octavio Robleto
 * @see https://orobleto.github.io/octaviorobleto.github.io/
 * 31 mar. 2020
 */
public class ConvertirCadenas implements IConvertirCadenas{
	@Override
	public String convertirCadenaMayuscula(String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.toUpperCase();
		}
	}

	@Override
	public String convertirCadenaMinuscula(String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.toLowerCase();
		}
	}

	@Override
	public String convertirPrimeraLetraCadenaMayuscula(String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.substring(0, 1).toUpperCase() + cadena.substring(1, cadena.length()).toLowerCase();
		}
	}

	@Override
	public String convertirPrimeraLetraCadenaMinuscula(String cadena) {
		if (cadena == null || cadena.isEmpty()) {
			return "";
		} else {
			return cadena.substring(0, 1).toLowerCase() + cadena.substring(1, cadena.length()).toUpperCase();
		}
	}

	@Override
	public String convertirCadaPalabraCadenaMayuscula(String cadena) {
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

	@Override
	public String convertirCadaPalabraCadenaMinuscula(String cadena) {
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
