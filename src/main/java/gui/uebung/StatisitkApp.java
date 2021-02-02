package gui.uebung;

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

import java.util.ArrayList;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class StatisitkApp extends Application {
    private VBox box;
    private Label leingabe, lmin, lminwert, lmax, lmaxwert, ldurchschnitt, ldurchschnittwert, lsumme, lsummewert, lanzahl, lanzahlwert;
    private TextField txteingabe;
    private List<Integer> liste;
    private int anzahl = 0;
    private String eingabe = "";
    private OptionalInt min;
    private OptionalInt max;
    private OptionalDouble average;
    private int summe;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        liste = new ArrayList<>();
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hBox1 = new HBox(10);
        leingabe = new Label("Eingabe");
        txteingabe = new TextField();
        Button btnhinzufügen = new Button("Hinzufügen");
        btnhinzufügen.setOnAction(e -> hinzufuegen(e));
        hBox1.getChildren().addAll(leingabe,txteingabe,btnhinzufügen);

        HBox hBox2 = new HBox(10);
        lmin = new Label("Min: ");
        lminwert = new Label("");
        lmax = new Label("Max: ");
        lmaxwert = new Label("");
        hBox2.getChildren().addAll(lmin,lminwert,lmax,lmaxwert);

        HBox hBox3 = new HBox(10);
        ldurchschnitt = new Label("Durchschnitt: ");
        ldurchschnittwert = new Label("");
        hBox3.getChildren().addAll(ldurchschnitt,ldurchschnittwert);

        HBox hBox4 = new HBox(10);
        lsumme = new Label("Summe: ");
        lsummewert = new Label("");
        hBox4.getChildren().addAll(lsumme,lsummewert);

        HBox hBox5 = new HBox(10);
        lanzahl = new Label("Anzahl: ");
        lanzahlwert = new Label("");
        hBox5.getChildren().addAll(lanzahl,lanzahlwert);

        HBox hBox6 = new HBox(10);
        Button btnlisteleeren = new Button("Liste Leeren");
        btnlisteleeren.setOnAction(e -> ListeLeeren(e));
        hBox6.getChildren().addAll(btnlisteleeren);

        box.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);


        primaryStage.setTitle("Login");
        primaryStage.show();

    }

    private void hinzufuegen(ActionEvent e) {
        eingabe = String.valueOf(txteingabe.getText());
        liste.add(Integer.valueOf(eingabe));
        max = liste
                .stream()
                .mapToInt(v -> v)
                .max();
        min = liste
                .stream()
                .mapToInt(v -> v)
                .min();

        average = liste
                .stream()
                .mapToInt(v -> v)
                .average();
        summe = liste
                .stream()
                .mapToInt(v -> v)
                .sum();

        lsummewert.setText(String.valueOf(summe));
        ldurchschnittwert.setText(String.valueOf(average));
        lminwert.setText(String.valueOf(min));
        lmaxwert.setText(String.valueOf(max));
        anzahl = liste.size();
        lanzahlwert.setText(String.valueOf(anzahl));

    }
    private void ListeLeeren(ActionEvent e) {
        liste.clear();
        max = liste
                .stream()
                .mapToInt(v -> v)
                .max();
        min = liste
                .stream()
                .mapToInt(v -> v)
                .min();

        average = liste
                .stream()
                .mapToInt(v -> v)
                .average();
        summe = liste
                .stream()
                .mapToInt(v -> v)
                .sum();

        lsummewert.setText(String.valueOf(summe));
        ldurchschnittwert.setText(String.valueOf(average));
        lminwert.setText(String.valueOf(min));
        lmaxwert.setText(String.valueOf(max));
        anzahl = liste.size();
        lanzahlwert.setText(String.valueOf(anzahl));

    }
}
