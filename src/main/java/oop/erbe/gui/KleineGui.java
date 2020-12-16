package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();

        Label lInfo = new Label("Wie geht es Hans heute?");
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Hans ist müde.");
        box.getChildren().add(lStatus);
        Label lStatus2 = new Label("Hans möchte schlafen.");
        box.getChildren().add(lStatus2);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hans.exe");
        primaryStage.show();
    }
}
