package lucas.javabnb.reservations;

import lucas.javabnb.utilisateurs.Voyageur;
import static lucas.javabnb.outils.Utile.*;

import java.util.Date;

public class Reservation {
    private Reservable objetReservable;
    private Voyageur voyageur;
    private Date dateDeReservation;

    public Reservation(Voyageur voyageur, Reservable objetReservable) {
        try {
            validerReservation(objetReservable);
            this.voyageur = voyageur;
            this.objetReservable = objetReservable;
            this.dateDeReservation = objetReservable.getDate();
        } catch (Exception e) {
            System.err.println("Erreur lors de la réservation : " + e.getMessage());
        }
    }

    public void validerReservation(Reservable objetReservable) throws IllegalArgumentException {
        if (!objetReservable.aUneDateArriveeCorrecte())
            throw new IllegalArgumentException("La date d'arrivée est incorrecte");
        if (!objetReservable.aUnNombreDeNuitsCorrect())
            throw new IllegalArgumentException("Le nombre de nuits n'est pas correct");
        if (!objetReservable.aUnNombreDeVoyageursCorrect())
            throw new IllegalArgumentException("Le nombre de voyageurs n'est pas correct");
    }

    public void afficher() {
        System.out.println("Date de la réservation : " + formaterDate(this.dateDeReservation));
        System.out.print("Voyageur : ");
        this.voyageur.afficher();
        System.out.println();
        System.out.print("A réservé chez ");
        this.objetReservable.getLogement().getHote().afficher();
        this.objetReservable.getLogement().afficher();
        this.objetReservable.afficher();
    }
}
