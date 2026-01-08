package lucas.javabnb;

import java.time.LocalDate;

import lucas.javabnb.logements.Appartement;
import lucas.javabnb.logements.Logement;
import lucas.javabnb.logements.Maison;
import lucas.javabnb.reservations.Sejour;
import lucas.javabnb.utilisateurs.Hote;
import lucas.javabnb.utilisateurs.Personne;
import static lucas.javabnb.outils.Utile.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Personne lucas = new Personne("Lucas", "ALLAIN", 25);
        Hote albert = new Hote("Maxime", "Albert", 28, 12);
        Hote henry = new Hote("Henry", "Cavill", 42, 1);

        Appartement appart1 = new Appartement(henry,50,"3 Rue Warhammer, 37000 Tours",108,4,10,1);
        Appartement appart2 = new Appartement(albert,20,"36 Rue la bas, 56070 Vannes",87,4,0,0);
        Appartement appart3 = new Appartement(henry,150,"3 Rue Warhammer, 37000 Tours",170,8,10,5);

        Maison maison1 = new Maison(henry, 100, "l'adresse la", 150, 6, 0, false);
        Maison maison2 = new Maison(albert, 200, "la super adresse",450, 12, 65,true);
        LocalDate date = createDate(2026, 05, 17);
        // Sejour sejour1 = new Sejour(new Date(),4 , appart, 1);
        // Sejour sejour1 = new Sejour(date,4 , appart, 1);

        // albert.afficher();
        // lucas.afficher();
        // henry.afficher();
        // appart.afficher();
        // sejour1.afficher();

        // appart1.afficher();
        // appart2.afficher();
        // appart3.afficher();

        maison1.afficher();;
        maison2.afficher();

    }
}
