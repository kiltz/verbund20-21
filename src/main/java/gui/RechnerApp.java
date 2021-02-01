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
        Label label1 = new Label("+");
        Label label2 = new Label("7");
        TextField texfield1 = new TextField("5");
        TextField texfield2 = new TextField("2");
        Button button1 = new Button("=");
        HBox root = new HBox();
        root.getChildren().add(texfield1);
        root.getChildren().add(label1);
        root.getChildren().add(texfield2);
        root.getChildren().add(button1);
        root.getChildren().add(label2);
        Scene scene = new Scene(root, 500, 400);

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
