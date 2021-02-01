package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 * Aufgabe:
 * Kopiert diese Datei nach RechnerApp.
 * Zwei Textfelder, zwei Label und einen Button anzeigt.
 *
 * [.5.] + [.2.] (=) 7
 */

public class RechnerApp extends Application {

    private TextField tfZahl1;
    private TextField tfZahl2;
    private Label lErgebnis;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        tfZahl1 = new TextField();
        tfZahl1.setMaxWidth(80);

        Label plus = new Label("+");

        tfZahl2 = new TextField();
        tfZahl2.setMaxWidth(80);

        lErgebnis = new Label("Ergebnis:");

        Button btBerechne = new Button("=");
        btBerechne.setOnAction(e -> berechne(e));

        HBox root = new HBox(10);
        root.setPadding(new Insets(10, 20, 20, 20));

        root.getChildren().addAll(tfZahl1, plus, tfZahl2, btBerechne, lErgebnis);

        Scene scene = new Scene(root, 700, 250);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void berechne(ActionEvent e) {
        try {
            int zahl1 = Integer.parseInt(tfZahl1.getText());
            int zahl2 = Integer.parseInt(tfZahl2.getText());
            int ergebnis = zahl1 + zahl2;

            lErgebnis.setText("Ergebnis: " + ergebnis);
            lErgebnis.setTextFill(Color.valueOf("#000000"));

        } catch (NumberFormatException f) {
            lErgebnis.setText("Ungueltige Eingabe!");
            lErgebnis.setTextFill(Color.valueOf("#ff0000"));
        }
    }
}
