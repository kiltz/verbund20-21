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
    Label lMmax;
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
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        lMin = new Label("Min: " + list.indexOf(0));
        lMmax = new Label("Max: " + list.lastIndexOf(list));
        box.getChildren().addAll(lMin,lMmax);
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
        for (Integer i:list) {
            summe += eingabeAlsInt;
        }
        lSumme.setText("Summe:" + summe);

    }

}
