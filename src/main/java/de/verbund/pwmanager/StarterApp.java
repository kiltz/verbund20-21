package de.verbund.pwmanager;

import de.verbund.pwmanager.service.Manager;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class StarterApp extends Application {

    private Manager manager;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        manager = new Manager();

        URL ref = getClass().getResource("/de.verbund.pwmanager/manager.fxml");
        Parent root = FXMLLoader.load(ref);

        primaryStage.setTitle("PasswordManager");
        primaryStage.setScene(new Scene(root));

        primaryStage.show();
    }
}
