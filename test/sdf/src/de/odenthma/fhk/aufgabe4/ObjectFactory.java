//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.6 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2013.04.14 um 11:30:22 PM CEST 
//


package de.odenthma.fhk.aufgabe4;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the de.odenthma.fhk.aufgabe4 package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: de.odenthma.fhk.aufgabe4
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Rezept }
     * 
     */
    public Rezept createRezept() {
        return new Rezept();
    }

    /**
     * Create an instance of {@link Rezept.Kommentare }
     * 
     */
    public Rezept.Kommentare createRezeptKommentare() {
        return new Rezept.Kommentare();
    }

    /**
     * Create an instance of {@link Rezept.Zutaten }
     * 
     */
    public Rezept.Zutaten createRezeptZutaten() {
        return new Rezept.Zutaten();
    }

    /**
     * Create an instance of {@link Rezept.Zutaten.Zutat }
     * 
     */
    public Rezept.Zutaten.Zutat createRezeptZutatenZutat() {
        return new Rezept.Zutaten.Zutat();
    }

    /**
     * Create an instance of {@link Rezept.Fotos }
     * 
     */
    public Rezept.Fotos createRezeptFotos() {
        return new Rezept.Fotos();
    }

    /**
     * Create an instance of {@link Rezept.Kommentare.Kommentar }
     * 
     */
    public Rezept.Kommentare.Kommentar createRezeptKommentareKommentar() {
        return new Rezept.Kommentare.Kommentar();
    }

    /**
     * Create an instance of {@link Rezept.Zutaten.Zutat.Menge }
     * 
     */
    public Rezept.Zutaten.Zutat.Menge createRezeptZutatenZutatMenge() {
        return new Rezept.Zutaten.Zutat.Menge();
    }

    /**
     * Create an instance of {@link Rezept.Fotos.Foto }
     * 
     */
    public Rezept.Fotos.Foto createRezeptFotosFoto() {
        return new Rezept.Fotos.Foto();
    }

}
