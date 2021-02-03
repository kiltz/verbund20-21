package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PropertyApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l = new Label("Wichtige Properties:");
        VBox root = new VBox();
        root.setPadding(new Insets(10));
        root.getChildren().add(l);
        String benutzer = System.getProperty("user.name");
        root.getChildren().add(new Label("Benutzer: "+benutzer));
        root.getChildren().add(new Label("Betriebssystem: "+System.getProperty("os.name")));
        root.getChildren().add(new Label("Temp-Verzeichnis: "+System.getProperty("java.io.tmpdir")));

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Properties");
        primaryStage.show();
    }
}
