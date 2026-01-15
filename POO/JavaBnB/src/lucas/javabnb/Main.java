package lucas.javabnb;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import lucas.javabnb.logements.Appartement;
import lucas.javabnb.logements.Logement;
import lucas.javabnb.logements.Maison;
import lucas.javabnb.outils.Comparateur;
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
        Hote albert = new Hote("Maxime", "Albert", 28, 12);
        Hote henry = new Hote("Henry", "Cavill", 42, 1);

        Logement appart1 = new Appartement(henry, 50, "3 Rue Warhammer, 37000 Tours", 108, 4, 10, 1);
        Logement appart2 = new Appartement(albert, 20, "36 Rue la bas, 56070 Vannes", 87, 4, 0, 0);
        Logement appart3 = new Appartement(henry, 150, "3 Rue Warhammer, 37000 Tours", 170, 8, 10, 5);

        Logement maison1 = new Maison(henry, 100, "l'adresse la", 150, 6, 0, false);
        Logement maison2 = new Maison(albert, 200, "la super adresse", 450, 12, 65, true);
        
        Date maDate = Utile.creerDate(14, 03, 2027);
        int nbNuit = 12;
        int nbVoyageurs = 2;
        Logement logement = JavaBnBData.getInstance().getLogements().get(0);

        Sejour monSejour = SejourFactory.createSejour(maDate, nbNuit, logement, nbVoyageurs);
        
        // try {
        //     Reservation reservation = new Reservation(lucas, monSejour);
        //     reservation.afficher();
        // } catch (NullPointerException e) {
        //     System.out.println(e.getMessage());
        // } catch (IllegalArgumentException e) {
        //     System.out.println(e.getMessage());
        // }

        Comparateur<Logement> compareLogement = new Comparateur<Logement>(appart1, appart2);
        Logement logementLePlusCher = compareLogement.getHigher();
        logementLePlusCher.afficher();
    }
}
