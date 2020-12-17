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
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));


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


        box.getChildren().addAll(hboxBetrag, setDispo, einzahlB, auszahlB);




        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }


    private void auszahlen(ActionEvent e) {
        System.out.println("Auszahlen erreicht");
        int betrag=Integer.parseInt(betragFeld.getText());
    }

    private void einzahlen(ActionEvent e) {
        System.out.println("Einzahlen erreicht");
        int betrag=Integer.parseInt(betragFeld.getText());
    }

    private void setDispo(ActionEvent e) {
        System.out.println("setDispo erreicht");
        int betrag=Integer.parseInt(betragFeld.getText());
    }
}
