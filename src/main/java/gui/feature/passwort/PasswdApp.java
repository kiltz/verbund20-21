package gui.feature.passwort;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswdApp extends Application {

     TextField tfEingabe;
     Label lAusgabe;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.getChildren().add(getEingabeZeile());
        root.getChildren().add(getAusgabeZeile());
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getEingabeZeile() {
        HBox box = new HBox();
        tfEingabe = new TextField();
        Button bEingabe = new Button();
        bEingabe.setDefaultButton(true);
        bEingabe.setOnAction(e -> );
        return box;
    }

    private Node getAusgabeZeile() {
        HBox box = new HBox();
        return box;
    }
}