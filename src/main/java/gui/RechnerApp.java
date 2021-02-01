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
        TextField tf1 = new TextField("Tf1");
        TextField tf2 = new TextField("Tf2");
        Label l = new Label(" + ");
        Label r = new Label ("  Ergebnis ");
        HBox root = new HBox();
        Button e = new Button(" = ");
        root.getChildren().addAll(tf1,l,tf2,e,r);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
