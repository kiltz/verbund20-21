package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RechnerApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("+");
        TextField text1=new TextField();
        TextField text2=new TextField();
        Button button=new Button("=");
        Label l2=new Label("");
        HBox root = new HBox();
        root.getChildren().add(text1);
        root.getChildren().add(l1);
        root.getChildren().add(text2);
        root.getChildren().add(button);
        root.getChildren().add(l2);
        Scene scene = new Scene(root, 500, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
