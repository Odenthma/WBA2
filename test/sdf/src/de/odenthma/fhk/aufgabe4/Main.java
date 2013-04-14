package de.odenthma.fhk.aufgabe4;


import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;


public class Main {
    
    private static Scanner in;
    
    
    
    
    public static void listeRezept(Rezept rezept) {
        
        System.out.println();
        System.out.println(rezept.getRezeptname());
        System.out.println("------------------------");
        System.out.println();
        
        String beschreibung = rezept.getBeschreibung();
        if(beschreibung != null && !beschreibung.isEmpty()) {
        	System.out.println("Beschreibung:");
        	System.out.println("\t" + beschreibung);
        	System.out.println();
        }
        	
        ArrayList<Rezept.Fotos.Foto> fotos = (ArrayList<Rezept.Fotos.Foto>) rezept.getFotos().getFoto();
        
        System.out.println("Fotos:");
        if(!fotos.isEmpty()) {
        	for(Rezept.Fotos.Foto foto: fotos) {
        		System.out.println("\t" + foto.getBenutzername() + " | " + foto.getAdresse());
        	}
        }
        else {
        	System.out.println("\t-- Keine Fotos --");
        }
        System.out.println();
        
        
        if(rezept.getArbeitszeit() != 0) {
            System.out.print("Arbeitszeit: ");
            System.out.println("ca. " + rezept.getArbeitszeit() + " min");
        }
        
        if(rezept.getKochbackzeit() != null) {
            System.out.print("Koch-Back-zeit: ");
            System.out.println(rezept.getKochbackzeit());
        }

        if(rezept.getRuhezeit() != null) {
            System.out.print("Ruhezeit: ");
            System.out.println(rezept.getRuhezeit());
        }
        
        System.out.print("Schwierigkeit: ");
        System.out.println(rezept.getSchwierigkeitsgrad());
        
        if(rezept.getBrennwert() != 0) {
            System.out.print("Brennwert p. P.: ");
            System.out.println(rezept.getBrennwert() + "kcal");
        }
        
        System.out.print("Portionen: ");
        System.out.println(rezept.getPortionen());
        
        System.out.println();
        System.out.println("Zutaten: ");
        ArrayList<Rezept.Zutaten.Zutat> zutatenlist = (ArrayList<Rezept.Zutaten.Zutat>) rezept.getZutaten().getZutat();
        for(Rezept.Zutaten.Zutat zutat: zutatenlist) {
        	
        	String menge_str = "    ";
        	

        	
            String einheit = zutat.getMenge().getEinheit();
            String name = zutat.getName();
            
            
            String einheit_str = (einheit != null) ? einheit: "    ";
            
            System.out.println("\t " + menge_str + "\t" + einheit_str + "\t| " + name);
        }
        
        System.out.println();
        System.out.println("Zubereitung:");
        System.out.println(rezept.getZubereitung());
        
        System.out.println();
        System.out.println();
        System.out.println("Kommentare:");
        ArrayList<Rezept.Kommentare.Kommentar> kommentare = (ArrayList<Rezept.Kommentare.Kommentar>) rezept.getKommentare().getKommentar();
        if(kommentare.isEmpty()) {
            System.out.println("\t-- keine Kommentare --");
        }
        else {
            for(Rezept.Kommentare.Kommentar kommentar: kommentare) {
                System.out.println("\tName:\t\t" + kommentar.getBenutzername());
                
                
                Date geschrieben_am = kommentar.getGeschriebenAm().toGregorianCalendar().getTime();
                
                System.out.println("\tGeschrieben am:\t" + new SimpleDateFormat("dd.MM.yy HH:mm:ss").format(geschrieben_am));
                System.out.println("\tNachricht:\t" + kommentar.getNachricht());
                System.out.println();
            }
        }
    }
    
    
    public static void kommentiereRezept(ArrayList<Rezept.Kommentare.Kommentar> kommentarliste) {
        System.out.println();
        System.out.print("Name: ");
        String benutzername = in.next();
        in.nextLine();
        System.out.print("Nachricht: ");
        String nachricht = in.nextLine();

        Rezept.Kommentare.Kommentar kommi = new Rezept.Kommentare.Kommentar();
        kommi.setBenutzername(benutzername);

        GregorianCalendar c = new GregorianCalendar();
        c.setTime(new Date());

        XMLGregorianCalendar currGregCal;
        try {
            currGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
            kommi.setGeschriebenAm(currGregCal);
        } catch (DatatypeConfigurationException e) {}

        kommi.setNachricht(nachricht);

        kommentarliste.add(kommi);
    }
    
    
    public static void main(String[] args) throws JAXBException, FileNotFoundException {
        
        String filename = DEFAULT_XML;
        
        if(args.length == 1) {
            // Dateiname kann als erster Parameter mitgegeben werden
            filename = args[0];
        }
        

        in = new Scanner(System.in);

        JAXBContext context = JAXBContext.newInstance(Rezept.class);

        Unmarshaller um = context.createUnmarshaller();
        Rezept rezepte = (Rezepte) um.unmarshal(new StreamSource(new File(filename)), Rezept.class).getValue();
        ArrayList<RezepteGenerated.Rezept> list = (ArrayList<RezepteGenerated.Rezept>) rezepte.getRezept();

        if(list.isEmpty()) {
            System.err.println("Keine Rezepte gefunden!");
            System.exit(1);
        }


        int auswahl = -1;

        do {
            System.out.println();
            System.out.println("=== Rezeptsammlung ===");
            System.out.println();
            System.out.println("1. Auflistung der Rezeptnamen");
            System.out.println("2. Auflistung eines Rezepts");
            System.out.println("3. Rezept kommentieren");
            System.out.println("4. Programm beenden");
            System.out.println();
            System.out.println("Ihre Auswahl: ");

            auswahl = in.nextInt();
    
            System.out.println();
    
            int rezeptauswahl = -1;
    
            switch(auswahl) {
                case 1:
                        listeRezeptnamen(list);
                    break;
                case 2:
                    do {
                        System.out.println("Geben sie bitte die Nummer des Rezepts an: ");
                        rezeptauswahl = in.nextInt();
            
                        if(rezeptauswahl <= 0 || rezeptauswahl > list.size()) {
                            System.err.println("Es gibt kein Rezept mit dieser Nummer!");
                            System.out.println();
                        }
                        else {
                            listeRezept(list.get(rezeptauswahl-1));
                        }
                    }
                    while(rezeptauswahl <= 0 || rezeptauswahl > list.size());
            
                    break;
                case 3:
            
                    do {
                        System.out.println("Geben sie bitte die Nummer des Rezepts an: ");
                        rezeptauswahl = in.nextInt();
            
                        if(rezeptauswahl <= 0 || rezeptauswahl > list.size()) {
                            System.err.println("Es gibt kein Rezept mit dieser Nummer!");
                            System.out.println();
                        }
                        else {
                            ArrayList<RezepteGenerated.Rezept.Kommentare.Kommentar> kommentare = (ArrayList<RezepteGenerated.Rezept.Kommentare.Kommentar>) list.get(rezeptauswahl-1).getKommentare().getKommentar();
                            kommentiereRezept(kommentare);
                    
                            // XML-Dokument mit aktuellen Daten (eingetragener Kommentar) schreiben
                            Marshaller m = context.createMarshaller();
                            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
                            m.marshal(new ObjectFactory().createRezepte(rezepte), new File(filename));
                        }
                    }
                    while(rezeptauswahl <= 0 || rezeptauswahl > list.size());
            
                    break;
                default:
                    continue;
            }
    
        }
        while(auswahl != 4);
    }

}