package lucas.javabnb.outils;

import java.util.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Utile {

    //LocalDate
    public static LocalDate createDate(int annee, int mois, int jour){
        return LocalDate.of(annee, mois, jour);
    }

    
    public static String formatDate(LocalDate date) {
        return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }

    // private String dateFormatter(Date date) {
    //     String dateFormatee = new SimpleDateFormat("dd/MM/yyyy").format(new Date());
    //     return dateFormatee;

    // }

    //Date
    public static Date creerDate(int jour, int mois, int annee) {
        Date date = new Date(annee - 1900, mois - 1, jour);
        return date;
    }

    public static String formaterDate(Date date) {
        StringBuilder strDate = new StringBuilder();

        if (date.getDate() < 10) {
            strDate.append("0");
        }

        strDate.append(date.getDate());
        strDate.append("/");

        if (date.getMonth() + 1 < 10) {
            strDate.append("0");
        }

        strDate.append(date.getMonth() + 1);
        strDate.append("/");
        strDate.append(date.getYear() + 1900);

        return strDate.toString();
    }
}
