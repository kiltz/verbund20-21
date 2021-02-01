package gui.controls.basics;
import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Aufgabe:
 * Kopiert diese Datei nach RechnerApp.
 * Zwei Textfelder, zwei Label und einen Button anzeigt.
 *
 * [.5.] + [.2.] (=) 7
 */
class BasicsApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l = new Label("Hallo App!");
        HBox root = new HBox();
        root.getChildren().add(l);
        root.getChildren().add(getTextFelder());
        root.getChildren().add(getTextFelder());
        root.getChildren().add(getButtons());
        root.getChildren().add(getLabels());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Node getLabels() {
        HBox box = new HBox();
        box.setSpacing(15);
        ComboBox<String> cb = new ComboBox<>();
        return null;
    }

    private Node getButtons() {
        HBox box = new HBox();
        box.setSpacing(15);
        ComboBox<String> cb = new ComboBox<>();
        return null;
    }

    private Node getTextFelder() {
        HBox box = new HBox();
        box.setSpacing(15);
        ComboBox<String> cb = new ComboBox<>();
        cb.getItems().add("Combo");
        cb.getItems().add("Zwei");
        cb.getItems().add("Drei");
        return null;
    }
}


