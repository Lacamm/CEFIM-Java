package lucas.javabnb.logements;

import lucas.javabnb.utilisateurs.Personne;

public class Logement {
    private Personne hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Personne hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public int getTarifParNuit() {
        return this.tarifParNuit;
    }

    public void afficher() {
        System.out.println("Le logement est situé au " + this.adresse + ".");
        System.out.println("Superficie : " + this.superficie + "m²");
    }
}
