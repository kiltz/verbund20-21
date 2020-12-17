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
    private Label lUmfang;
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
        Button bSetze = new Button("setze Radius");
        bSetze.setDefaultButton(true);
        bSetze.setOnAction(e -> setzeRadius(e));

        // Label um den Umfang auszugeben
        lUmfang = new Label("Umfang: 0");

        box.getChildren().addAll(tfRadius, bSetze, lUmfang);
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kreis-Dialog");
        primaryStage.show();

    }

    private void setzeRadius(ActionEvent e) {
        String eingabe = tfRadius.getText();

        try {
            int radius = Integer.parseInt(eingabe);
            kreis.setRadius(radius);
            lUmfang.setText("Umfang: "+kreis.berechneUmfang());
        } catch (NumberFormatException e1) {
            lUmfang.setText("Die Eingabe war keine Zahl! ("+e1.getMessage()+")");
        } catch (Exception e2) {
            lUmfang.setText(e2.getMessage());
        }

    }
}
