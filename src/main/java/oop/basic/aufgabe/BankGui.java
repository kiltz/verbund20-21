package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGui extends Application {

    private TextField  tfeingabeFeld;
    int betrag;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag

        tfeingabeFeld = new TextField();

        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        Konto k = new Konto();
        Button bsetzeDispo = new Button("setze Dispo");
        bsetzeDispo.setOnAction(e -> k.setDispo(betrag) );

        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen

        Button bEinzahlen = new Button("einzahlen");
        bEinzahlen.setOnAction(e -> k.einzahlen(betrag));

        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen

        Button bAuszahlen = new Button("auszahlen");
        bAuszahlen.setOnAction(e -> k.auszahlen(betrag));

        box.getChildren().addAll(tfeingabeFeld, bEinzahlen,bsetzeDispo,bAuszahlen);

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
