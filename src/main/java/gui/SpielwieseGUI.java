package gui;

import javafx.application.Application;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Label;
import javafx.scene.control.SplitPane;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SpielwieseGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root=new VBox();

        Accordion accordion=new Accordion();
        HBox box1=new HBox();
        box1.getChildren().add(new Label("Hier könnte Ihre Werbung stehen :)"));
        TitledPane pane1=new TitledPane("Pane1", box1);
        HBox box2=new HBox();
        box2.getChildren().add(new Label("Hotel...Trivago"));
        TitledPane pane2=new TitledPane("Pane2", box2);
        accordion.getPanes().add(pane1);
        accordion.getPanes().add(pane2);

        SplitPane split=new SplitPane();
        HBox boxSplit1=new HBox();
        boxSplit1.getChildren().add(new Label("Split1"));
        StackPane splitPane1=new StackPane(boxSplit1);
        HBox boxSplit2=new HBox();
        boxSplit2.getChildren().add(new Label("Split2"));
        StackPane splitPane2=new StackPane(boxSplit2);
        split.getItems().add(boxSplit1);
        split.getItems().add(boxSplit2);

        SplitPane vSplit=new SplitPane();
        vSplit.setOrientation(Orientation.VERTICAL);
        HBox boxSplit3=new HBox();
        boxSplit3.getChildren().add(new Label("Split3"));
        StackPane splitPane3=new StackPane(boxSplit3);
        vSplit.getItems().add(splitPane3);


        root.getChildren().add(accordion);
        root.getChildren().add(split);
        root.getChildren().add(vSplit);

        Scene scene=new Scene(root, 400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Spiel Spaß und GUI!");
        primaryStage.show();
    }
}

