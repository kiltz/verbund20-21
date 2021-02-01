package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import oop.basic.aufgabe.muloe.Konto;
import javax.xml.soap.Text;

public class BankGui extends Application {
    private TextField tfName;
    private Konto konto;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
        TextField tfBetrag = new TextField("Betrag");
        HBox hBoxName = new HBox(10);
        hBoxName.getChildren().addAll(tfBetrag);
        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        Button bDispo = new Button("Setze Dispo");
        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button bEinzahlen = new Button("Einzahlen");
        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen
        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.
        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        int zahl = Integer.parseInt("tfBetrag");
        Label lKontostand = new Label("Kontostand:" + konto);
        Label lAusgezahlt = new Label("Ausgezahlt");
        // Beispiel:
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }
}
