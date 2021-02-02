package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.util.List;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */
public class StatisitkApp extends Application {
    private VBox box;
    private Label leingabe, lmin, lminwert, lmax, lmaxwert, ldurchschnitt, ldurchschnittwert, lsumme, lsummewert, lanzahl, lanzahlwert;
    private TextField txteingabe;
    private List<Integer> liste;
    private int anzahl = 0;
    private String eingabe;
    private int min = 0;
    private int max = 0;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hBox1 = new HBox(10);
        leingabe = new Label("Eingabe");
        txteingabe = new TextField();
        Button btnhinzufügen = new Button("Hinzufügen");
        btnhinzufügen.setOnAction(e -> hinzufuegen(e));
        hBox1.getChildren().addAll(leingabe,txteingabe,btnhinzufügen);

        HBox hBox2 = new HBox(10);
        lmin = new Label("Min: ");
        lminwert = new Label("");
        lmax = new Label("Max: ");
        lmaxwert = new Label("");
        hBox2.getChildren().addAll(lmin,lminwert,lmax,lmaxwert);

        HBox hBox3 = new HBox(10);
        ldurchschnitt = new Label("Durchschnitt: ");
        ldurchschnittwert = new Label("");
        hBox3.getChildren().addAll(ldurchschnitt,ldurchschnittwert);

        HBox hBox4 = new HBox(10);
        lsumme = new Label("Summe: ");
        lsummewert = new Label("");
        hBox4.getChildren().addAll(lsumme,lsummewert);

        HBox hBox5 = new HBox(10);
        lanzahl = new Label("Anzahl: ");
        lanzahlwert = new Label("");
        hBox5.getChildren().addAll(lanzahl,lanzahlwert);

        HBox hBox6 = new HBox(10);
        Button btnlisteleeren = new Button("Liste Leeren");
        hBox6.getChildren().addAll(btnlisteleeren);

        box.getChildren().addAll(hBox1, hBox2, hBox3, hBox4, hBox5, hBox6);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);


        primaryStage.setTitle("Login");
        primaryStage.show();

    }

    private void hinzufuegen(ActionEvent e) {
        anzahl +=1;
        lanzahlwert.setText(String.valueOf(anzahl));
        eingabe = txteingabe.getText();
        liste.add(Integer.valueOf(eingabe));



    }
}
