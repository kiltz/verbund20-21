package utils;

import java.io.*;

public class Datei {
    public Datei(String s) {
    }

    public void schreibe(String zeile1, boolean b) {
        File datei = null;
        String dateiName = "test.txt";
        String txt = "Eine Zeile\nnoch eine Zeile";
        datei = new File(dateiName);

        try (FileWriter outStream = new FileWriter(datei)) {

            outStream.write(txt);

        } catch (IOException e) {
            // Fehlerbehandlung
            e.printStackTrace();
        }

    }


    public String lese() {

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
                inhalt.append(zeile);
            }
            // Ausgabe der gesammelten Werke

        }
        // Etwas schief gegangen?
        catch (IOException e) {
            e.printStackTrace();
        }
            return (inhalt.toString());
        }
    }

