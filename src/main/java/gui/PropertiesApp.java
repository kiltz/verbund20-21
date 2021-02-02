package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Properties;

public class PropertiesApp extends Application {

    private TextArea taAusgabe;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vMain = new VBox(10);
        taAusgabe = new TextArea();
        taAusgabe.setEditable(false);
        taAusgabe.setPrefHeight(800);

        getProperties();
        vMain.getChildren().add(taAusgabe);

        Scene scene = new Scene(vMain, 500, 400);
        primaryStage.setTitle("Dialog");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void getProperties() {
        Properties properties = System.getProperties();
        properties.forEach((key, value) -> taAusgabe.setText(taAusgabe.getText() + (key + ": " + value) + "\n"));
    }
}
