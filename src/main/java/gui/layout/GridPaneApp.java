package gui.layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class GridPaneApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        GridPane root = new GridPane();
        root.setVgap(5);
        root.setHgap(8);
        root.setPadding(new Insets(10));

        root.add(new Label("Name"), 0,0);
        root.add(new TextField("Name eingeben"), 1,0);

        root.add(new Label("Vorname"), 0,1);
        root.add(new TextField("Vorname eingeben"), 1,1);

        root.add(new Separator(), 0,2,2,1);

        root.add(new Label("E-Mail"), 0,3);
        root.add(new TextField("E-Mail eingeben"), 1,3);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Ein Grid-Layout.");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
