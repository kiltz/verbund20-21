package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGui extends Application {

    private TextField  tfBetrag;

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);

        tfBetrag = new TextField();

        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen

        Button bsetzeDispo = new Button("setze Dispo");
        bsetzeDispo.setOnAction(e -> setDispo(e) );

        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen

        Button bEinzahlen = new Button("einzahlen");
        bEinzahlen.setOnAction(e -> einzahlen(e));

        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen

        Button bAuszahlen = new Button("auszahlen");
        bAuszahlen.setOnAction(e -> auszahlen(e));

        box.getChildren().addAll(tfBetrag,bsetzeDispo, bEinzahlen,bAuszahlen);

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:

        int zahl = Integer.parseInt("1234");


        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void setDispo(ActionEvent e) {
        System.out.println("Setze Dispo");
    }

    private void einzahlen(ActionEvent e) {
        System.out.println("Betrag einzahlen");
    }

    private void auszahlen(ActionEvent e) {
        System.out.println("Betrag auszahlen");
    }
}
