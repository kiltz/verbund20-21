package oop.basic.aufgabe2.muloe;

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

import javax.swing.*;

public class WuerfelStatistikGui extends Application {

    WuerfelStatistik wuerfel=new WuerfelStatistik();
    TextField tAnzahl;
    TextField tAusgabe;
    Label ausgabe;

    public static void main(String[] args) {
        launch(args);
    }
    public void start(Stage primaryStage) throws Exception{
        VBox box=new VBox(10);
        box.setPadding(new Insets(10,10,10,10));

        HBox hboxAnzahl=new HBox();
        Label lAnzahl=new Label("Wie viele Seiten soll der Würfel haben?");
        tAnzahl=new TextField();
        hboxAnzahl.getChildren().addAll(lAnzahl, tAnzahl);

        HBox hbox=new HBox();
        Label lAusgabeZahl=new Label("Welche Zahl soll ausgegeben werden?");
        tAusgabe=new TextField();
        hbox.getChildren().addAll(lAusgabeZahl, tAusgabe);


        Button bWurf=new Button("Wirf den Wuerfel!");
        bWurf.setOnAction(e->wurf(e));

        ausgabe=new Label();
        box.getChildren().addAll(hboxAnzahl, hbox, bWurf, ausgabe);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wuerfel");
        primaryStage.show();
    }

    private void wurf(ActionEvent e) {
        try {
            int anzahl = Integer.parseInt(tAnzahl.getText());
            int[] ergebnisse = wuerfel.wurf(anzahl);
            int zahlAusgabe = Integer.parseInt(tAusgabe.getText());
            if (zahlAusgabe > anzahl) {
                ausgabe.setText("Ausgabe für diese Zahl nicht möglich");
            } else {
                ausgabe.setText("Ausgabe der Zahl " + zahlAusgabe + ": " + ergebnisse[zahlAusgabe - 1]);
            }
        }
        catch(NumberFormatException f){
            ausgabe.setText("Fehlerhafte Eingabe");
        }
    }
}
