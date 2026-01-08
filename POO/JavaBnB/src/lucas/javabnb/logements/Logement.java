package lucas.javabnb.logements;

import lucas.javabnb.utilisateurs.Hote;

public class Logement {
    private Hote hote;
    private int tarifParNuit;
    private String adresse;
    private int superficie;
    private int nbVoyageursMax;

    public Logement(Hote hote, int tarifParNuit, String adresse, int superficie, int nbVoyageursMax) {
        this.hote = hote;
        this.tarifParNuit = tarifParNuit;
        this.adresse = adresse;
        this.superficie = superficie;
        this.nbVoyageursMax = nbVoyageursMax;
    }

    public int getTarifParNuit() {
        return this.tarifParNuit;
    }

    protected String getAdresse() {
        return this.adresse;
    }

    protected int getSuperficie() {
        return this.superficie;
    }

    public void afficher() {
        System.out.println("Le logement est situé au " + this.adresse + ".");
        System.out.println("Superficie : " + this.superficie + "m²");
    }
}
