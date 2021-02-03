package gui.controls.panes;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class SplitterApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        SplitPane root = new SplitPane();
        for (int i = 1; i <= 3; ++i) {
            HBox box = new HBox();
            box.getChildren().add(new Label("Label der Box "+i));
            StackPane pane = new StackPane(box);
            root.getItems().add(pane);

        }
        SplitPane vSplitPane = new SplitPane();
        vSplitPane.setOrientation(Orientation.VERTICAL);
        for (int i = 4; i < 6; i++) {
            vSplitPane.getItems().add(new StackPane(new Label("Fenster "+i)));
        }
        root.getItems().add(vSplitPane);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Einige Splits!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
