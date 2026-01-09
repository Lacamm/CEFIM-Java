package lucas.javabnb;

import java.time.LocalDate;
import java.util.Date;

import lucas.javabnb.logements.Appartement;
import lucas.javabnb.logements.Logement;
import lucas.javabnb.logements.Maison;
import lucas.javabnb.reservations.Reservation;
import lucas.javabnb.reservations.Sejour;
import lucas.javabnb.utilisateurs.Hote;
import lucas.javabnb.utilisateurs.Voyageur;

import static lucas.javabnb.outils.Utile.*;

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

        // LocalDate date = createDate(2026, 05, 17);
        Date date1 = creerDate(14, 03, 2027);

        // Sejour sejour1 = new Sejour(date,4 , appart1, 1);
        // Sejour sejour2 = new Sejour(new Date(),4 , appart1, 1);


        // albert.afficher();
        // lucas.afficher();
        // henry.afficher();

        // appart1.afficher();
        // appart2.afficher();
        // appart3.afficher();
        // maison1.afficher();;
        // maison2.afficher();

        // sejour1.afficher();

        try {
            Sejour sejour3 = new Sejour(date1, 4, appart3, 1);
            System.out.println("Séjour créé avec succès");
            Reservation reservation1 = new Reservation(lucas, sejour3);
            reservation1.afficher();
        } catch (IllegalArgumentException e) {
            System.out.println("Création refusée : " + e.getMessage());
        }
    }
}
