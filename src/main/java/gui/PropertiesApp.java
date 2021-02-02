package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Map;
import java.util.Properties;

public class PropertiesApp extends Application {

    private Label lUser;
    private Label lOS;
    private Label lVerzeichnis;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vMain = new VBox(10);
        vMain.setPadding(new Insets(20));

        lUser = new Label("User: ");
        lOS = new Label("OS: ");
        lVerzeichnis = new Label("Verzeichnis: ");

        Button btnAnzeigen = new Button("Anzeigen");
        btnAnzeigen.setOnAction(f -> getProperties(f));

        vMain.getChildren().addAll(lUser, lOS, lVerzeichnis, btnAnzeigen);

        Scene scene = new Scene(vMain, 500, 400);
        primaryStage.setTitle("Dialog");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void getProperties(ActionEvent f) {
        lOS.setText("OS: " + System.getProperty("os.name"));
        lUser.setText("User: " + System.getProperty("user.name"));
        lVerzeichnis.setText("Verzeichnis: " + System.getProperty("user.dir"));
    }
}
