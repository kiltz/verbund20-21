package features.inout.aufgabe;

import utils.Datei;

/**
 * Invariante: Ändere diese Klasse nicht!
 * 
 * 1. Mach IntelliJ glücklich!
 * 
 * 2. Sorge dafür das der Fehler nicht ausgegeben wird.
 * 
 * 3. Optional: die Zusatzaufgabe
 * 
 * @author fk
 *
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
		if (!inhalt.equals(zeile1 + zeile2)) {
			System.out.println("Fehler: das was gelesen wurde ist nicht gleich dem was geschrieben wurde!");
		}

		// Zusatzaufgabe (für die die Klasse geändert werden darf):
		// Erzeuge eine 4 GB große Text-Datei und lese sie ein.

		// eine Instanz von "Datei" erzeugen
		String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
		String test = "1";
		Datei b = new Datei("groß.txt");
		for (int i = 0; i < 6000000; ++i) {
			int pos = (int) (Math.random() * erlaubteZeichen.length());
			test += erlaubteZeichen.charAt(pos);
			b.schreibe(test, true); // anfügen
		}




	}

}




