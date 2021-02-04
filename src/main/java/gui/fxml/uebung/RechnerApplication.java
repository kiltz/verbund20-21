package gui.fxml.uebung;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.net.URL;

public class RechnerApplication extends Application {

    public static void main(String[] args) {launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        URL res = getClass().getResource("rechner.fxml");
        Parent root = FXMLLoader.load(res);
        primaryStage.setTitle("Rechner-App");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();

    }
}
