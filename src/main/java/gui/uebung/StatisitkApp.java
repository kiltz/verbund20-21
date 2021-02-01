package gui.uebung;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */
public class StatisitkApp extends Application {

    private TextField tfEingabe;
    private Label lMin;
    private Label lMax;
    private Label lDurchschnitt;
    private Label lSumme;
    private Label lAnzahlEingabe;
    private ArrayList<Integer> liste = new ArrayList<Integer>();
    private int zahl;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(15);
        root.getChildren().addAll(getEingabe(), getMinMax(), getDurchschnitt(), getSumme(), getAnzahlEingabe());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("StatistikApp");
        primaryStage.show();
    }

    private Node getAnzahlEingabe() {
        HBox box = new HBox(15);
        lAnzahlEingabe = new Label("Anzahl Eingabe");
        box.getChildren().add(lAnzahlEingabe);
        return box;
    }

    private Node getSumme() {
        HBox box = new HBox(15);
        lSumme = new Label("Summe");
        box.getChildren().add(lSumme);
        return box;
    }

    private Node getDurchschnitt() {
        HBox box = new HBox(15);
        lDurchschnitt = new Label("Durchschnitt");
        box.getChildren().add(lDurchschnitt);
        return box;
    }

    private Node getMinMax() {
        HBox box = new HBox(15);
        lMin = new Label("Min" + liste.stream());
        lMax = new Label("Max");
        box.getChildren().addAll(lMin, lMax);
        return box;
    }

    private Node getEingabe() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));

        Label lEingabe = new Label("Eingabe");
        tfEingabe = new TextField();
        tfEingabe.setPrefWidth(50);
        Button bHinzufuegen = new Button("Hinzufügen");
        bHinzufuegen.setDefaultButton(true);
        bHinzufuegen.setOnAction(e -> hinzufuegen());
        box.getChildren().addAll(lEingabe, tfEingabe, bHinzufuegen);

        return box;
    }

    private void hinzufuegen() {
        zahl = Integer.parseInt(tfEingabe.getText());
        liste.add(zahl);
    }
}
