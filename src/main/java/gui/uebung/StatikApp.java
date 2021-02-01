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
import java.util.Collections;
import java.util.List;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */
public class StatikApp extends Application {

    private TextField tfEingabe;
    private Label lMin;
    private Label lMax;
    private Label lDurchschnitt;
    private Label lSumme;
    private Label lAnzahl;
    private List<Integer> numbers;
    private Integer sum;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lEingabe = new Label("Eingabe: ");
        tfEingabe = new TextField();
        Button btHinzufuegen = new Button("Hinzufuegen");
        btHinzufuegen.setOnAction(e -> hinzufuegen(e));

        lMin = new Label("Min: ");
        lMax = new Label("Max: ");
        lDurchschnitt = new Label("Durchschnitt: ");
        lSumme = new Label("Summe: ");
        lAnzahl = new Label("Anzahl Eingaben: ");

        numbers = new ArrayList<>();

        Button btClear = new Button("Liste leeren");
        btClear.setOnAction(g -> clear(g));

        HBox hEingabe = new HBox(10);
        hEingabe.getChildren().addAll(lEingabe, tfEingabe, btHinzufuegen);

        HBox hMinMax = new HBox(10);
        hMinMax.getChildren().addAll(lMin, lMax);

        VBox vMain = new VBox(10);
        vMain.setPadding(new Insets(20, 20, 20, 20));
        vMain.getChildren().addAll(hEingabe, hMinMax, lDurchschnitt, lSumme, lAnzahl, btClear);

        Scene scene = new Scene(vMain, 500, 400);
        primaryStage.setTitle("Statistik App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void clear(ActionEvent g) {
        numbers.clear();
    }

    private void hinzufuegen(ActionEvent e) {
        try {
            numbers.add(Integer.parseInt(tfEingabe.getText()));
            if(numbers.size() >= 2){
                min();
                max();
                sum();
                anzahl();
                average();
            }
        } catch (NumberFormatException f) {
            System.out.println("Ungueltige Eingabe");
        }
    }

    private Integer sum() {
        sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        lSumme.setText("Summe: " + sum);
        return sum;
    }

    private void anzahl() {
        lAnzahl.setText("Anzahl Elemente: " + numbers.size());
    }

    private void average() {
        int average = (sum / numbers.size());
        lDurchschnitt.setText(("Durchschnitt: " + average));
    }

    private void min(){
        lMin.setText("Min: " + Collections.min(numbers));
    }

    private void max(){
        lMax.setText("Max: " + Collections.max(numbers));
    }
}