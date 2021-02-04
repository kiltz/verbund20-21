package gui.controls.panes;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AccordionApp  extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Accordion root = new Accordion();
        for (int i = 1; i <= 5; ++i) {
            HBox box = new HBox();
            box.getChildren().add(new Label("Das sind nicht die Droiden die ihr sucht"));
            TitledPane pane = new TitledPane("Box "+i, box);
            root.getPanes().add(pane);

        }
        Scene scene = new Scene(root, 300, 250);
        primaryStage.setTitle("Ein Akkordeon!");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
