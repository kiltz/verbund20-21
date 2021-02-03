package gui.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class FlowPaneApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        FlowPane root = new FlowPane();
        root.setVgap(10.0);
        root.setHgap(20.0);
//        root.setOrientation(Orientation.VERTICAL);
        for (int i = 1; i < 10; ++i) {
            root.getChildren().add(new Label("Label "+i));
        }

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Einfach alle hintereinander...");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
