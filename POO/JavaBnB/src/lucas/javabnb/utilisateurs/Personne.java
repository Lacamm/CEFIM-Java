package lucas.javabnb.utilisateurs;

import java.util.Objects;

public class Personne extends Object {
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
}
