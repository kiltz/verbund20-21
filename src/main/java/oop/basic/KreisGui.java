
package oop.basic;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KreisGui extends Application {
    private Label lRadius;
    private TextField Radius;
    private Button berechne;
    private Label Ausgabe;
    private Kreis Kreis;
    private Label error;


    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        Kreis = new Kreis();
        Ausgabe = new Label("Ergebnis");
        Radius = new TextField("Gebe Radius ein");
        lRadius = new Label(""+Kreis.getRadius());
        berechne = new Button("Berechne");
        berechne.setOnAction(e -> berechneUmfang());
        error = new Label();

        box.getChildren().addAll(Ausgabe,Radius,berechne, lRadius, error);
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Umfang berechnung");
        primaryStage.show();

        
    }

    private void berechneUmfang() {
        try {
        int zahl = Integer.parseInt(Radius.getText());
        Kreis.setRadius(zahl);
        Ausgabe.setText("Umfang: " + Kreis.berechneUmfang());
        } catch (NumberFormatException e) {
            error.setText("Fehler");
        }
    }
}
