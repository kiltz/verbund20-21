package oop.basic.aufgabe.muloe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class BankGui extends Application {
    private TextField tfBetrag;
    private Konto konto;
    private Label lDispo;
    private Label lKontostand;

    @Override
    public void start(Stage primaryStage) throws Exception {
        konto = new Konto();
        VBox box = new VBox(10);
        box.setPadding(new Insets(30, 30, 30, 20));

        // 1. erzeuge ein Eingabfeld für den Betrag
        tfBetrag = new TextField();

        // 2. Erzeuge einen Button für "setze Dispo"
        Button bDispo = new Button("setze Dispo");
        // er soll eine Methode setDispo(...) aufrufen
        bDispo.setOnAction(e -> setDispo(e));

        // 3. erzeuge einen Button "einzahlen"
        Button bEinzahlen = new Button("einzahlen");
        // er soll eine Methode einzahlen(...) aufrufen
        bEinzahlen.setOnAction(e -> zahlen(true));

        // 4. erzeuge einen Button "auszahlen"
        Button bAuszahlen = new Button("auszahlen");
        // er soll eine Methode auszahlen(...) aufrufen
        bAuszahlen.setOnAction(e -> zahlen(false));

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        lDispo = new Label("Dispo: " + konto.getDispo());
        lKontostand = new Label("Kontostand: " + konto.getKontostand());

        box.getChildren().addAll(tfBetrag, bDispo, bEinzahlen, bAuszahlen,
                lDispo, lKontostand);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void zahlen(boolean einzahlen) {
        int zahl = Integer.parseInt(tfBetrag.getText());
        tfBetrag.setText("");
        if (einzahlen) {
            konto.einzahlen(zahl);
        } else {
            konto.auszahlen(zahl);
        }
        if (konto.getKontostand() < 0) {
            lKontostand.setTextFill(Color.web("#E23130"));
        } else {
            lKontostand.setTextFill(Color.web("#005091"));
        }
        lKontostand.setText("Kontostand: " + konto.getKontostand());
    }

    private void setDispo(ActionEvent e) {
        int zahl = Integer.parseInt(tfBetrag.getText());
        konto.setDispo(zahl);
        lDispo.setText("Dispo: " + konto.getDispo());
    }
}
