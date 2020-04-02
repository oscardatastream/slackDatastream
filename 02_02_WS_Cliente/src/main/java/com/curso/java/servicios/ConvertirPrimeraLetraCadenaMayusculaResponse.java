
package com.curso.java.servicios;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para convertirPrimeraLetraCadenaMayusculaResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="convertirPrimeraLetraCadenaMayusculaResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="nuevaCadena" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convertirPrimeraLetraCadenaMayusculaResponse",namespace =  "convertirPrimeraLetraCadenaMayusculaResponse", propOrder = {
    "nuevaCadena"
})
public class ConvertirPrimeraLetraCadenaMayusculaResponse {

    protected String nuevaCadena;

    /**
     * Obtiene el valor de la propiedad nuevaCadena.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNuevaCadena() {
        return nuevaCadena;
    }

    /**
     * Define el valor de la propiedad nuevaCadena.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuevaCadena(String value) {
        this.nuevaCadena = value;
    }

}
