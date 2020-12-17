package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import oop.basic.aufgabe.Konto;

import java.awt.*;

public class BankGui extends Application {

    private TextField tfBetrag;
    private int betrag;
    private Konto konto;
    private Label dispo;
    private Label kontostand;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        konto = new Konto();


        // 1. erzeuge ein Eingabfeld für den Betrag
        tfBetrag = new TextField("Betrag eingeben: ");

        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        Button bDispo = new Button("Dispo setzen");
        bDispo.setOnAction(e -> setDispo(e));

        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button bEinzahlen = new Button("Einzahlen");
        bEinzahlen.setOnAction(e -> einzahlen(e));

        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        Button bAuszahlen = new Button("Auszahlen");
        bAuszahlen.setOnAction(e -> auszahlen(e));

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.
        // tun sie

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:

        box.getChildren().addAll(tfBetrag, bDispo, bEinzahlen, bAuszahlen);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }



    private void auszahlen(ActionEvent e) {
        betrag = Integer.parseInt(tfBetrag.getText());
        konto.auszahlen(betrag);
        }



    private void einzahlen(ActionEvent e) {
        betrag = Integer.parseInt(tfBetrag.getText());
        konto.einzahlen(betrag);
        kontostand = new Label("Kontostand" + konto.getKontostand());

    }

    private void setDispo(ActionEvent e) {
        betrag = Integer.parseInt(tfBetrag.getText());
        konto.setDispo(betrag);
    }
}
