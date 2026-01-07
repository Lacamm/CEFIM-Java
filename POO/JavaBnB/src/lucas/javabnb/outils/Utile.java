package lucas.javabnb.outils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utile {

    public static LocalDate createDate(int annee, int mois, int jour){
        return LocalDate.of(annee, mois, jour);
    }

    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
}
