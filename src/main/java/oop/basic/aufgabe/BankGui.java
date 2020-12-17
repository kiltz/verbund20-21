package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



public class BankGui extends Application {

    private TextField tfEingabe;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
        HBox hBoxEingabe = new HBox(10);
        tfEingabe = new TextField();

        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        HBox hBoxButtons = new HBox(10);

        Button btSetDispo = new Button("Set Dispo");
        btSetDispo.setOnAction(e -> setDispo(e));

        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button btEinzahlen = new Button("Einzahlen");
        btEinzahlen.setOnAction(e -> einzahlen(e));

        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        Button btAuszahlen = new Button("Auszahlen");
        btAuszahlen.setOnAction(e -> auszahlen(e));

        // Hinzufügen aller Elemente:
        hBoxEingabe.getChildren().add(tfEingabe);
        hBoxButtons.getChildren().addAll(btSetDispo,btEinzahlen,btAuszahlen);
        box.getChildren().addAll(hBoxEingabe, hBoxButtons);

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.



        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        int zahl = Integer.parseInt("1234");

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void auszahlen(ActionEvent e) {
        System.out.println("Auszahlen!");
    }

    private void einzahlen(ActionEvent e) {
        System.out.println("Einzahlen!");
    }

    private void setDispo(ActionEvent e) {
        System.out.println("Dispo Setzen!");
    }
}
