
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="SaludoPruebaResult" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "saludoPruebaResult"
})
@XmlRootElement(name = "SaludoPruebaResponse")
public class SaludoPruebaResponse {

    @XmlElement(name = "SaludoPruebaResult")
    protected String saludoPruebaResult;

    /**
     * Obtiene el valor de la propiedad saludoPruebaResult.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSaludoPruebaResult() {
        return saludoPruebaResult;
    }

    /**
     * Define el valor de la propiedad saludoPruebaResult.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSaludoPruebaResult(String value) {
        this.saludoPruebaResult = value;
    }

}
