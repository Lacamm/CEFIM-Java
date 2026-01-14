package lucas.javabnb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import lucas.javabnb.logements.Appartement;
import lucas.javabnb.logements.Logement;
import lucas.javabnb.logements.Maison;
import lucas.javabnb.outils.JavaBnBData;
import lucas.javabnb.outils.LogementsDomParser;
import lucas.javabnb.outils.Utile;
import lucas.javabnb.reservations.Reservation;
import lucas.javabnb.reservations.Sejour;
import lucas.javabnb.reservations.SejourFactory;
import lucas.javabnb.utilisateurs.Hote;
import lucas.javabnb.utilisateurs.Voyageur;

public class Main {

    public static void main(String[] args) throws Exception {
        Voyageur lucas = new Voyageur("Lucas", "ALLAIN", 25);
        Date maDate = Utile.creerDate(14, 03, 2027);
        int nbNuit = 12;
        int nbVoyageurs = 2;
        Logement logement = JavaBnBData.getInstance().getLogements().get(0);

        Sejour monSejour = SejourFactory.createSejour(maDate, nbNuit, logement, nbVoyageurs);
        
        try {
            Reservation reservation = new Reservation(lucas, monSejour);
            reservation.afficher();
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
