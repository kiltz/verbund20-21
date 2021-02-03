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

package gui.feature.passwort;

import javafx.application.Application;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.awt.*;

public class PasswdApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    private TextField testEingabe = new TextField();


    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hMain = new HBox();

    }
}
