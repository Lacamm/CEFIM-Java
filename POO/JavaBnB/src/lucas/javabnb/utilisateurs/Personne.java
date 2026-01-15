package lucas.javabnb.utilisateurs;

import java.util.Objects;

import lucas.javabnb.outils.Compare;

public class Personne implements Compare{
    private String prenom;
    private String nom;
    private int age;

    public Personne(String prenom, String nom, int age) {
        this.prenom = prenom;
        this.nom = nom;
        this.age = age;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void afficher() {
        System.out.print(this.prenom + " " + this.nom + " (" + this.age + " ans)");
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object)
            return true;

        if (object == null || getClass() != object.getClass())
            return false;

        Personne personne = (Personne) object;
        return age == personne.age && Objects.equals(nom, personne.nom) &&
                Objects.equals(prenom, personne.prenom);
    }

    public int getValueToCompare() {
        return getAge();
    }
}
