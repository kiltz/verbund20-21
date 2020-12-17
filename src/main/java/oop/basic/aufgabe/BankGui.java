package oop.basic.aufgabe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGui extends Application {

    private TextField betragFeld;
    private Konto konto=new Konto();
    Label ausgabeDispo;
    Label ausgabeKontostand;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        ausgabeDispo=new Label("Aktueller Dispostand: 0");
        ausgabeKontostand=new Label("Aktueller Kontostand: 0");

        HBox hboxBetrag=new HBox(10);
        Label textEingabe=new Label("Geben Sie hier Ihren Betrag ein:");
        betragFeld=new TextField();

        hboxBetrag.getChildren().addAll(textEingabe, betragFeld);

        Button setDispo=new Button("setze Dispo");
        setDispo.setOnAction(e->setDispo(e));

        Button einzahlB=new Button("einzahlen");
        einzahlB.setOnAction(e->einzahlen(e));

        Button auszahlB=new Button("auszahlen");
        auszahlB.setOnAction(e->auszahlen(e));


        box.getChildren().addAll(hboxBetrag, setDispo, einzahlB, auszahlB, ausgabeDispo, ausgabeKontostand);




        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }


    private void auszahlen(ActionEvent e) {

        int betrag=Integer.parseInt(betragFeld.getText());
        konto.auszahlen(betrag);
        ausgabeKontostand.setText("Aktueller Kontostand" + konto.getKontostand());
    }

    private void einzahlen(ActionEvent e) {

        int betrag=Integer.parseInt(betragFeld.getText());
        konto.einzahlen(betrag);
        ausgabeKontostand.setText("Aktueller Kontostand: " + konto.getKontostand());
    }

    private void setDispo(ActionEvent e) {

        int betrag=Integer.parseInt(betragFeld.getText());
        konto.setDispo(betrag);
        ausgabeDispo.setText("Aktueller Dispostand: " + konto.getDispo());
    }
}
