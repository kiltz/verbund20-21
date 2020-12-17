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

    Konto konto = new Konto();
    private TextField tfEingabe;
    private int betrag;
    private Label lKontostand;
    private Label lDispo;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
        tfEingabe = new TextField();
        tfEingabe.setPrefWidth(225);
        lKontostand = new Label();
        lDispo = new Label();

        HBox hBoxEingabe = new HBox(10);
        HBox hBoxButtons = new HBox(10);
        HBox hBoxGetValues = new HBox(10);

        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
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
        box.getChildren().add(lKontostand);
        box.getChildren().add(lDispo);
        hBoxEingabe.getChildren().add(tfEingabe);
        hBoxButtons.getChildren().addAll(btSetDispo,btEinzahlen,btAuszahlen);
        box.getChildren().addAll(hBoxEingabe, hBoxButtons, hBoxGetValues);

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
        betrag = Integer.parseInt(tfEingabe.getText());
        konto.auszahlen(betrag);
        lKontostand.setText("Kontostand: " + konto.getKontostand());
    }

    private void einzahlen(ActionEvent e) {
        System.out.println("Einzahlen!");
        betrag = Integer.parseInt(tfEingabe.getText());
        konto.einzahlen(betrag);
        lKontostand.setText("Kontostand: " + konto.getKontostand());
    }

    private void setDispo(ActionEvent e) {
        System.out.println("Dispo setzen!");
        betrag = Integer.parseInt(tfEingabe.getText());
        konto.setDispo(betrag);
        lDispo.setText("Dispo-Höhe: " + (konto.getDispo()));
    }
}
