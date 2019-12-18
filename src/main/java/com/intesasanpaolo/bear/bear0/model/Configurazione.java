//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.12.18 alle 11:54:44 AM CET 
//


package com.intesasanpaolo.bear.bear0.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSoc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConfig" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtaInizValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtaCanc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaMercati" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="flagMultimerc" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaTemplate" type="{http://www.w3.org/2001/XMLSchema}int" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="codConto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indCsv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indMulti" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codConfigTipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codRapp" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSistProv" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desDest" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="note" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desMitt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaTipoLiv1" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaContatti" type="{}contatto" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="tmsUpdate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codUtente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indPregresso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="oggetto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codSogg" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indSsiExt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codCliente" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indMhub" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="listaIndirizzi" type="{}indirizzo" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="listaCanali" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/&gt;
 *         &lt;element name="indSsiInt" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="flagStor" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="codFirma" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indInvio" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="indUffOwn" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="tmsInsert" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="desBreve" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dtaFineValid" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="configVersion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
    "id",
    "codSoc",
    "codConfig",
    "dtaInizValid",
    "dtaCanc",
    "listaMercati",
    "flagMultimerc",
    "listaTemplate",
    "codConto",
    "indCsv",
    "indMulti",
    "codConfigTipo",
    "codRapp",
    "codSistProv",
    "desDest",
    "note",
    "desMitt",
    "listaTipoLiv1",
    "listaContatti",
    "tmsUpdate",
    "codUtente",
    "indPregresso",
    "indValid",
    "oggetto",
    "codSogg",
    "indSsiExt",
    "codCliente",
    "indMhub",
    "listaIndirizzi",
    "listaCanali",
    "indSsiInt",
    "flagStor",
    "codFirma",
    "indInvio",
    "indUffOwn",
    "tmsInsert",
    "desBreve",
    "dtaFineValid",
    "configVersion"
})
public class Configurazione {

    protected String id;
    protected String codSoc;
    protected String codConfig;
    protected String dtaInizValid;
    protected String dtaCanc;
    protected List<String> listaMercati;
    protected String flagMultimerc;
    @XmlElement(type = Integer.class)
    protected List<Integer> listaTemplate;
    protected String codConto;
    protected String indCsv;
    protected String indMulti;
    protected String codConfigTipo;
    protected String codRapp;
    protected String codSistProv;
    protected String desDest;
    protected String note;
    protected String desMitt;
    protected List<String> listaTipoLiv1;
    protected List<Contatto> listaContatti;
    protected String tmsUpdate;
    protected String codUtente;
    protected String indPregresso;
    protected String indValid;
    protected String oggetto;
    protected String codSogg;
    protected String indSsiExt;
    protected String codCliente;
    protected String indMhub;
    protected List<Indirizzo> listaIndirizzi;
    protected List<String> listaCanali;
    protected String indSsiInt;
    protected String flagStor;
    protected String codFirma;
    protected String indInvio;
    protected String indUffOwn;
    protected String tmsInsert;
    protected String desBreve;
    protected String dtaFineValid;
    protected String configVersion;

    /**
     * Recupera il valore della proprietà id.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Imposta il valore della proprietà id.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

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
     * Recupera il valore della proprietà codConfig.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConfig() {
        return codConfig;
    }

    /**
     * Imposta il valore della proprietà codConfig.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConfig(String value) {
        this.codConfig = value;
    }

    /**
     * Recupera il valore della proprietà dtaInizValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtaInizValid() {
        return dtaInizValid;
    }

    /**
     * Imposta il valore della proprietà dtaInizValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtaInizValid(String value) {
        this.dtaInizValid = value;
    }

    /**
     * Recupera il valore della proprietà dtaCanc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtaCanc() {
        return dtaCanc;
    }

    /**
     * Imposta il valore della proprietà dtaCanc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtaCanc(String value) {
        this.dtaCanc = value;
    }

    /**
     * Gets the value of the listaMercati property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaMercati property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaMercati().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaMercati() {
        if (listaMercati == null) {
            listaMercati = new ArrayList<String>();
        }
        return this.listaMercati;
    }

    /**
     * Recupera il valore della proprietà flagMultimerc.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagMultimerc() {
        return flagMultimerc;
    }

    /**
     * Imposta il valore della proprietà flagMultimerc.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagMultimerc(String value) {
        this.flagMultimerc = value;
    }

    /**
     * Gets the value of the listaTemplate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTemplate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTemplate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getListaTemplate() {
        if (listaTemplate == null) {
            listaTemplate = new ArrayList<Integer>();
        }
        return this.listaTemplate;
    }

    /**
     * Recupera il valore della proprietà codConto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConto() {
        return codConto;
    }

    /**
     * Imposta il valore della proprietà codConto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConto(String value) {
        this.codConto = value;
    }

    /**
     * Recupera il valore della proprietà indCsv.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndCsv() {
        return indCsv;
    }

    /**
     * Imposta il valore della proprietà indCsv.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndCsv(String value) {
        this.indCsv = value;
    }

    /**
     * Recupera il valore della proprietà indMulti.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndMulti() {
        return indMulti;
    }

    /**
     * Imposta il valore della proprietà indMulti.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndMulti(String value) {
        this.indMulti = value;
    }

    /**
     * Recupera il valore della proprietà codConfigTipo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodConfigTipo() {
        return codConfigTipo;
    }

    /**
     * Imposta il valore della proprietà codConfigTipo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodConfigTipo(String value) {
        this.codConfigTipo = value;
    }

    /**
     * Recupera il valore della proprietà codRapp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodRapp() {
        return codRapp;
    }

    /**
     * Imposta il valore della proprietà codRapp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodRapp(String value) {
        this.codRapp = value;
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
     * Recupera il valore della proprietà desDest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesDest() {
        return desDest;
    }

    /**
     * Imposta il valore della proprietà desDest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesDest(String value) {
        this.desDest = value;
    }

    /**
     * Recupera il valore della proprietà note.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNote() {
        return note;
    }

    /**
     * Imposta il valore della proprietà note.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNote(String value) {
        this.note = value;
    }

    /**
     * Recupera il valore della proprietà desMitt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesMitt() {
        return desMitt;
    }

    /**
     * Imposta il valore della proprietà desMitt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesMitt(String value) {
        this.desMitt = value;
    }

    /**
     * Gets the value of the listaTipoLiv1 property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaTipoLiv1 property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaTipoLiv1().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaTipoLiv1() {
        if (listaTipoLiv1 == null) {
            listaTipoLiv1 = new ArrayList<String>();
        }
        return this.listaTipoLiv1;
    }

    /**
     * Gets the value of the listaContatti property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaContatti property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaContatti().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Contatto }
     * 
     * 
     */
    public List<Contatto> getListaContatti() {
        if (listaContatti == null) {
            listaContatti = new ArrayList<Contatto>();
        }
        return this.listaContatti;
    }

    /**
     * Recupera il valore della proprietà tmsUpdate.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmsUpdate() {
        return tmsUpdate;
    }

    /**
     * Imposta il valore della proprietà tmsUpdate.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmsUpdate(String value) {
        this.tmsUpdate = value;
    }

    /**
     * Recupera il valore della proprietà codUtente.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodUtente() {
        return codUtente;
    }

    /**
     * Imposta il valore della proprietà codUtente.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodUtente(String value) {
        this.codUtente = value;
    }

    /**
     * Recupera il valore della proprietà indPregresso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndPregresso() {
        return indPregresso;
    }

    /**
     * Imposta il valore della proprietà indPregresso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndPregresso(String value) {
        this.indPregresso = value;
    }

    /**
     * Recupera il valore della proprietà indValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndValid() {
        return indValid;
    }

    /**
     * Imposta il valore della proprietà indValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndValid(String value) {
        this.indValid = value;
    }

    /**
     * Recupera il valore della proprietà oggetto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOggetto() {
        return oggetto;
    }

    /**
     * Imposta il valore della proprietà oggetto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOggetto(String value) {
        this.oggetto = value;
    }

    /**
     * Recupera il valore della proprietà codSogg.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodSogg() {
        return codSogg;
    }

    /**
     * Imposta il valore della proprietà codSogg.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodSogg(String value) {
        this.codSogg = value;
    }

    /**
     * Recupera il valore della proprietà indSsiExt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndSsiExt() {
        return indSsiExt;
    }

    /**
     * Imposta il valore della proprietà indSsiExt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndSsiExt(String value) {
        this.indSsiExt = value;
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
     * Recupera il valore della proprietà indMhub.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndMhub() {
        return indMhub;
    }

    /**
     * Imposta il valore della proprietà indMhub.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndMhub(String value) {
        this.indMhub = value;
    }

    /**
     * Gets the value of the listaIndirizzi property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaIndirizzi property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaIndirizzi().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Indirizzo }
     * 
     * 
     */
    public List<Indirizzo> getListaIndirizzi() {
        if (listaIndirizzi == null) {
            listaIndirizzi = new ArrayList<Indirizzo>();
        }
        return this.listaIndirizzi;
    }

    /**
     * Gets the value of the listaCanali property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listaCanali property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListaCanali().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListaCanali() {
        if (listaCanali == null) {
            listaCanali = new ArrayList<String>();
        }
        return this.listaCanali;
    }

    /**
     * Recupera il valore della proprietà indSsiInt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndSsiInt() {
        return indSsiInt;
    }

    /**
     * Imposta il valore della proprietà indSsiInt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndSsiInt(String value) {
        this.indSsiInt = value;
    }

    /**
     * Recupera il valore della proprietà flagStor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlagStor() {
        return flagStor;
    }

    /**
     * Imposta il valore della proprietà flagStor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlagStor(String value) {
        this.flagStor = value;
    }

    /**
     * Recupera il valore della proprietà codFirma.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodFirma() {
        return codFirma;
    }

    /**
     * Imposta il valore della proprietà codFirma.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodFirma(String value) {
        this.codFirma = value;
    }

    /**
     * Recupera il valore della proprietà indInvio.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndInvio() {
        return indInvio;
    }

    /**
     * Imposta il valore della proprietà indInvio.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndInvio(String value) {
        this.indInvio = value;
    }

    /**
     * Recupera il valore della proprietà indUffOwn.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndUffOwn() {
        return indUffOwn;
    }

    /**
     * Imposta il valore della proprietà indUffOwn.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndUffOwn(String value) {
        this.indUffOwn = value;
    }

    /**
     * Recupera il valore della proprietà tmsInsert.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTmsInsert() {
        return tmsInsert;
    }

    /**
     * Imposta il valore della proprietà tmsInsert.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTmsInsert(String value) {
        this.tmsInsert = value;
    }

    /**
     * Recupera il valore della proprietà desBreve.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesBreve() {
        return desBreve;
    }

    /**
     * Imposta il valore della proprietà desBreve.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesBreve(String value) {
        this.desBreve = value;
    }

    /**
     * Recupera il valore della proprietà dtaFineValid.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDtaFineValid() {
        return dtaFineValid;
    }

    /**
     * Imposta il valore della proprietà dtaFineValid.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDtaFineValid(String value) {
        this.dtaFineValid = value;
    }

    /**
     * Recupera il valore della proprietà configVersion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfigVersion() {
        return configVersion;
    }

    /**
     * Imposta il valore della proprietà configVersion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfigVersion(String value) {
        this.configVersion = value;
    }

}
