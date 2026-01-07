package lucas.javabnb;

import java.time.LocalDate;

import lucas.javabnb.logements.Logement;
import lucas.javabnb.reservations.Sejour;
import lucas.javabnb.utilisateurs.Personne;
import static lucas.javabnb.outils.Utile.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Personne albert = new Personne("Maxime", "Albert", 28);
        Personne lucas = new Personne("Lucas", "ALLAIN", 25);
        Personne henry = new Personne("Henry", "Cavill", 42);

        Logement appart = new Logement(henry,50,"3 Rue Warhammer, 37000 Tours",108,4);

        LocalDate date = createDate(2026, 05, 17);
        // Sejour sejour1 = new Sejour(new Date(),4 , appart, 1);
        Sejour sejour1 = new Sejour(date,4 , appart, 1);


        albert.afficher();
        lucas.afficher();
        henry.afficher();

        appart.afficher();

        sejour1.afficher();

    }

}
