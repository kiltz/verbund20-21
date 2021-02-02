package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
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

    private Label l11;
    private TextField tf1;
    private Label l9;
    private Label l5;
    private Label l3;
    private Label l7;
    private List<Integer> lListe;



    public void Listen() {
        lListe = new ArrayList<>();
    }

    public void add(Integer element) {
        lListe.add(element);
    }

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        lListe = new ArrayList<>();
        Label l1 = new Label("Eingabe");
        tf1= new TextField();
        Button b1 = new Button("Eingabe");
        b1.setOnAction(e -> statistik(e));

        Label l2 = new Label("Min");
        l3 = new Label();
        Label l4 = new Label("Max");
        l5 = new Label();

        Label l6 = new Label("Durchschnitt");
        l7 = new Label();

        Label l8 = new Label("Summe");
        l9 = new Label();

        Label l10 = new Label("Zahlen gesamt");
        l11 = new Label();

        Button b2 = new Button("Reset");
        b2.setOnAction(e -> leereListe());

        HBox hb1 = new HBox();
        hb1.getChildren().addAll(l1, tf1, b1);
        hb1.setSpacing(10.0);
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(l2, l3, l4, l5);
        hb2.setSpacing(10.0);
        HBox hb3 = new HBox();
        hb3.getChildren().addAll(l6, l7);
        hb3.setSpacing(10.0);
        HBox hb4 = new HBox();
        hb4.getChildren().addAll(l8, l9);
        hb4.setSpacing(10.0);
        HBox hb5 = new HBox();
        hb5.getChildren().addAll(l10, l11);
        hb5.setSpacing(10.0);
        HBox hb6 = new HBox();
        hb6.getChildren().addAll(b2);
        hb6.setSpacing(10.0);
        VBox vb1 = new VBox();
        vb1.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6);
        vb1.setSpacing(10.0);
        Scene scene = new Scene(vb1, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void leereListe() {
        lListe = new ArrayList<>();
        l3.setText("0");
        l5.setText("0");
        l7.setText("0");
        l9.setText("0");
        l11.setText("0");
    }


    private void statistik(ActionEvent e) {


        String eingabe = tf1.getText();
        Integer eingabeAlsInt = Integer.parseInt(eingabe);
        // hinzufügen des neuen Elementes zu der Liste
        lListe.add(eingabeAlsInt);
        l11.setText(""+lListe.size());
        int summe = 0;
        int min = -1;
        int max = 0;
        // Liste durchlaufen (iterieren)
        for (Integer i : lListe) {
            summe += i;
            if (min == -1 || min > i) {
                min = i;
            }
            if (max < i) {
                max = i;
            }
        }
        l9.setText(""+summe);
        l7.setText(""+(summe/lListe.size()));
        l3.setText(""+min);
        l5.setText(""+max);

        tf1.setText("");





    }
}
