//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.12.18 alle 11:01:29 AM CET 
//


package com.intesasanpaolo.bear.bear0.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per contatto complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="contatto"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codContatto" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="indAbilitato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "contatto", propOrder = {
    "codContatto",
    "indAbilitato"
})
public class Contatto {

    protected Integer codContatto;
    protected String indAbilitato;

    /**
     * Recupera il valore della proprietà codContatto.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodContatto() {
        return codContatto;
    }

    /**
     * Imposta il valore della proprietà codContatto.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodContatto(Integer value) {
        this.codContatto = value;
    }

    /**
     * Recupera il valore della proprietà indAbilitato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndAbilitato() {
        return indAbilitato;
    }

    /**
     * Imposta il valore della proprietà indAbilitato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndAbilitato(String value) {
        this.indAbilitato = value;
    }

}
