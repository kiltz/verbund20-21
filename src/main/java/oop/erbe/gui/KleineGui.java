package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();
        HBox box2 = new HBox();

        Label lInfo = new Label("Ich bin das Label ");
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Ein Status");
        box.getChildren().add(lStatus);
        TextField text = new TextField(" ");
        box.getChildren().add(text);
        Button btn = new Button("Submit");
        box.getChildren().add(btn);

        CheckBox check = new CheckBox();
        box.getChildren().add(check);
        CheckBox checkTwo = new CheckBox();
        box.getChildren().add(checkTwo);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein kleines sinnloses Fensterchen");
        primaryStage.show();


        Stage stage = new Stage();
        stage.setTitle("Neuer Dialog lol");
        stage.setScene(new Scene(new StackPane(new Label("Nachricht!"))));
        stage.show();
    }
}
