package features.inout;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/**
 * Lesen des Inhaltes einer Datei.
 * <p>
 * Das Lesen geht mit nio einfacher, ist aber recht neu und nicht überall
 * möglich...
 * <p>
 * s. http://www.adam-bien.com/roller/abien/entry/java_8_reading_a_file
 */
public class Lese {
    public static void main(String[] arg) {
        StringBuffer inhalt = new StringBuffer();
        File datei = null;
        BufferedReader reader = null;
        String dateiName = "test.txt";
        // einlesen der Datei
        datei = new File(dateiName); // Erzeuge ein Datei-Objekt
        try (FileReader inStream = new FileReader(datei)) {
            reader = new BufferedReader(inStream);
            String zeile = "";
            while ((zeile = reader.readLine()) != null) // bis alles drin ist
            {
                inhalt.append(zeile + "\n");
            }
            // Ausgabe der gesammelten Werke
            System.out.println(inhalt);
        }
        // Etwas schief gegangen?
        catch (IOException e) {
            e.printStackTrace();
        }

    }
}
