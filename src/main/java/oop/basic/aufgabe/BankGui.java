package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

@SuppressWarnings("RedundantThrows")
public class BankGui extends Application {

    private TextField tfBetrag;
    private Konto konto;
    private Label lKontostand;
    private Label lDispo;
    private VBox box;
    private Label lFehlermeldung;

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        box.setPadding(new Insets(20, 20, 20, 20));

        konto = new Konto();
        tfBetrag = new TextField();
        lKontostand = new Label();
        lDispo = new Label();
        lFehlermeldung = new Label();
        lKontostand.setTextFill(Color.BLUE);
        lDispo.setTextFill(Color.BLUE);
        lFehlermeldung.setTextFill(Color.RED);

        Button bsetzeDispo = new Button("setze Dispo");
        bsetzeDispo.setOnAction(e -> setDispo(e) );

        Button bEinzahlen = new Button("einzahlen");
        bEinzahlen.setOnAction(e -> einzahlen(e));

        Button bAuszahlen = new Button("auszahlen");
        bAuszahlen.setOnAction(e -> auszahlen(e));

        lKontostand.setText("Kontostand: " + konto.getKontostand());
        lDispo.setText("Dispo: " + konto.getDispo());

        box.getChildren().addAll(tfBetrag,bsetzeDispo, bEinzahlen,bAuszahlen,lKontostand, lDispo, lFehlermeldung);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();
    }

    private void setDispo(ActionEvent e) {
        int betrag = Integer.parseInt(tfBetrag.getText());
        konto.setDispo(betrag);
        lDispo.setText("Dispo: " + konto.getDispo());
    }

    private void einzahlen(ActionEvent e) {
        int betrag = Integer.parseInt(tfBetrag.getText());
        konto.einzahlen(betrag);
        lKontostand.setText("Kontostand: " + konto.getKontostand());
    }

    private void auszahlen(ActionEvent e) {
        try {
        int betrag = Integer.parseInt(tfBetrag.getText());
            konto.auszahlen(betrag);
        } catch (Exception exception) {
            lFehlermeldung.setText("Betrag nicht auszahlbar!");
        }
        lKontostand.setText("Kontostand: " + konto.getKontostand());
    }
}
