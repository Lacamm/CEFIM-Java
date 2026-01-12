package lucas.javabnb.reservations;

import java.util.Date;

import lucas.javabnb.logements.Logement;

public interface Reservable {
    public boolean aUneDateArriveeCorrecte();
    public boolean aUnNombreDeNuitsCorrect();
    public boolean aUnNombreDeVoyageursCorrect();
    public void afficher();
    public Logement getLogement();
    public Date getDate();
}
