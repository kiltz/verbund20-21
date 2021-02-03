package gui.controls.panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TabApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TabPane root = new TabPane();
        for (int i = 1; i <= 5; ++i) {
            HBox box = new HBox();
            box.getChildren().add(new Label("Label der Box "+i));
            Tab tab = new Tab("Box "+i, box);
            tab.setClosable(i % 2 == 0);
            root.getTabs().add(tab);

        }
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Einige Tabbies!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
