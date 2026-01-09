package lucas.javabnb.reservations;

import static lucas.javabnb.outils.Utile.formaterDate;

import java.util.Date;

import lucas.javabnb.utilisateurs.Voyageur;

public class Reservation {
    private Reservable objetReservable;
    private Voyageur voyageur;
    private Date dateDeReservation;

    public Reservation(Voyageur voyageur, Sejour objetReservable) {
        this.voyageur = voyageur;
        this.objetReservable = objetReservable;
        this.dateDeReservation = objetReservable.getDate();
    }

    public void afficher() {
        System.out.println("Date de la réservation : " + formaterDate(this.dateDeReservation));
        System.out.print("Voyageur : ");
        this.voyageur.afficher();
        System.out.println();
        System.out.print("A réservé chez ");
        this.objetReservable.getLogement().getHote().afficher();;
        this.objetReservable.getLogement().afficher();
        this.objetReservable.afficher();
    }
}
