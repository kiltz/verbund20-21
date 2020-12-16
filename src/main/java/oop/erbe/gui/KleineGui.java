package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();

        Label lInfo = new Label("Ein kleiner Text");
        Label lStatus = new Label("Ein Status");

        TextField tfEingabe = new TextField("Eingabe");

        box.getChildren().addAll(lInfo, lStatus, tfEingabe);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Fenster");
        primaryStage.show();

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Des ist ein Dialog");
        stage.setScene(new Scene(new StackPane(new Label("Hau Her"))));
        stage.show();
    }
}