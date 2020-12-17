package oop.basic;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

@SuppressWarnings("RedundantThrows")
public class KreisGui extends Application {


    private Label lRadius;
    private Kreis kreis;
    private TextField tfRadius;
    private Label lUmfang;
    private Label lfehler;

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        box.setPadding(new Insets(20, 20, 20, 20));
        kreis = new Kreis();

        tfRadius = new TextField("Radius eingeben");
        lRadius = new Label("Radius: " + kreis.getRadius());
        lUmfang = new Label("Umfang: ");
        lfehler = new Label();
        lUmfang.setTextFill(Color.DARKBLUE);
        lRadius.setTextFill(Color.BLUE);
        lfehler.setTextFill(Color.RED);

        Button bBerechne = new Button("Umfang Berechnen");
        bBerechne.setOnAction(e -> berechneUmfang());

        box.getChildren().addAll(tfRadius, lRadius, lUmfang, bBerechne, lfehler);

        Scene scene = new Scene(box, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Bank");
        primaryStage.show();
    }

    private void berechneUmfang() {
        try {
            int radius = Integer.parseInt(tfRadius.getText());
            kreis.setRadius(radius);
            lRadius.setText("Radius: " + kreis.getRadius());
            lUmfang.setText("Umfang: " + kreis.berechneUmfang());
        } catch (Exception e) {
            lfehler.setText("Fehler: " + e);
        }
    }
}
