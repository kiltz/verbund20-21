package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
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
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Ein Status");
        box.getChildren().add(lStatus);
        Label lZusatz = new Label("Hier ist das Zusatzfeld");
        box.getChildren().add(lZusatz);

        Scene scene = new Scene(box, 700,450);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein kleines sinnloses Fensterchen");
        primaryStage.show();
    }
}
