package gui.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class BorderPaneApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        BorderPane root = new BorderPane();
        root.setTop(new Label("Oben"));
        root.setBottom(new Label("Unten"));
        root.setCenter(new Label("Mitte"));
        root.setLeft(new Label("Links"));
        root.setRight(new Label("Rechts"));

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Ein BorderLayout...");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
