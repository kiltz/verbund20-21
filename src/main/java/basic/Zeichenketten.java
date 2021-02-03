package basic;

import javafx.application.Application;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.xml.soap.Text;

/**
 * Aufgabe:
 *
 * Baut einen Dialog mit dem Namen gui.feature.passwort.PasswdApp
 *
 * gui
 *
 * Erzeugt in diesem Dialog Passwörter.
 *
 * 1. Stufe: gebt in einem Testfeld die Länge ein
 *
 * 2. Stufe: Bietet je eine Checkbox für
 *      - Mit Großbuchstaben
 *      - Mit Zahlen
 *      - Mit Sonderzeichen
 *      - Mindestens jedes ist vorhanden
 *
 *
 */

public class Zeichenketten extends Application {

    private TextField tfOne;
    private TextField tfTwo;
    private Labeled LabelOne;

    public static void main(String[] args) {
        launch(args);

        //                        01234567890123456789
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
        String neu = ""+erlaubteZeichen.charAt(4)+erlaubteZeichen.charAt(7)+erlaubteZeichen.charAt(12);
        System.out.println(neu);
        String test = "";
        for (int i = 0; i < 15; ++i) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            test += erlaubteZeichen.charAt(pos);
        }
        System.out.println(test);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

    }
}
