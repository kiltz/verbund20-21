package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.Labeled;
import javafx.scene.control.TextField;
import javafx.scene.input.InputMethodTextRun;
import javafx.scene.layout.HBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

/**
 * Aufgabe:
 * Kopiert diese Datei nach RechnerApp.
 * Zwei Textfelder, zwei Label und einen Button anzeigt.
 *
 * [.5.] + [.2.] (=) 7
 */
public class RechnerApp extends Application {

    private Labeled l2;
    private TextField t1;
    private TextField t2;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("+");
        l2 = new Label("7");
        t1 = new TextField();
        t1.setMaxWidth(50);
        t2 = new TextField();
        t2.setMaxWidth(50);
        Button b1 = new Button("=");
        b1.setOnAction(e -> rechne(e));
        Font font = Font.font("Arial", FontWeight.BOLD, 12);
        b1.setFont(font);
        HBox root = new HBox();
        root.getChildren().addAll(t1, l1, t2, b1,l2);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void rechne(ActionEvent e) {
        System.out.println("Klick");
        // Textfelder auslesen
        int zahl1 = Integer.parseInt(t1.getText());
        int zahl2 = Integer.parseInt(t2.getText());
        int ergebnis=0;
        // String in int umwandeln

        // rechnen
        ergebnis = zahl1 + zahl2;
        // Ergebnis ausgeben
        l2.setText(String.valueOf(ergebnis));


    }
}
