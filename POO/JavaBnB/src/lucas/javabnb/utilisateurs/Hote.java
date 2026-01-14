package lucas.javabnb.utilisateurs;

public class Hote extends Personne{
    private int delaiDeReponse;

    public Hote(String prenom, String nom, int age, int delaiDeReponse) {
        super(prenom, nom, age);
        this.delaiDeReponse = delaiDeReponse;
    }

    @Override
    public void afficher() {
        super.afficher();
        if (this.delaiDeReponse == 1) {
            System.out.println(" qui s'engage à répondre dans l'heure");
        } else {
            System.out.println(" qui s'engage à répondre dans les " + this.delaiDeReponse + " heures");
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        if (!super.equals(o))
            return false;

        Hote hote = (Hote) o;
        return delaiDeReponse == hote.delaiDeReponse;
    }
}
