//
// Questo file è stato generato dall'architettura JavaTM per XML Binding (JAXB) Reference Implementation, v2.2.11 
// Vedere <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Qualsiasi modifica a questo file andrà persa durante la ricompilazione dello schema di origine. 
// Generato il: 2019.12.18 alle 11:01:29 AM CET 
//


package com.intesasanpaolo.bear.bear0.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.intesasanpaolo.bear.bear0.wsbridgeshowcase.model package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Configurazione_QNAME = new QName("", "configurazione");
    private final static QName _Contatto_QNAME = new QName("", "contatto");
    private final static QName _Indirizzo_QNAME = new QName("", "indirizzo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.intesasanpaolo.bear.bear0.wsbridgeshowcase.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Configurazione }
     * 
     */
    public Configurazione createConfigurazione() {
        return new Configurazione();
    }

    /**
     * Create an instance of {@link Contatto }
     * 
     */
    public Contatto createContatto() {
        return new Contatto();
    }

    /**
     * Create an instance of {@link Indirizzo }
     * 
     */
    public Indirizzo createIndirizzo() {
        return new Indirizzo();
    }

    /**
     * Create an instance of {@link FindConfigurazioniValideRomo }
     * 
     */
    public FindConfigurazioniValideRomo createFindConfigurazioniValideRomo() {
        return new FindConfigurazioniValideRomo();
    }

    /**
     * Create an instance of {@link FidnConfigurazioniValideRomoResponse }
     * 
     */
    public FidnConfigurazioniValideRomoResponse createFidnConfigurazioniValideRomoResponse() {
        return new FidnConfigurazioniValideRomoResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Configurazione }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "configurazione")
    public JAXBElement<Configurazione> createConfigurazione(Configurazione value) {
        return new JAXBElement<Configurazione>(_Configurazione_QNAME, Configurazione.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Contatto }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "contatto")
    public JAXBElement<Contatto> createContatto(Contatto value) {
        return new JAXBElement<Contatto>(_Contatto_QNAME, Contatto.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Indirizzo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "indirizzo")
    public JAXBElement<Indirizzo> createIndirizzo(Indirizzo value) {
        return new JAXBElement<Indirizzo>(_Indirizzo_QNAME, Indirizzo.class, null, value);
    }

}
