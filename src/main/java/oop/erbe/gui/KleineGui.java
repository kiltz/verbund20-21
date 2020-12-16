package oop.erbe.gui;

import com.sun.javafx.scene.control.skin.LabeledText;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.plaf.LabelUI;

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();;
        Label lTest = new Label("<><><><><><><><><>");
        box.getChildren().add(lTest);
        Label lTest1 = new Label("Hallo Welt") ;
        box.getChildren().add(lTest1);
        Label lTest2 = new Label("Hier bin ich, lol") ;
        box.getChildren().add(lTest2);
        Label lTest3 = new Label("<><><><><><><><><>");
        box.getChildren().add(lTest3);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein kleines sinnloses Fensterchen");
        primaryStage.show();

        ;
    }
}
