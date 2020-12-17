package oop.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;


public class KreisGui extends Application {


    private TextField tfEingabe;
    private Label lResult;

    Kreis kreis = new Kreis();

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hBoxEingabe = new HBox(10);
        HBox hBoxHeader = new HBox(10);

        tfEingabe = new TextField();
        lResult = new Label("Umfang: ");
        Label lRadius = new Label("Radius hier eingeben: ");

        Button calculate = new Button("Berechne!");
        calculate.setOnAction(e -> berechneUmfang(e));

        hBoxHeader.getChildren().add(lRadius);
        hBoxEingabe.getChildren().addAll( tfEingabe, calculate);
        box.getChildren().addAll(hBoxHeader, hBoxEingabe, lResult);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kreis-Umfang");
        primaryStage.show();
    }
    private void berechneUmfang(ActionEvent e) {
        try {
            int value = Integer.parseInt(tfEingabe.getText());
            kreis.setRadius(value);
            lResult.setText("Umfang: " + kreis.berechneUmfang());


        } catch (NumberFormatException f) {
            lResult.setText("Ungueltig" + f.getMessage());


        } catch (Exception exception) {
            lResult.setText("ZU KLEIN!");

        }
    }
}