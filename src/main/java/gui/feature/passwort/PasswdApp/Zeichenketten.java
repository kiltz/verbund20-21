package gui.feature.passwort.PasswdApp;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Aufgabe:
 *
 * Baut einen Dialog mit dem Namen gui.feature.passwort.PasswdApp
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


        private Labeled l2;
        private TextField t1;
        private TextField t2;
    private TextField tf1;

    public static void main(String[] args) {
            launch(null);
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            Label l1 = new Label("Laenge des Passwort: ");
            tf1 = new TextField();

            Button b1 = new Button("Generator");
            b1.setOnAction(e -> generieren(e));

            CheckBox cb1 = new CheckBox("Mit Großbuchstaben");
            CheckBox cb2 = new CheckBox("Mit Zahlen");
            CheckBox cb3 = new CheckBox("Mindestens jedes ist vorhanden");

            l2 = new Label();

            HBox hb1 = new HBox();
            hb1.getChildren().addAll(l1, tf1);
            HBox hb2 = new HBox();
            hb2.getChildren().addAll(b1);
            HBox hb3 = new HBox();
            hb3.getChildren().addAll(cb1);
            HBox hb4 = new HBox();
            hb4.getChildren().addAll(cb2);
            HBox hb5 = new HBox();
            hb5.getChildren().addAll(cb3);
            HBox hb6 = new HBox();
            hb6.getChildren().addAll(l2);
            VBox vb1 = new VBox();
            vb1.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6);
            Scene scene = new Scene(vb1, 500, 500);
            primaryStage.setScene(scene);
            primaryStage.show();
        }

    private void generieren(ActionEvent e) {
        int passwort = Integer.parseInt(tf1.getText());
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
        String neu = ""+erlaubteZeichen.charAt(4)+erlaubteZeichen.charAt(7)+erlaubteZeichen.charAt(12);

        String test = "";
        for (int i = 0; i < 15; ++i) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            test += erlaubteZeichen.charAt(pos);
        }
        System.out.println(test);
    }




    }

