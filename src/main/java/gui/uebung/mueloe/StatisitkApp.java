package gui.uebung.mueloe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 *
 */
public class StatisitkApp extends Application {

    private TextField tfEingabe;
    private Label lMin;
    private Label lMax;
    private Label lDurchschnitt;
    private Label lSumme;
    private Label lAnzahl;

    private List<Integer> liste;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        liste = new ArrayList<>();
        VBox root = new VBox(10);
        root.getChildren().add(getEingabeZeile());
        root.getChildren().add(getMinMaxZeile());
        root.getChildren().add(getDurchSchnittUndSummeZeile());
        root.getChildren().add(getAnzahlZeile());
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Statistik");
        primaryStage.show();
    }

    private Node getAnzahlZeile() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        lAnzahl = new Label("0");
        lAnzahl.setTextFill(Color.web("#005091"));
        Button bLeereListe = new Button("Liste zurück setzen");
        bLeereListe.setOnAction(e -> leereListe());
        box.getChildren().addAll(new Label("Anzahl"), lAnzahl, bLeereListe);
        return box;
    }

    private void leereListe() {
        liste = new ArrayList<>();
        lMin.setText("0");
        lMax.setText("0");
        lDurchschnitt.setText("0");
        lSumme.setText("0");
        lAnzahl.setText("0");
    }

    private Node getDurchSchnittUndSummeZeile() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        lDurchschnitt = new Label("0");
        lDurchschnitt.setTextFill(Color.web("#005091"));
        lSumme = new Label("0");
        lSumme.setTextFill(Color.web("#005091"));
        box.getChildren().addAll(new Label("Durchschnitt:"), lDurchschnitt, new Label("Summe:"),lSumme);
        return box;
    }

    private Node getMinMaxZeile() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        lMin = new Label("0");
        lMin.setTextFill(Color.web("#005091"));
        lMax = new Label("0");
        lMax.setTextFill(Color.web("#005091"));
        box.getChildren().addAll(new Label("Min:"), lMin, new Label("Max:"),lMax);
        return box;
    }

    private Node getEingabeZeile() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        tfEingabe = new TextField();
        tfEingabe.setMaxWidth(60);

        Button bHinzu = new Button("hinzu fügen");
        bHinzu.setDefaultButton(true);
        bHinzu.setOnAction(e -> hinzufuegen());

        box.getChildren().addAll(new Label("Eingabe"), tfEingabe, bHinzu);
        return box;
    }

    private void hinzufuegen() {
        String eingabe = tfEingabe.getText();
        Integer eingabeAlsInt = Integer.parseInt(eingabe);
        // hinzufügen des neuen Elementes zu der Liste
        liste.add(eingabeAlsInt);
        lAnzahl.setText(""+liste.size());
        int summe = 0;
        int min = -1;
        int max = 0;
        // Liste durchlaufen (iterieren)
        for (Integer i : liste) {
            summe += i;
            if (min == -1 || min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        lSumme.setText(""+summe);
        lDurchschnitt.setText(""+(summe/liste.size()));
        lMin.setText(""+min);
        lMax.setText(""+max);

        tfEingabe.setText("");
    }
}
