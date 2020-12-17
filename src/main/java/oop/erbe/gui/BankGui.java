package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import oop.basic.aufgabe.Konto;

import java.awt.*;

public class BankGui extends Application {

    private TextField tfBetrag;
    private int betrag;
    private Konto konto;
    private Label dispo;
    private Label kontostand;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        konto = new Konto();



        tfBetrag = new TextField("Betrag eingeben: ");


        Button bDispo = new Button("Dispo ");
        bDispo.setOnAction(e -> setDispo(e));

        // 3. erzeuge einen Button "einzahlen"
        // er soll eine Methode einzahlen(...) aufrufen
        Button bEinzahlen = new Button("Einzahlen");
        bEinzahlen.setOnAction(e -> einzahlen(e));


        Button bAuszahlen = new Button("Auszahlen");
        bAuszahlen.setOnAction(e -> auszahlen(e));




        box.getChildren().addAll(tfBetrag, bDispo, bEinzahlen, bAuszahlen);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }



    private void auszahlen(ActionEvent e) {
        betrag = Integer.parseInt(tfBetrag.getText());
        konto.auszahlen(betrag);
    }



    private void einzahlen(ActionEvent e) {
        betrag = Integer.parseInt(tfBetrag.getText());
        konto.einzahlen(betrag);
        kontostand = new Label("Kontostand" + konto.getKontostand());

    }

    private void setDispo(ActionEvent e) {
        betrag = Integer.parseInt(tfBetrag.getText());
        konto.setDispo(betrag);
    }
}