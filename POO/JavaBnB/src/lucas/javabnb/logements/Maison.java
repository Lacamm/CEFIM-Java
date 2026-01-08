package lucas.javabnb.logements;

import lucas.javabnb.utilisateurs.Hote;

public class Maison extends Logement {
    private int superficieJardin;
    private boolean possedePiscine;

    public Maison(Hote hote, int tarifParNuit, String adresse, int superficie,
            int nbVoyageursMax, int superficieJardin, boolean possedePiscine) {

        super(hote, tarifParNuit, adresse, superficie, nbVoyageursMax);
        this.superficieJardin = superficieJardin;
        this.possedePiscine = possedePiscine;
    }

    @Override
    public void afficher() {

        System.out.println("Le logement est situé au " + this.getAdresse() + ".");
        System.out.println("Superficie : " + this.getAdresse() + "m²");

        if (this.superficieJardin == 0) {
            System.out.println("Jardin : Non");
        } else {
            System.out.println("jardin : Oui (" + this.superficieJardin + "m²)");
        }

        if (this.possedePiscine) {
            System.out.println("Piscine : Oui");
        } else {
            System.out.println("Piscine : Non");
        }
    }
}
