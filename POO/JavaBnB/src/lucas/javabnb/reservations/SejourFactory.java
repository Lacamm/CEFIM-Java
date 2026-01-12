package lucas.javabnb.reservations;

import lucas.javabnb.logements.Logement;

import java.util.Date;

public class SejourFactory {
    private SejourFactory() {

    }

    public static Sejour createSejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        Sejour monSejour;

        if (nbNuits <= 6) {
            monSejour = new SejourCourt(dateArrivee, nbNuits, logement, nbVoyageurs);
        } else {
            monSejour = new SejourLong(dateArrivee, nbNuits, logement, nbVoyageurs);
        }
        return monSejour;
    }
}
