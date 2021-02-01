package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
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

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("+");
        Label l2 = new Label("7");
        TextField t1 = new TextField();
        TextField t2 = new TextField();
        Button b1 = new Button("=");
        Font font = Font.font("Arial", FontWeight.BOLD, 12);
        b1.setFont(font);
        HBox root = new HBox();
        root.getChildren().addAll(t1, l1, t2, b1,l2);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
