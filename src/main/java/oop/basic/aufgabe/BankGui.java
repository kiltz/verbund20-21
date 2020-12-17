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

    private TextField betragFeld;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
        HBox hboxBetrag=new HBox(10);
        Label textEingabe=new Label("Geben Sie hier Ihren Betrag ein:");
        betragFeld=new TextField();

        hboxBetrag.getChildren().addAll(textEingabe, betragFeld);
        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        Button setDispo=new Button("setze Dispo");
        setDispo.setOnAction((e->setDispo());
        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button einzahlB=new Button("einzahlen");
        einzahlB.setOnAction(e->einzahlen());
        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        Button auszahlB=new Button("auszahlen");
        auszahlB.setOnAction(e->auszahlen());


        box.getChildren().addAll(hboxBetrag, setDispo, einzahlB, auszahlB);
        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        int eingegebenerBetrag = Integer.parseInt(betragFeld.getText());


        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }
}
