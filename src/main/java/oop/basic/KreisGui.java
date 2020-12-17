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
    private Kreis kreis;
    private TextField tfRadius;
    private Label lUmfang;
    private int radius;
    private Label fehler;

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        kreis = new Kreis();

        tfRadius = new TextField("Radius eingeben");
        lRadius = new Label("Radius: " + kreis.getRadius());
        lUmfang = new Label("Umfang: ");
        fehler = new Label();

        Button bRadius = new Button("Umfang Berechnen");
        bRadius.setOnAction(e -> berechneUmfang());

        box.getChildren().addAll(tfRadius, lRadius, lUmfang, bRadius, fehler);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();
    }

    private void berechneUmfang() {
        try {
            radius = Integer.parseInt(tfRadius.getText());
            kreis.setRadius(radius);
            lRadius.setText("Radius: " + kreis.getRadius());
            lUmfang.setText("Umfang: " + kreis.berechneUmfang());
        } catch (Exception e) {
            fehler.setText("Fehler: " + e);

        }
    }
}
