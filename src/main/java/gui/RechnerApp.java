package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RechnerApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox root = new HBox(20);
        root.setPadding(new Insets(20, 40, 40, 40));

        TextField eingabe = new TextField();
        TextField eingabe2 = new TextField();
        eingabe.setPrefWidth(50);
        eingabe2.setPrefWidth(50);

        Label plus = new Label("+");
        Label ergebnis = new Label("7");

        Button gleich = new Button("=");


        root.getChildren().addAll(eingabe, plus, eingabe2, gleich, ergebnis);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setTitle("Rechnerapp");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
