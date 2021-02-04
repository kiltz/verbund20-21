package de.verbund.pwmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class StartApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) throws Exception{
        URL res=getClass().getResource("/passwdManager.fxml");
        Parent root= FXMLLoader.load(res);
        primaryStage.setScene(new Scene(root));
        primaryStage.setTitle("PasswortManager");
        primaryStage.show();
    }
}
