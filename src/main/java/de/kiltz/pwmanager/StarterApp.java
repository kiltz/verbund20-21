package de.kiltz.pwmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.net.URL;

public class StarterApp  extends Application {

    public static BorderPane pane;

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        URL res = getClass().getResource("main.fxml");
        Parent root = FXMLLoader.load(res);
        res = getClass().getResource("gui/logo.fxml");
        Parent center = FXMLLoader.load(res);
        pane = (BorderPane) root;
        pane.setCenter(center);
        primaryStage.setTitle("Passwort-Manager");
        primaryStage.setScene(new Scene(root, 500,400));

        primaryStage.show();

    }
}

