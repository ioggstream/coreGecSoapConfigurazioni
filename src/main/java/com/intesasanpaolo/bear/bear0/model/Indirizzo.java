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
 * <p>Classe Java per indirizzo complex type.
 * 
 * <p>Il seguente frammento di schema specifica il contenuto previsto contenuto in questa classe.
 * 
 * <pre>
 * &lt;complexType name="indirizzo"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="codIndrz" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="attnTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="addressDetails" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indAbilitato" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRubRiga" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="codModltInvio" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "indirizzo", propOrder = {
    "codIndrz",
    "attnTo",
    "addressDetails",
    "indAbilitato",
    "codRubRiga",
    "codModltInvio"
})
public class Indirizzo {

    protected Integer codIndrz;
    protected String attnTo;
    protected String addressDetails;
    protected String indAbilitato;
    protected Integer codRubRiga;
    protected Integer codModltInvio;

    /**
     * Recupera il valore della proprietà codIndrz.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodIndrz() {
        return codIndrz;
    }

    /**
     * Imposta il valore della proprietà codIndrz.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodIndrz(Integer value) {
        this.codIndrz = value;
    }

    /**
     * Recupera il valore della proprietà attnTo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttnTo() {
        return attnTo;
    }

    /**
     * Imposta il valore della proprietà attnTo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttnTo(String value) {
        this.attnTo = value;
    }

    /**
     * Recupera il valore della proprietà addressDetails.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressDetails() {
        return addressDetails;
    }

    /**
     * Imposta il valore della proprietà addressDetails.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressDetails(String value) {
        this.addressDetails = value;
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

    /**
     * Recupera il valore della proprietà codRubRiga.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodRubRiga() {
        return codRubRiga;
    }

    /**
     * Imposta il valore della proprietà codRubRiga.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodRubRiga(Integer value) {
        this.codRubRiga = value;
    }

    /**
     * Recupera il valore della proprietà codModltInvio.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCodModltInvio() {
        return codModltInvio;
    }

    /**
     * Imposta il valore della proprietà codModltInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCodModltInvio(Integer value) {
        this.codModltInvio = value;
    }

}
