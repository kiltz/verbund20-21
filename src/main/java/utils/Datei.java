package utils;

import java.io.*;

public class Datei {
    private String dateiName;
    private final String grossBuchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String zahlen = "0123456789";
    private final String sonderZeichen = "!@§$%&/()=?`{[]}#+-*";

    public Datei(String dateiName) {
        this.dateiName = dateiName;
    }

    public void schreibe(String text) throws Exception {
        schreibe(text, false);
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
        StringBuffer inhalt = new StringBuffer();
        File datei = null;
        BufferedReader reader = null;
        // einlesen der Datei
        datei = new File(dateiName); // Erzeuge ein Datei-Objekt
        try (FileReader inStream = new FileReader(datei)) {
            reader = new BufferedReader(inStream);
            String zeile = "";
            while ((zeile = reader.readLine()) != null) // bis alles drin ist
            {
                if (inhalt.length() > 0) {
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

    public String erzeugePassword(int anzahl) {
        String password = "";
        int laenge = 60;
        for (int i = 0; i < laenge; i++) {
            String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
        }
        return password;
    }
}
