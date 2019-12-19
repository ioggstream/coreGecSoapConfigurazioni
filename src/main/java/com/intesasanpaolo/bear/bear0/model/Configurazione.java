//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.12.18 alle 05:14:34 PM CET 
//


package com.intesasanpaolo.bear.bear0.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java per configurazione complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="configurazione"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codSoc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codSistProv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="indCliente" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codMerc" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="codCanale" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="filtroTemplateTradeSummary" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="acronimo" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "configurazione", propOrder = {
    "codSoc",
    "codSistProv",
    "codCliente",
    "indCliente",
    "codMerc",
    "codCanale",
    "filtroTemplateTradeSummary",
    "acronimo"
})
public class Configurazione {

    @XmlElement(required = true)
    protected String codSoc;
    @XmlElement(required = true)
    protected String codSistProv;
    @XmlElement(required = true)
    protected String codCliente;
    @XmlElement(required = true)
    protected String indCliente;
    @XmlElement(required = true)
    protected String codMerc;
    @XmlElement(required = true)
    protected String codCanale;
    @XmlElement(required = true)
    protected String filtroTemplateTradeSummary;
    @XmlElement(required = true)
    protected String acronimo;

    /**
     * Recupera il valore della proprietà codSoc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSoc() {
        return codSoc;
    }

    /**
     * Imposta il valore della proprietà codSoc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSoc(String value) {
        this.codSoc = value;
    }

    /**
     * Recupera il valore della proprietà codSistProv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSistProv() {
        return codSistProv;
    }

    /**
     * Imposta il valore della proprietà codSistProv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSistProv(String value) {
        this.codSistProv = value;
    }

    /**
     * Recupera il valore della proprietà codCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * Imposta il valore della proprietà codCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCliente(String value) {
        this.codCliente = value;
    }

    /**
     * Recupera il valore della proprietà indCliente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCliente() {
        return indCliente;
    }

    /**
     * Imposta il valore della proprietà indCliente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCliente(String value) {
        this.indCliente = value;
    }

    /**
     * Recupera il valore della proprietà codMerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodMerc() {
        return codMerc;
    }

    /**
     * Imposta il valore della proprietà codMerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodMerc(String value) {
        this.codMerc = value;
    }

    /**
     * Recupera il valore della proprietà codCanale.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodCanale() {
        return codCanale;
    }

    /**
     * Imposta il valore della proprietà codCanale.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodCanale(String value) {
        this.codCanale = value;
    }

    /**
     * Recupera il valore della proprietà filtroTemplateTradeSummary.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFiltroTemplateTradeSummary() {
        return filtroTemplateTradeSummary;
    }

    /**
     * Imposta il valore della proprietà filtroTemplateTradeSummary.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFiltroTemplateTradeSummary(String value) {
        this.filtroTemplateTradeSummary = value;
    }

    /**
     * Recupera il valore della proprietà acronimo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAcronimo() {
        return acronimo;
    }

    /**
     * Imposta il valore della proprietà acronimo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAcronimo(String value) {
        this.acronimo = value;
    }

}
