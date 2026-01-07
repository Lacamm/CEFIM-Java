package lucas.javabnb.reservations;

import lucas.javabnb.logements.Logement;
import static lucas.javabnb.outils.Utile.*;

import java.time.LocalDate;

public class Sejour {
    private LocalDate dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(LocalDate dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;
    }

    public void afficher() {
        System.out.println("La date d'arrivée et le " + formatDate(this.dateArrivee) + " pour " + this.nbNuits + " nuits.");
        System.out.println("Le prix de ce séjour est de " + this.logement.getTarifParNuit() + "€.");
    }

    // private String dateFormatter(Date date) {
    //     String dateFormatee = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    //     return dateFormatee;

    // }
}
