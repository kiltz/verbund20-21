package gui;


import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

import javax.xml.soap.Text;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/*
Aufgabenstellung:
Zahleneingabe: Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 */

public class statistikApp extends Application {

    private Label lMin;
    private Label lMax;
    private Label lDurchschnitt;
    private Label lSumme;
    private Label lAnzahlEingabe;
    private TextField textEingabe;
    private int zahl;
    private ArrayList<Integer> liste = new ArrayList<Integer>();


    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(15);
        root.getChildren().addAll(getEing(), getMinMax(), getDurchsch(), getSumme(), getAnzEingabe());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.getScene(scene);
        primaryStage.getTitle("Statistik App");
        primaryStage.show();
    }

    private Node getAnzEingabe() {
        HBox box = new HBox(18);
        lAnzahlEingabe = new Label("Anzahl Eingabe");
        box.getChildren().add(lAnzahlEingabe);
        return box;
    }

    private Node getSumme() {
        HBox box = new HBox(18);
        lSumme = new Label("Summe");
        box.getChildren().add(lSumme);
        return box;
    }

    private Node getDurchsch() {
        HBox box = new HBox(18);
        lDurchschnitt = new Label("Durchschnitt!");
        box.getChildren().add(lDurchschnitt);
        return box;
    }

    private Node getMinMax() {
        HBox box = new HBox(18);
        lMin = new Label("Min" + liste.stream());
        lMax = new Label("Max");
        box.getChildren().add(lMin, lMax);
        return box;
    }

    private Node getEing() {
        HBox box = new HBox(18);
        box.setPadding(new Insets(10));
        Label lEingabe = new Label("Eingabe");
        textEingabe = new TextField();
        textEingabe.getPreferredSize(50);
        Button btnHinzufuegen = new Button("Add");
        btnHinzufuegen.setDefaultButton(true);
        btnHinzufuegen.setOnAction(e -> hinzufuegen());
        box.getChildren().addAll(lEingabe, textEingabe, btnHinzufuegen);
        return box;
    }

    private void hinzufuegen() {
        zahl = Integer.parseInt(textEingabe, getText());
        liste.add(zahl);
    }
}
