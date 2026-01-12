package lucas.javabnb.reservations;

import static lucas.javabnb.outils.Utile.formaterDate;

import java.util.Date;

import lucas.javabnb.logements.Logement;

public class SejourCourt extends Sejour {

    SejourCourt(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        super(dateArrivee, nbNuits, logement, nbVoyageurs);

        miseAJourDuPrixDuSejour();
    }

    public boolean aUnNombreDeNuitsCorrect() {
        return this.getNbNuit() > 1 && this.getNbNuit() <= 31;
    }

    @Override
    public void afficher() {
        super.afficher();

        System.out.println("La date d'arrivée et le " + formaterDate(this.getDate()) + 
            " pour " + this.getNbNuit() + " nuits.");
        System.out.println("Le prix de ce séjour est de " + this.prix + "€.");
    }

    @Override
    public void miseAJourDuPrixDuSejour() {
        this.prix = getNbNuit() * getLogement().getTarifParNuit();
    }
}
