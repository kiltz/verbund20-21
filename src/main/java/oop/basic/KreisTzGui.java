package oop.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KreisTzGui extends Application {

    private TextField tfRadius;
    private Label lErgebnis;
    private Label lKlick;
    private Kreis kreis;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        kreis = new Kreis();
        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        // Eingabefeld für den Radius
        tfRadius = new TextField();

        // Button um den Radius zu setzen
        Button bKlick = new Button("rechne");
        bKlick.setDefaultButton(true);


        // Label um den Umfang auszugeben
        lErgebnis = new Label("Ergebnis");

        box.getChildren().addAll(tfRadius, bKlick,lErgebnis );
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();

    }

    private void setzeRadius(ActionEvent e) {
        String eingabe = tfRadius.getText();

        try {
            int radius = Integer.parseInt(eingabe);
            kreis.setRadius(radius);
            lErgebnis.setText("Ergebnis + "+kreis.berechneUmfang());
        } catch (NumberFormatException e1) {
            lErgebnis.setText("Die Eingabe war keine Zahl! ("+e1.getMessage()+")");
        } catch (Exception e2) {
            lErgebnis.setText(e2.getMessage());
        }

    }
}
