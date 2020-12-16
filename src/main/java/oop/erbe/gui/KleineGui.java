package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();

        Label lInfo = new Label("Ein kleiner Text");
        Label test = new Label ("Ein zweiter kleiner Text");
        box.getChildren().add(lInfo);
        box.getChildren().add(test);
        Label lStatus = new Label("Ein Status");
        Label lStatus2 = new Label("Ein zweiter Stauts");
        box.getChildren().add(lStatus);
        box.getChildren().add(lStatus2);
        TextField tf = new TextField("Bismarck biss Mark, bis Mark Bismarck biss");
        box.getChildren().add(tf);
        Label bestesLabel = new Label("Wenn Fliegen hinter Fliegen fliegen, fliegen Fliegen Fliegen hinterher");
        box.getChildren().add(bestesLabel);
        Label bestesLabel2 = new Label("Wenn Robben hinter Robben robben, robben Robben Robben nach");
        box.getChildren().add(bestesLabel2);

        Scene scene = new Scene(box, 1000,750);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein großes sinnloses Fensterchen");
        primaryStage.show();

    }
}
