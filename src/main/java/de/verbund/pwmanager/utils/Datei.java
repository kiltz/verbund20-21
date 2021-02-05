package de.verbund.pwmanager.utils;

import java.io.*;

public class Datei extends File{
    private final String dateiName;

    public Datei(String pathname) {
        super(pathname);
        this.dateiName = pathname;
    }


    public void schreibe(String line1) {
        try (FileWriter outStream = new FileWriter(this)) {
            outStream.write(line1);

        } catch (IOException e) {
            // Fehlerbehandlung
            e.printStackTrace();
        }
    }
    public void schreibe(String text, boolean append) throws Exception {
        File datei = null;
        datei = new File(dateiName);
        try (FileWriter outStream = new FileWriter(datei, append)) {

            outStream.write(text);

        } catch (IOException e) {
            throw new Exception("Fehler beim schreiben", e);
        }
    }

    public String lese() throws Exception {
        StringBuilder inhalt = new StringBuilder();
        File datei = null;
        BufferedReader reader = null;

        // einlesen der Datei
        datei = new File(dateiName); // Erzeuge ein Datei-Objekt
        try (FileReader inStream = new FileReader(datei)) {
            reader = new BufferedReader(inStream);
            String zeile = "";
            while ((zeile = reader.readLine()) != null) // bis alles drin ist
            {
                if ( inhalt.length() > 0) {
                    inhalt.append("\n");
                }
                inhalt.append(zeile);
            }
        }
        // Etwas schief gegangen?
        catch (IOException e) {
            throw new Exception("Fehler beim lesen", e);
        }
        return inhalt.toString();
    }
}