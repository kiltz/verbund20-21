package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class BankGui extends Application {
    private TextField tfName;
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
        TextField tfBetrag = new TextField("Betrag");
        HBox hBoxName = new HBox(10);
        hBoxName.getChildren().addAll(tfBetrag);
        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        Button bLogin = new Button("Setze Dispo");
        bLogin.setOnAction(k -> getDispo(tfBetrag));
        // 3. erzeuge einen Button "einzahlen"
            // er soll eine Methode einzahlen(...) aufrufen
        Button bEinzahlen = new Button("Einzahlen");
        bLogin.setOnAction(k -> einzahlen(bEinzahlen));
        // 4. erzeuge einen Button "auszahlen"
            // er soll eine Methode auszahlen(...) aufrufen

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        int zahl = Integer.parseInt("1234");
        box.getChildren().addAll(hBoxName, bLogin);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }
}
