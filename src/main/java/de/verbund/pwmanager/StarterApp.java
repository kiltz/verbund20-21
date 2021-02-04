package de.verbund.pwmanager;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import java.net.URL;
import javafx.scene.Parent;


public class StarterApp extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        URL res = getClass().getResource("starter.fxml");
        Parent root = FXMLLoader.load(res);

        primaryStage.setTitle("Starter-App");
        primaryStage.setScene(new Scene(root, 400, 300));
        primaryStage.show();
    }
}