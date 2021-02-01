package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;

/*
Aufgabe:
Eingabefeld
Label
Eingabefeld
Button
Label

 */

public class RechnerApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(30, 25, 50, 25));

        TextField t1 = new TextField("");
        Label lPlus = new Label("+");
        TextField t2 = new TextField("");
        Label lErg = new Label("Ergebnis: ");
        Button bEquals = new Button("=");

        bEquals.setOnAction(e -> rechne(e));
        bEquals.setDefaultButton(true);

        box.getChildren().addAll(t1, lPlus, t2, bEquals, lErg);

        Label l = new Label("Hallo App!");
        HBox root = new HBox();
        root.getChildren().add(l);
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        root.getChildren().add(getLabel());
        root.getChildren().add(getButton());
        root.getChildren().add(getTextFeld());
    }

    private void rechne(ActionEvent e) {
    }

    private Node getTextFeld() {
        HBox box = new HBox();
        TextField t1 = new TextField();
        TextField t2 = new TextField();

        box.getChildren().addAll(t1, t2);
        return box;
    }

    private Node getButton(){
        HBox box = new HBox();
        Button bEquals = new Button("=");

        box.getChildren().addAll(bEquals);
        return box;
    }

    private Node getLabel(){
        HBox box = new HBox();
        Label lPlus = new Label("+");
        Label lErg = new Label();


        box.getChildren().addAll(lPlus);
        return box;
    }

}

