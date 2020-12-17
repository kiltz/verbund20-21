package oop.erbe.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGUI extends Application {
    private TextField tBetrag;
    private PasswordField tfeinzahlen;
    private Label lauszahlen;
    private Label lDispo;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        HBox hBoxName = new HBox(10);
        Label lName = new Label("Name");
        tBetrag = new TextField();
        lDispo = new Label();

        Button bDispo = new Button("Setze Dispo");
        bDispo.setOnAction(e -> setDispo());
        Button bEinzahlen = new Button("Einzahlen");
        bEinzahlen.setOnAction(e -> setEinzahlung());
        Button bausnzahlen = new Button("Setze Dispo");
        bausnzahlen.setOnAction(e -> setAuszahlen(e));


        box.getChildren().addAll(hBoxName, bDispo, bEinzahlen, bausnzahlen,tBetrag);


        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();
    }

    private void setAuszahlen(ActionEvent e) {
        System.out.println("Auszahlen!");

    }

    private void setEinzahlung() {
        System.out.println("Einzahlen!");
    }

    private void setDispo() {
        System.out.println("Dispo einsetzen!");
    }


    // 1. erzeuge ein Eingabfeld für den Betrag

    // 2. Erzeuge einen Button für "setze Dispo"
    // er soll eine Methode setDispo(...) aufrufen

    // 3. erzeuge einen Button "einzahlen"
    // er soll eine Methode einzahlen(...) aufrufen

    // 4. erzeuge einen Button "auszahlen"
    // er soll eine Methode auszahlen(...) aufrufen

    // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

    // 6. Wandele den Betrag aus dem TextFeld in eine Zahl um
    // Beispiel:
    int zahl = Integer.parseInt("1234");

    }

