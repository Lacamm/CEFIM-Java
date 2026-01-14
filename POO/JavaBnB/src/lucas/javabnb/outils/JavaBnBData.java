package lucas.javabnb.outils;

import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.SAXException;

import lucas.javabnb.logements.Logement;
import lucas.javabnb.utilisateurs.Hote;

public class JavaBnBData {
    private static JavaBnBData instance = new JavaBnBData();
    private ArrayList<Hote> hotes;
    private ArrayList<Logement> logements;

    private JavaBnBData() {
        hotes = new ArrayList<Hote>();
        logements = new ArrayList<Logement>();

        try {
            LogementsDomParser.parse("./res/logements.xml", hotes, logements);
        } catch (SAXException e) {
            System.out.println("Erreur Saxe");
        } catch (IOException e) {
            System.out.println("Erreur IO");
        } catch (ParserConfigurationException e) {
            System.out.println("Erreur Parser");
        }
    }

    public static JavaBnBData getInstance() {
        return instance;
    }

    public ArrayList<Hote> getHotes() {
        return hotes;
    }

    public ArrayList<Logement> getLogements() {
        return logements;
    }
}
