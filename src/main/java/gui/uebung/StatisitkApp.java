package gui.uebung;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */
public class StatisitkApp extends Application {

    private Label l11;
    private TextField tf1;
    private Label l9;
    private Label l5;
    private Label l3;
    private Label l7;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("Eingabe");
        tf1= new TextField();
        Button b1 = new Button("Eingabe");

        Label l2 = new Label("Min");
        l3 = new Label();
        Label l4 = new Label("Max");
        l5 = new Label();

        Label l6 = new Label("Durchschnitt");
        l7 = new Label();

        Label l8 = new Label("Summe");
        l9 = new Label();

        Label l10 = new Label("Zahlen gesamt");
        l11 = new Label();

        Button b2 = new Button("Reset");

        HBox hb1 = new HBox();
        hb1.getChildren().addAll(l1, tf1, b1);
        HBox hb2 = new HBox();
        hb2.getChildren().addAll(l2, l3, l4, l5);
        HBox hb3 = new HBox();
        hb3.getChildren().addAll(l6, l7);
        HBox hb4 = new HBox();
        hb4.getChildren().addAll(l8, l9);
        HBox hb5 = new HBox();
        hb5.getChildren().addAll(l10, l11);
        HBox hb6 = new HBox();
        hb6.getChildren().addAll(b2);
        VBox vb1 = new VBox();
        vb1.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6);
        Scene scene = new Scene(vb1, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
