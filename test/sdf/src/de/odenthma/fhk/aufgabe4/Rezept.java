//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.14 um 11:30:22 PM CEST 
//


package de.odenthma.fhk.aufgabe4;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="rezeptname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="beschreibung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="fotos">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="foto" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="benutzername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="benutzer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="arbeitszeit" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="kochbackzeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="ruhezeit" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="schwierigkeitsgrad">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="simpel"/>
 *               &lt;enumeration value="normal"/>
 *               &lt;enumeration value="schwer"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="brennwert" type="{http://www.w3.org/2001/XMLSchema}short"/>
 *         &lt;element name="portionen" type="{http://www.w3.org/2001/XMLSchema}byte"/>
 *         &lt;element name="zutaten">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="zutat" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="menge">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="wert" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="zubereitung" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="kommentare">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="kommentar" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="benutzername" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="geschrieben_am" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="nachricht" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "rezeptname",
    "beschreibung",
    "fotos",
    "arbeitszeit",
    "kochbackzeit",
    "ruhezeit",
    "schwierigkeitsgrad",
    "brennwert",
    "portionen",
    "zutaten",
    "zubereitung",
    "kommentare"
})
@XmlRootElement(name = "rezept")
public class Rezept {

    @XmlElement(required = true)
    protected String rezeptname;
    @XmlElement(required = true)
    protected String beschreibung;
    @XmlElement(required = true)
    protected Rezept.Fotos fotos;
    protected byte arbeitszeit;
    @XmlElement(required = true)
    protected String kochbackzeit;
    @XmlElement(required = true)
    protected String ruhezeit;
    @XmlElement(required = true)
    protected String schwierigkeitsgrad;
    protected short brennwert;
    protected byte portionen;
    @XmlElement(required = true)
    protected Rezept.Zutaten zutaten;
    @XmlElement(required = true)
    protected String zubereitung;
    @XmlElement(required = true)
    protected Rezept.Kommentare kommentare;

    /**
     * Ruft den Wert der rezeptname-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRezeptname() {
        return rezeptname;
    }

    /**
     * Legt den Wert der rezeptname-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRezeptname(String value) {
        this.rezeptname = value;
    }

    /**
     * Ruft den Wert der beschreibung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeschreibung() {
        return beschreibung;
    }

    /**
     * Legt den Wert der beschreibung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeschreibung(String value) {
        this.beschreibung = value;
    }

    /**
     * Ruft den Wert der fotos-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Fotos }
     *     
     */
    public Rezept.Fotos getFotos() {
        return fotos;
    }

    /**
     * Legt den Wert der fotos-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Fotos }
     *     
     */
    public void setFotos(Rezept.Fotos value) {
        this.fotos = value;
    }

    /**
     * Ruft den Wert der arbeitszeit-Eigenschaft ab.
     * 
     */
    public byte getArbeitszeit() {
        return arbeitszeit;
    }

    /**
     * Legt den Wert der arbeitszeit-Eigenschaft fest.
     * 
     */
    public void setArbeitszeit(byte value) {
        this.arbeitszeit = value;
    }

    /**
     * Ruft den Wert der kochbackzeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKochbackzeit() {
        return kochbackzeit;
    }

    /**
     * Legt den Wert der kochbackzeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKochbackzeit(String value) {
        this.kochbackzeit = value;
    }

    /**
     * Ruft den Wert der ruhezeit-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuhezeit() {
        return ruhezeit;
    }

    /**
     * Legt den Wert der ruhezeit-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuhezeit(String value) {
        this.ruhezeit = value;
    }

    /**
     * Ruft den Wert der schwierigkeitsgrad-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    /**
     * Legt den Wert der schwierigkeitsgrad-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSchwierigkeitsgrad(String value) {
        this.schwierigkeitsgrad = value;
    }

    /**
     * Ruft den Wert der brennwert-Eigenschaft ab.
     * 
     */
    public short getBrennwert() {
        return brennwert;
    }

    /**
     * Legt den Wert der brennwert-Eigenschaft fest.
     * 
     */
    public void setBrennwert(short value) {
        this.brennwert = value;
    }

    /**
     * Ruft den Wert der portionen-Eigenschaft ab.
     * 
     */
    public byte getPortionen() {
        return portionen;
    }

    /**
     * Legt den Wert der portionen-Eigenschaft fest.
     * 
     */
    public void setPortionen(byte value) {
        this.portionen = value;
    }

    /**
     * Ruft den Wert der zutaten-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Zutaten }
     *     
     */
    public Rezept.Zutaten getZutaten() {
        return zutaten;
    }

    /**
     * Legt den Wert der zutaten-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Zutaten }
     *     
     */
    public void setZutaten(Rezept.Zutaten value) {
        this.zutaten = value;
    }

    /**
     * Ruft den Wert der zubereitung-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getZubereitung() {
        return zubereitung;
    }

    /**
     * Legt den Wert der zubereitung-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setZubereitung(String value) {
        this.zubereitung = value;
    }

    /**
     * Ruft den Wert der kommentare-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Rezept.Kommentare }
     *     
     */
    public Rezept.Kommentare getKommentare() {
        return kommentare;
    }

    /**
     * Legt den Wert der kommentare-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Rezept.Kommentare }
     *     
     */
    public void setKommentare(Rezept.Kommentare value) {
        this.kommentare = value;
    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="foto" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="benutzername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="benutzer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "foto"
    })
    public static class Fotos {

        protected List<Rezept.Fotos.Foto> foto;

        /**
         * Gets the value of the foto property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the foto property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFoto().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rezept.Fotos.Foto }
         * 
         * 
         */
        public List<Rezept.Fotos.Foto> getFoto() {
            if (foto == null) {
                foto = new ArrayList<Rezept.Fotos.Foto>();
            }
            return this.foto;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="benutzername" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="benutzer" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element name="adresse" type="{http://www.w3.org/2001/XMLSchema}anyURI"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "benutzername",
            "benutzer",
            "adresse"
        })
        public static class Foto {

            protected String benutzername;
            protected String benutzer;
            @XmlElement(required = true)
            @XmlSchemaType(name = "anyURI")
            protected String adresse;

            /**
             * Ruft den Wert der benutzername-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenutzername() {
                return benutzername;
            }

            /**
             * Legt den Wert der benutzername-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenutzername(String value) {
                this.benutzername = value;
            }

            /**
             * Ruft den Wert der benutzer-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenutzer() {
                return benutzer;
            }

            /**
             * Legt den Wert der benutzer-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenutzer(String value) {
                this.benutzer = value;
            }

            /**
             * Ruft den Wert der adresse-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdresse() {
                return adresse;
            }

            /**
             * Legt den Wert der adresse-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdresse(String value) {
                this.adresse = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="kommentar" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="benutzername" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="geschrieben_am" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="nachricht" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "kommentar"
    })
    public static class Kommentare {

        protected List<Rezept.Kommentare.Kommentar> kommentar;

        /**
         * Gets the value of the kommentar property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the kommentar property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getKommentar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rezept.Kommentare.Kommentar }
         * 
         * 
         */
        public List<Rezept.Kommentare.Kommentar> getKommentar() {
            if (kommentar == null) {
                kommentar = new ArrayList<Rezept.Kommentare.Kommentar>();
            }
            return this.kommentar;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="benutzername" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="geschrieben_am" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="nachricht" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "benutzername",
            "geschriebenAm",
            "nachricht"
        })
        public static class Kommentar {

            @XmlElement(required = true)
            protected String benutzername;
            @XmlElement(name = "geschrieben_am", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar geschriebenAm;
            @XmlElement(required = true)
            protected String nachricht;

            /**
             * Ruft den Wert der benutzername-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBenutzername() {
                return benutzername;
            }

            /**
             * Legt den Wert der benutzername-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBenutzername(String value) {
                this.benutzername = value;
            }

            /**
             * Ruft den Wert der geschriebenAm-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getGeschriebenAm() {
                return geschriebenAm;
            }

            /**
             * Legt den Wert der geschriebenAm-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setGeschriebenAm(XMLGregorianCalendar value) {
                this.geschriebenAm = value;
            }

            /**
             * Ruft den Wert der nachricht-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNachricht() {
                return nachricht;
            }

            /**
             * Legt den Wert der nachricht-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNachricht(String value) {
                this.nachricht = value;
            }

        }

    }


    /**
     * <p>Java-Klasse für anonymous complex type.
     * 
     * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="zutat" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="menge">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="wert" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "zutat"
    })
    public static class Zutaten {

        protected List<Rezept.Zutaten.Zutat> zutat;

        /**
         * Gets the value of the zutat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the zutat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getZutat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Rezept.Zutaten.Zutat }
         * 
         * 
         */
        public List<Rezept.Zutaten.Zutat> getZutat() {
            if (zutat == null) {
                zutat = new ArrayList<Rezept.Zutaten.Zutat>();
            }
            return this.zutat;
        }


        /**
         * <p>Java-Klasse für anonymous complex type.
         * 
         * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="menge">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="wert" type="{http://www.w3.org/2001/XMLSchema}float" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "menge"
        })
        public static class Zutat {

            @XmlElement(required = true)
            protected String name;
            @XmlElement(required = true)
            protected Rezept.Zutaten.Zutat.Menge menge;

            /**
             * Ruft den Wert der name-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Legt den Wert der name-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Ruft den Wert der menge-Eigenschaft ab.
             * 
             * @return
             *     possible object is
             *     {@link Rezept.Zutaten.Zutat.Menge }
             *     
             */
            public Rezept.Zutaten.Zutat.Menge getMenge() {
                return menge;
            }

            /**
             * Legt den Wert der menge-Eigenschaft fest.
             * 
             * @param value
             *     allowed object is
             *     {@link Rezept.Zutaten.Zutat.Menge }
             *     
             */
            public void setMenge(Rezept.Zutaten.Zutat.Menge value) {
                this.menge = value;
            }


            /**
             * <p>Java-Klasse für anonymous complex type.
             * 
             * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="einheit" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="wert" type="{http://www.w3.org/2001/XMLSchema}float" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Menge {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "einheit")
                protected String einheit;
                @XmlAttribute(name = "wert")
                protected Float wert;

                /**
                 * Ruft den Wert der value-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * Legt den Wert der value-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * Ruft den Wert der einheit-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getEinheit() {
                    return einheit;
                }

                /**
                 * Legt den Wert der einheit-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setEinheit(String value) {
                    this.einheit = value;
                }

                /**
                 * Ruft den Wert der wert-Eigenschaft ab.
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getWert() {
                    return wert;
                }

                /**
                 * Legt den Wert der wert-Eigenschaft fest.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setWert(Float value) {
                    this.wert = value;
                }

            }

        }

    }

}
