package utils;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Datei {
    public Datei(String s) {
        // this.String = dateiName;
    }

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("text.txt")));
    }

    public void schreibe(String text) {
        File datei = null;
        String txt = "Ein kleiner IO Test";
        // datei = new File(dateiName);
        try (FileWriter outStream = new FileWriter(datei)) {
            outStream.write(text);
        } catch ( IOException e) {
            e.printStackTrace();
        }
    }

    public void schreibe(String zeile1, boolean append) {

    }

    public String lese() {
        String inhalt = "";
        return inhalt;
    }

}
