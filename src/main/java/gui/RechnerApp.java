package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RechnerApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l = new Label(" ");
        TextField eingabe1 = new TextField();
        Label p = new Label("+");
        TextField eingabe2 = new TextField();
        Button button2 = new Button("=");



        HBox root = new HBox();
        root.getChildren().add(eingabe1);
        root.getChildren().add(p);
        root.getChildren().add(eingabe2);
        root.getChildren().add(button2);
        root.getChildren().add(l);



        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

