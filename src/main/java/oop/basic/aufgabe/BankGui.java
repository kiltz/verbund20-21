package oop.basic.aufgabe;
import javafx.scene.control.Label;
import oop.basic.aufgabe.muloe.Konto;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.plaf.basic.BasicEditorPaneUI;

public class BankGui extends Application {

    Konto konto = new Konto();
    private TextField tfBetrag;
    private Button BsetzDispo;
    private Button BEinzahlen;
    private Button Bauszahlen;
    private Label lDispo;
    private Label lKontoinfo;
    private int Betrag;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        HBox hBox = new HBox(10);

        lKontoinfo = new Label("Name");
        lDispo = new Label();





        // 1. erzeuge ein Eingabfeld für den Betrag
        tfBetrag = new TextField();

        // 2. Erzeuge einen Button für "setze Dispo"
        BsetzDispo = new Button("setze Dispo");
            // er soll eine Methode setDispo(...) aufrufen
            BsetzDispo.setOnAction(e -> BsetzDispo());
        // 3. erzeuge einen Button "einzahlen"
        BEinzahlen = new Button("hier einzahlen");
            // er soll eine Methode einzahlen(...) aufrufen
            BEinzahlen.setOnAction(e -> BEinzahlen());
        // 4. erzeuge einen Button "auszahlen"
        Bauszahlen = new Button("hier auszahlen");
            // er soll eine Methode auszahlen(...) aufrufen
            Bauszahlen.setOnAction(e -> Bauszahlen());
        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
        // Beispiel:
        int zahl = Integer.parseInt("1234");

        box.getChildren().addAll(tfBetrag,BsetzDispo,BEinzahlen,Bauszahlen,lKontoinfo,lDispo);
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();


    }

    private void BEinzahlen() {
        System.out.println("Zahle Ein");
        int einzahlung = Integer.parseInt(tfBetrag.getText());
        konto.einzahlen(einzahlung);
        lKontoinfo.setText("Kontostand"+konto.getKontostand());
    }

    private void BsetzDispo() {
        System.out.println("Dispo setzen");
        int zahl = Integer.parseInt(tfBetrag.getText());
        konto.setDispo(zahl);
        lDispo.setText("Dispo"+konto.getDispo());
    }
    private void Bauszahlen() {
        System.out.println("Zahle aus");
        int auszahlung = Integer.parseInt(tfBetrag.getText());
        konto.auszahlen(auszahlung);
        lKontoinfo.setText("Kontostand"+konto.getKontostand());

    }
}
