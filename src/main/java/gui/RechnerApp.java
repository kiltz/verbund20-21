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

        TextField t1 = new TextField("5");
        Label l2 = new Label("+");
        TextField t2 = new TextField("2");
        Button b1 = new Button("=");
        Label l3 = new Label("7");

        t1.setPrefWidth(60);
        t2.setPrefWidth(60);

        HBox root = new HBox();
        root.setSpacing(10);
        root.getChildren().addAll(t1, l2, t2, b1, l3);
        Scene scene = new Scene(root, 700, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
