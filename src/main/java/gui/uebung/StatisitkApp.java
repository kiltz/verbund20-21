package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
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


    private TextField zahleneingabe;
    private Label lmin;
    private Label lmax;
    private Label laverage;
    private Label lsum;
    private Label lanzahl;

    private List<Integer> liste;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label e = new Label("Eingabe:");
        zahleneingabe = new TextField();
        Button badd = new Button("Hinzufügen");
        badd.setOnAction(a-> add(a));
        Label lmi = new Label("Min: ");
        lmin = new Label();
        Label lma = new Label("Max: ");
        lmax = new Label();
        Label lav = new Label("Durchschnitt: ");
        laverage = new Label();
        Label lsu = new Label("Summe: ");
        lsum = new Label();
        Label lan = new Label("Anzahl der Eingaben: ");
        lanzahl = new Label();
        Button bclear = new Button("Liste leeren");
        bclear.setOnAction(c-> clear(c));
        liste = new ArrayList<>();





        VBox root = new VBox();

        HBox zeile1 = new HBox();
        zeile1.getChildren().add(e);
        zeile1.getChildren().add(zahleneingabe);
        zeile1.getChildren().add(badd);

        HBox zeile2 = new HBox();
        zeile2.getChildren().add(lmi);
        zeile2.getChildren().add(lmin);
        zeile2.getChildren().add(lma);
        zeile2.getChildren().add(lmax);

        HBox zeile3 = new HBox();
        zeile3.getChildren().add(lav);
        zeile3.getChildren().add(laverage);

        HBox zeile4 = new HBox();
        zeile4.getChildren().add(lsu);
        zeile4.getChildren().add(lsum);

        HBox zeile5 = new HBox();
        zeile5.getChildren().add(lan);
        zeile5.getChildren().add(lanzahl);

        HBox zeile6 = new HBox();
        zeile6.getChildren().add(bclear);


        root.getChildren().add(zeile1);
        root.getChildren().add(zeile2);
        root.getChildren().add(zeile3);
        root.getChildren().add(zeile4);
        root.getChildren().add(zeile5);
        root.getChildren().add(zeile6);



        Insets insets = new Insets(50, 50, 10, 50);
        root.setPadding(insets);
        Scene scene = new Scene(root, 500, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }





    public void add(ActionEvent a) {

        liste.add(Integer.parseInt(zahleneingabe.getText()));

        Collections.sort(liste);
        liste.add(Integer.parseInt(zahleneingabe.getText()));
        Collections.sort(liste);
        lmin.setText(" " + liste.get(0));
        lmax.setText(" " + liste.get(liste.size()-1));
        laverage.setText(" " + getDurchschnitt());
        lsum.setText(" " + getSumme());
        lanzahl.setText(" " + liste.size());
    }



    public void clear(ActionEvent c) {
        liste=new ArrayList<>();
        lmin.setText(" 0");
        lmax.setText(" 0");
        laverage.setText(" 0.0");
        lsum.setText(" 0");
        lanzahl.setText(" " + getAnzahl());
    }


    public double getAnzahl() {
        int anzahl = liste.size();
        anzahl = anzahl - 1;

        return anzahl;

    }

    public double getSumme() {
        int totalSum = 0;
        for (Integer number : liste) {
            if (number % 2 == 0) {
                totalSum += number / 2;
            } else {
                totalSum += number /2 + 1;
            }


        }
        return totalSum;
    }


    public double getDurchschnitt() {
        int totalSum = 0;
        int totalAverage = 0;
        for (Integer number : liste) {
            if (number % 2 == 0) {
                totalSum += number / 2;
            } else {
                totalSum += number /2 + 1;
            }
            totalAverage = totalSum / liste.size();
        }
        return totalAverage;
    }
}
