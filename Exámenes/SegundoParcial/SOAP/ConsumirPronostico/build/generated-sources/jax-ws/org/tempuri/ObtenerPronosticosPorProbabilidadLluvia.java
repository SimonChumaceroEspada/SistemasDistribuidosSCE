
package org.tempuri;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="probabilidadLluvia" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
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
    "probabilidadLluvia"
})
@XmlRootElement(name = "ObtenerPronosticosPorProbabilidadLluvia")
public class ObtenerPronosticosPorProbabilidadLluvia {

    protected double probabilidadLluvia;

    /**
     * Obtiene el valor de la propiedad probabilidadLluvia.
     * 
     */
    public double getProbabilidadLluvia() {
        return probabilidadLluvia;
    }

    /**
     * Define el valor de la propiedad probabilidadLluvia.
     * 
     */
    public void setProbabilidadLluvia(double value) {
        this.probabilidadLluvia = value;
    }

}
