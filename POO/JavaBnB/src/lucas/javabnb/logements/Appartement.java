package lucas.javabnb.logements;

import lucas.javabnb.utilisateurs.Hote;

public class Appartement extends Logement {
    private int superficieBalcon;
    private int numeroEtage;

    public Appartement(Hote hote, int tarifParNuit, String adresse, int superficie,
            int nbVoyageursMax, int superficieBalcon, int numeroEtage) {

        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieBalcon = superficieBalcon;
        this.numeroEtage = numeroEtage;
    }

    private String afficherEtage(int numeroEtage) {
        if (numeroEtage == 0) {
            return " au rez-de-chaussée";
        } else if (numeroEtage == 1) {
            return " au " + numeroEtage + "er étage";
        } else {
            return " au " + numeroEtage + "éme étage";
        }
    }

    @Override
    public void afficher() {

        System.out.println("Le logement est un appartement situé au " + this.getAdresse() +
                this.afficherEtage(this.numeroEtage) + ".");
        System.out.println("Superficie : " + this.getSuperficie() + "m²");

        if (this.superficieBalcon == 0) {
            System.out.println("Balcon : Non");
        } else {
            System.out.println("Balcon : Oui (" + this.superficieBalcon + "m²)");
        }
    }
}
