package lucas.javabnb.reservations;

import lucas.javabnb.logements.Logement;
import static lucas.javabnb.outils.Utile.*;

import java.util.Date;

public abstract class Sejour implements Reservable {
    private Date dateArrivee;
    private int nbNuits;
    private Logement logement;
    private int nbVoyageurs;
    protected int prix;

    Sejour(Date dateArrivee, int nbNuits, Logement logement, int nbVoyageurs) {
        this.dateArrivee = dateArrivee;
        this.nbNuits = nbNuits;
        this.logement = logement;
        this.nbVoyageurs = nbVoyageurs;

        this.miseAJourDuPrixDuSejour();
    }

    public void afficher() {
    }

    public Date getDate() {
        return this.dateArrivee;
    }

    public Logement getLogement() {
        return this.logement;
    }

    public int getNbNuit() {
        return this.nbNuits;
    }

    public boolean aUneDateArriveeCorrecte() {
        Long millis = System.currentTimeMillis();
        Date date = new Date(millis);
        return this.dateArrivee.after(date);
    }

    public boolean aUnNombreDeVoyageursCorrect() {
        return this.nbVoyageurs > 0 && this.nbVoyageurs <= this.logement.getNbVoyageurmax();
    }

    public abstract void miseAJourDuPrixDuSejour();
}
