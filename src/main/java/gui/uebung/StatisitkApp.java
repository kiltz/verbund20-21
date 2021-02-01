package gui.uebung;

import javafx.application.Application;
import javafx.geometry.Insets;
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

    private TextField zahleingabe;
    private Button hinzufuegen;
    private Label minimum;
    private Label maximum;
    private Label durchschnitt;
    private Label summe;
    private Label anzahleingaben;
    private Button leeren;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label eingabe = new Label("eingabe");
        zahleingabe = new TextField("Zahl eingeben");
        hinzufuegen = new Button ("hinzufügen");
        Label min = new Label ("min");
        Label max = new Label ("max");
        minimum = new Label ("1");
        maximum = new Label ("15");
        Label dschntt = new Label ("durchschnitt");
        durchschnitt = new Label ("8");
        Label Sum = new Label ("Summe");
        summe = new Label ("16");
        Label anzahl_eingaben = new Label ("Anzahl Eingaben");
        anzahleingaben = new Label("2");
        leeren = new Button("Liste leeren");



        HBox HB1 = new HBox(eingabe, zahleingabe, hinzufuegen);
        HBox HB2 = new HBox(min, minimum, max, maximum);
        HBox HB3 = new HBox(dschntt, durchschnitt);
        HBox HB4 = new HBox(Sum, summe);
        HBox HB5 = new HBox(anzahl_eingaben, anzahleingaben);
        HBox HB6 = new HBox(leeren);
        HB1.setSpacing(15.0);
        HB2.setSpacing(15.0);
        HB3.setSpacing(15.0);
        HB4.setSpacing(15.0);
        HB5.setSpacing(15.0);
        HB6.setSpacing(15.0);

        VBox root = new VBox(HB1, HB2, HB3, HB4, HB5, HB6);
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 20, 10);
        root.setPadding(insets);


        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

