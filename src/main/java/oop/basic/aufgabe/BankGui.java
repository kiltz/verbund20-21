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

    private TextField tfEingabe;
    Konto konto = new Konto();
    private int betrag;
    private Label lKontostand;
    private Label lDispo;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        // 1. erzeuge ein Eingabfeld für den Betrag
        HBox hBoxEingabe = new HBox(10);
        tfEingabe = new TextField();
        lKontostand = new Label();
        lDispo = new Label();


        // 2. Erzeuge einen Button für "setze Dispo"
            // er soll eine Methode setDispo(...) aufrufen
        HBox hBoxButtons = new HBox(10);
        HBox hBoxGetValues = new HBox(10);

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

        // Button um den Kontostand "abzufragen"
        Button btKontostand = new Button("Kontostand");
        btKontostand.setOnAction(e -> getKontostand(e));

        //Button um den Dispo "anzuzeigen"
        Button btDispo = new Button("Dispo anzeigen");
        btDispo.setOnAction(e -> getDispo(e));

        // Hinzufügen aller Elemente:
        hBoxEingabe.getChildren().add(tfEingabe);
        hBoxButtons.getChildren().addAll(btSetDispo,btEinzahlen,btAuszahlen);
        hBoxGetValues.getChildren().addAll(btKontostand,btDispo);
        box.getChildren().addAll(hBoxEingabe, hBoxButtons, hBoxGetValues);
        box.getChildren().add(lKontostand);
        box.getChildren().add(lDispo);

        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.



        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        int zahl = Integer.parseInt("1234");

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void getDispo(ActionEvent e) {
        System.out.println("Dispo anzeigen!");
        lDispo.setText("Dispo-Höhe: "+ konto.getDispo());
    }

    private void getKontostand(ActionEvent e) {
        System.out.println("Kontostand");
        lKontostand.setText("Kontostand: " + konto.getKontostand());
    }

    private void auszahlen(ActionEvent e) {
        System.out.println("Auszahlen!");
        betrag = Integer.parseInt(tfEingabe.getText());
        konto.auszahlen(betrag);
    }

    private void einzahlen(ActionEvent e) {
        System.out.println("Einzahlen!");
        betrag = Integer.parseInt(tfEingabe.getText());
        konto.einzahlen(betrag);
    }

    private void setDispo(ActionEvent e) {
        System.out.println("Dispo setzen!");
        betrag = Integer.parseInt(tfEingabe.getText());
        konto.setDispo(betrag);
    }
}
