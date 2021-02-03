package features.inout.aufgabe;

import utils.Datei;

import java.io.*;

/**
 * Invariante: Ändere diese Klasse nicht!
 * <p>
 * 1. Mach IntelliJ glücklich!
 * <p>
 * 2. Sorge dafür das der Fehler nicht ausgegeben wird.
 * <p>
 * 3. Optional: die Zusatzaufgabe
 *
 * @author fk
 */
public class DateiTester {

    public static void main(String[] args) throws Exception {
        String zeile1 = "Eine Zeile";
        String zeile2 = "\nnoch eine Zeile";

        // eine Instanz von "Datei" erzeugen
        Datei d = new Datei("test.txt");
        d.schreibe(zeile1);
        d.schreibe(zeile2, true); // anfügen!

        String inhalt = d.lese();

        System.out.println("'" + inhalt + "'");
        System.out.println("'" + zeile1 + zeile2 + "'");

        createFile(d);

        if (!inhalt.equals(zeile1 + zeile2)) {
            System.out.println("Fehler: das was gelesen wurde ist nicht gleich dem was geschrieben wurde!");
        }

        // Zusatzaufgabe (für die die Klasse geändert werden darf):
        // Erzeuge eine 4 GB große Text-Datei und lese sie ein.
    }

    private static void createFile(Datei d){

        long fileSize = 4_000_000_000L;

        while(d.length() <= fileSize){
            d.schreibe("Hello", true);
        }
        d.lese();
        System.out.println("Dateigroesse: " + d.length() + " Byte");
    }
}

