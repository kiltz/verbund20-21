package de.verbund.pwmanager;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class StarterApp  extends Application {

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL res = getClass().getResource("/de.verbund.pwmanager/manager.fxml"); //Erstellen
        Parent root = FXMLLoader.load(res); //Lesen

        primaryStage.setTitle("Passwort-Manager"); //Titel erstellen
        primaryStage.setScene(new Scene(root)); //Anwenden

        primaryStage.show(); //Anzeigen
    }
}
