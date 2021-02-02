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

import javax.swing.text.html.Option;
import javax.xml.soap.Text;
import java.awt.font.NumericShaper;
import java.lang.reflect.Array;
import java.util.*;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */
public class StatisitkApp extends Application {

    private TextField tfInput;
    private Label lMin;
    private Label lMax;
    private Label lAverage;
    private Label lSum;
    private Label lCount;
    private List<Integer> numbers;
    private Integer sum;

    public static void main(String[] args) {
        launch(null);
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        Label lInput = new Label("Eingabe: ");
        tfInput = new TextField();
        Button btHinzufuegen = new Button("Hinzufuegen");
        btHinzufuegen.setOnAction(e -> add(e));

        lMin = new Label("Min: ");
        lMax = new Label("Max: ");
        lAverage = new Label("Durchschnitt: ");
        lSum = new Label("Summe: ");
        lCount = new Label("Anzahl Eingaben: ");

        numbers = new ArrayList<>();

        Button btClear = new Button("Liste leeren");
        btClear.setOnAction(g -> clear(g));

        HBox hInput = new HBox(10);
        hInput.getChildren().addAll(lInput, tfInput, btHinzufuegen);

        HBox hMinMax = new HBox(10);
        hMinMax.getChildren().addAll(lMin, lMax);

        VBox vMain = new VBox(10);
        vMain.setPadding(new Insets(20, 20, 20, 20));
        vMain.getChildren().addAll(hInput, hMinMax, lAverage, lSum, lCount, btClear);

        Scene scene = new Scene(vMain, 500, 400);
        primaryStage.setTitle("Statistik App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void clear(ActionEvent g) {
        numbers.clear();
    }

    private void add(ActionEvent e) {
        try {
            numbers.add(Integer.parseInt(tfInput.getText()));
            if(numbers.size() >= 2){
                min();
                max();
                sum();
                count();
                average();
            }
        } catch (NumberFormatException f) {
            System.out.println("Ungültige Eingabe");
        }
    }

    private Integer sum() {
        sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        lSum.setText("Summe: " + sum);
        return sum;
    }

    private void count() {
        lCount.setText("Anzahl Elemente: " + numbers.size());
    }

    private void average() {
        int average = (sum / numbers.size());
        lAverage.setText(("Durchschnitt: " + average));
    }

    private void min(){
        lMin.setText("Minimum: " + Collections.min(numbers));
    }

    private void max(){
        lMax.setText("Maximum: " + Collections.max(numbers));
    }
}

