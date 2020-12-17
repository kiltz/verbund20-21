package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.awt.*;

public class BankGui extends Application {

    private TextField tfEingabe;


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);


        // 1. erzeuge ein Eingabfeld für den Betrag
        HBox hBoxEingabe = new HBox(10);
        tfEingabe = new TextField();

        hBoxEingabe.getChildren().add(tfEingabe);

        int value = Integer.parseInt(tfEingabe.getText());

        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        HBox hBoxSetDispo = new HBox(10);

        Button btSetDispo = new Button("Set Dispo");
        btSetDispo.setActionCommand(Konto.setDispo(value));
        hBoxSetDispo.getChildren().add(btSetDispo);

        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        HBox hBoxEinzahlen = new HBox(10);

        Button btEinzahlen = new Button("Einzahlen");
        btEinzahlen.setActionCommand(Konto.einzahlen(value));
        hBoxEinzahlen.getChildren().add(btEinzahlen);

        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        HBox hBoxAuszahlen = new HBox(10);

        Button btAuszahlen = new Button("Auszahlen");
        btAuszahlen.setActionCommand(Konto.auszahlen(value));
        hBoxAuszahlen.getChildren().add(btAuszahlen);

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        int zahl = Integer.parseInt("1234");


        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();


    }
}
