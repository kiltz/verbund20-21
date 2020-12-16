package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
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

        Label lInfo = new Label("Hans");
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Will mehr");
        box.getChildren().add(lStatus);
        TextField tField=new TextField("Ok geht das?");
        box.getChildren().add(tField);
        PasswordField pField=new PasswordField();
        box.getChildren().add(pField);
        CheckBox cBox=new CheckBox("Test zum schreiben");
        box.getChildren().add(cBox);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein kleines sinnloses Fensterchen");
        primaryStage.show();
    }
}
