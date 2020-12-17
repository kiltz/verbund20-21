package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGui extends Application {
    private TextField bFeld;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        // 1. erzeuge ein Eingabfeld für den Betrag
        HBox betrag = new HBox(20);
        Label textFeld = new Label("Betrag: ");
        bFeld = new TextField();
        betrag.getChildren().addAll(textFeld, bFeld);


        // 2. Erzeuge einen Button für "setze Dispo"
        Button bDispo = new Button("Setze Dispo");
        bDispo.setOnAction((e -> setDispo()));

            // er soll eine Methode setDispo(...) aufrufen

        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button bEinzahlen = new Button("Einzahlen");
        bEinzahlen.setOnAction(e->einzahlen());

        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        Button bAuszahlen = new Button("Auszahlen");
        bAuszahlen.setOnAction(e->auszahlen());
        box.getChildren().addAll(betrag, bDispo, bEinzahlen, bAuszahlen);

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:


        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void setDispo() {
        System.out.println("Dispo");
        int zahl = Integer.parseInt(bFeld.getText());
    }

    private void auszahlen() {
        System.out.println("auszahlen");
    }

    private void einzahlen() {
        System.out.println("einzahlen");
    }
}
