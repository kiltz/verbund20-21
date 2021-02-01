package gui.aufgabe.mueloe;

import javafx.application.Application;
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

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lEins = new Label("+");
        Label lErgebnis = new Label("7");
        TextField tfEins = new TextField("5");
        tfEins.setMaxWidth(50);
        TextField tfZwei = new TextField("2");
        tfZwei.setMaxWidth(50);
        Button bRechne = new Button(" = ");
        bRechne.setDefaultButton(true);

        HBox root = new HBox();
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 10, 50);
        root.setPadding(insets);
        root.getChildren().add(tfEins);
        root.getChildren().add(lEins);
        root.getChildren().add(tfZwei);
        root.getChildren().add(bRechne);
        root.getChildren().add(lErgebnis);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Rechner");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
}
