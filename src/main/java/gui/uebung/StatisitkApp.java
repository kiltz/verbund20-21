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
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */

public class StatisitkApp extends Application {

    TextField tfEingabe;
    List<Integer> list = new ArrayList<>();
    Label lSumme;
    Label lDurchschnitt;
    Label lMin;
    Label lMax;
    Label lAnzahl;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10,20,20,10));
        root.getChildren().addAll(getInput(),getMinMax(),getDurchschnitt(),getSumme(),getAnzahl(), getListeLeeren());
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getListeLeeren() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        Button bDelete = new Button("Liste leeren");
        bDelete.setDefaultButton(true);
        bDelete.setOnAction(e -> list.clear());
        box.getChildren().add(bDelete);
        return box;
    }

    private Node getSumme() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        lSumme = new Label("Summe: ");
        box.getChildren().add(lSumme);
        return box;
    }

    private Node getAnzahl() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        lAnzahl = new Label("Anzahl :");
        lAnzahl.setText("Anzahl :"+ list.size());
        box.getChildren().add(lAnzahl);
        return box;
    }

    private Node getDurchschnitt() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        lDurchschnitt = new Label("Durchschnitt: ");
        box.getChildren().add(lDurchschnitt);
        return box;
    }

    private Node getMinMax() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        lMin = new Label("0");
        lMin.setTextFill(Color.web("#005091"));
        lMax = new Label("0");
        lMax.setTextFill(Color.web("#005091"));
        box.getChildren().addAll(new Label("Min:"), lMin, new Label("Max:"),lMax);
        return box;
    }

    private Node getInput() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfEingabe = new TextField();
        Button bAdd = new Button("Hinzufuegen");
        bAdd.setDefaultButton(true);
        bAdd.setOnAction(e -> add());
        box.getChildren().addAll(new Label("Eingabe"), tfEingabe,bAdd);
        return box;
    }

    public void add() {
        String eingabe = tfEingabe.getText();
        Integer eingabeAlsInt = Integer.parseInt(eingabe);
        list.add(eingabeAlsInt);
        //anzahl = (""+list.size());
        Collections.sort(list);
        int summe = 0;
        int min = -1;
        int max = 0;
        // Liste durchlaufen (iterieren)
        for (Integer i : list) {
            summe += i;
            if (min == -1 || min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        lSumme.setText(""+summe);
        lDurchschnitt.setText(""+(summe/list.size()));
        lMin.setText(""+min);
        lMax.setText(""+max);
        lAnzahl.setText(""+list.size());
        tfEingabe.setText("");
    }
    private void leereListe() {
        list = new ArrayList<>();
        lMin.setText("0");
        lMax.setText("0");
        lDurchschnitt.setText("0");
        lSumme.setText("0");
        lAnzahl.setText("0");
    }

}
