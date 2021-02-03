package features.inout;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Schreiben eines Textes in eine Textdatei.
 * 
 */
public class Schreibe {
	public static void main(String[] arg) {
		File datei = null;
		String dateiName = "test.txt";
		String txt = "Ein kleiner I/O-Test.";
		datei = new File(dateiName);
		try (FileWriter outStream = new FileWriter(datei)) {
			outStream.write(txt);
		} catch (IOException e) {
			// Fehlerbehandlung
			e.printStackTrace();
		}

	}
}
