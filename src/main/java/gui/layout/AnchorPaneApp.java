package gui.layout;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnchorPaneApp extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        AnchorPane root = new AnchorPane();
        Button save = new Button("Speichern");
        Button help = new Button("Hilfe");
        Button cancel = new Button("Abbruch");
        HBox buttons = new HBox();
        buttons.setSpacing(12);
        buttons.getChildren().addAll(cancel, save, help);
        root.getChildren().add(buttons);
        AnchorPane.setRightAnchor(buttons, 10.0);
        AnchorPane.setBottomAnchor(buttons, 20.0);

        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Ein Anker...unten rechts.");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
