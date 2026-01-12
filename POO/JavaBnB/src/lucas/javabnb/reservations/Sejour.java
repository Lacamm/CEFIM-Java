package lucas.javabnb.reservations;

import lucas.javabnb.logements.Logement;
import static lucas.javabnb.outils.Utile.*;

import java.util.Date;

public class Sejour implements Reservable {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;

    public Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;     
    }

    public void afficher() {
        System.out.println(
                "La date d'arrivée et le " + formaterDate(this.dateArrivee) + " pour " + this.nbNuits + " nuits.");
        System.out.println("Le prix de ce séjour est de " + this.logement.getTarifParNuit() + "€.");
    }

    public Date getDate() {
        return this.dateArrivee;
    }

    public Logement getLogement() {
        return this.logement;
    }

    public boolean aUneDateArriveeCorrecte() {
        Long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        return this.dateArrivee.after(date);
    }

    public boolean aUnNombreDeNuitsCorrect() {
        return this.nbNuits > 1 && this.nbNuits <= 31;
    }

    public boolean aUnNombreDeVoyageursCorrect() {
        return this.nbVoyageurs <= this.logement.getNbVoyageurmax();
    }
}
