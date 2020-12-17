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
    private TextField betragFeld;
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);

        //eingabefeld
        HBox hboxBetrag=new HBox(10);
        Label textEingabe=new Label("Betrag eingeben:");
        betragFeld=new TextField();

        hboxBetrag.getChildren().addAll(textEingabe, betragFeld);
        //setze dispoo
        Button setDispo=new Button("Dispoo setzen");
        setDispo.setOnAction((e->setDispo(e)));
        //einzahlbutton
        Button einzahlB=new Button("Einzahlen");
        einzahlB.setOnAction(e->einzahlen(e));
        //ausgabebutton
        Button auszahlB=new Button("Auszahlen");
        auszahlB.setOnAction(e->auszahlen(e));


        box.getChildren().addAll(hboxBetrag, setDispo, einzahlB, auszahlB);
        // 5. Überprüfe, das die Button die richtigen Methoden aufrufen.

        // umwandlung in zahl


        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();

    }

    private void setDispo(ActionEvent e) {
        System.out.println("Dispo setzen !");
        int eingegebenerBetrag = Integer.parseInt(betragFeld.getText());


    }




    private void einzahlen(ActionEvent e) {
        System.out.println("Betrag einzahlen");
        int eingegebenerBetrag = Integer.parseInt(betragFeld.getText());

    }

    private void auszahlen(ActionEvent e) {
        System.out.println("Betrag auszahlen");
        int eingegebenerBetrag = Integer.parseInt(betragFeld.getText());

    }
}
