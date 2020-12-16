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

        Label lInfo = new Label("Wie geht es Hans heute?");
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Hans ist müde.");
        box.getChildren().add(lStatus);
        Label lStatus2 = new Label("Hans möchte schlafen.");
        box.getChildren().add(lStatus2);
        TextField textFeld = new TextField("Hans versucht herauszufinden was ein Textfeld ist."+
                " Hans hat herausgefunden was ein Textfeld ist und hat es deaktiviert");
        textFeld.setEditable(false);
        box.getChildren().add(textFeld);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hans.exe");
        primaryStage.show();
    }
}
