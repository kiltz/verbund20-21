package gui;

import javafx.application.Application;
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
 *
 * [.5.] + [.2.] (=) 7
 */
public class RechnerApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField zahl1 = new TextField();
        Label plus = new Label("+");
        TextField zahl2 = new TextField();
        Button is = new Button("=");
        Label ergebnis = new Label("Ergebnis:");

        HBox root = new HBox();

        root.getChildren().addAll(zahl1, plus, zahl2, is, ergebnis);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
