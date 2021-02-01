package gui.aufgabe.mueloe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Aufgabe:
 * Kopiert diese Datei nach RechnerApp.
 * Zwei Textfelder, zwei Label und einen Button anzeigt.
 * <p>
 * [.5.] + [.2.] (=) 7
 */
public class RechnerApp extends Application {

    private Label lErgebnis;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lEins = new Label("+");
        lErgebnis = new Label("7");
        TextField tfEins = new TextField("5");
        tfEins.setMaxWidth(50);
        TextField tfZwei = new TextField("2");
        tfZwei.setMaxWidth(50);
        Button bRechne = new Button(" = ");
        bRechne.setDefaultButton(true);
        bRechne.setOnAction(e -> rechne(e));

        HBox root = new HBox();
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 10, 50);
        root.setPadding(insets);
        /*
        root.getChildren().add(tfEins);
        root.getChildren().add(lEins);
        root.getChildren().add(tfZwei);
        root.getChildren().add(bRechne);
        root.getChildren().add(lErgebnis);
        oder kürzer:
         */
        root.getChildren().addAll(tfEins, lEins,tfZwei, bRechne, lErgebnis);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Rechner");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void rechne(ActionEvent e) {
        System.out.println("Klick");
        // Textfelder auslesen

        // String in int umwandeln
        int zahl1 = Integer.parseInt("78");

        // rechnen

        // Ergebnis ausgeben
        lErgebnis.setText("Ergebnis");

        // Bis 11:35 Uhr
    }
}
