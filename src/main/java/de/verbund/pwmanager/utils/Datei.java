package de.verbund.pwmanager.utils;

import java.io.*;

public class Datei extends File {

    public Datei(String pathname) {
        super(pathname);
    }

    public void schreibe(String line1) {
        try (FileWriter outStream = new FileWriter(this)) {
            outStream.write(line1);

        } catch (IOException e) {
            // Fehlerbehandlung
            e.printStackTrace();
        }
    }

    public void schreibe(String line2, Boolean isTrue) {

        try (FileWriter outStream = new FileWriter(this, isTrue)) {
            outStream.write(line2);

        } catch (IOException e) {
            // Fehlerbehandlung
            e.printStackTrace();
        }
    }

    public String lese() {

        StringBuffer inhalt = new StringBuffer();
        BufferedReader reader = null;

        try (FileReader inStream = new FileReader(this)) {
            reader = new BufferedReader(inStream);
            String zeile = "";
            while ((zeile = reader.readLine()) != null) // bis alles drin ist
            {
                inhalt.append(zeile + "\n");
            }
            // Ausgabe der gesammelten Werke
            return inhalt.toString().trim();
        }
        // Etwas schief gegangen?
        catch (IOException e) {
            e.printStackTrace();
        }

        return "";
    }
}
