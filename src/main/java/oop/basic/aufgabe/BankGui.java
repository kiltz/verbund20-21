package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGui extends Application {
    private TextField tfBetrag;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
      
        tfBetrag = new TextField();
        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        Button bDispo = new Button("Dispo");
        bDispo.setOnAction(e -> setDispo());
        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button bEinzahlen = new Button("Einzahlen");
        bEinzahlen.setOnAction(e -> einzahlen());
        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        Button bAuszahlen = new Button("Auszahlen");
       bAuszahlen.setOnAction(e -> auszahlen());
        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
         int umwandlung = Integer.parseInt("123");

        box.getChildren().addAll(tfBetrag,bDispo,bEinzahlen,bAuszahlen);
        Scene scene = new Scene(box,  400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void setDispo() {
        System.out.println("Dispo setzen");
    }

    private void einzahlen() {
        System.out.println("einzahlen");
    }

    private void auszahlen() {
        System.out.println("auszahlen");
    }
}
