package oop.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class KreisGui extends Application {

    private TextField tRadius;
    private Label lAusgabe;
    private int radius;
    private Kreis k=new Kreis();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box;
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));


        lAusgabe=new Label();

        HBox hBox=new HBox();
        Label lRadius=new Label("Radius: ");
        tRadius=new TextField();
        hBox.getChildren().addAll(lRadius, tRadius);

        Button bRechnen=new Button("Berechne Umfang");
        bRechnen.setOnAction(e->rechneUmfang(e));

        box.getChildren().addAll(hBox, lAusgabe, bRechnen);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kreis");
        primaryStage.show();

    }

    private void rechneUmfang(ActionEvent e) {
        String radiusText=tRadius.getText();
        try{
            int r=Integer.parseInt(radiusText);
            k.setRadius(r);
            lAusgabe.setText("Umfang: " +k.berechneUmfang());
        }
        catch(NumberFormatException f){
            lAusgabe.setText("Falsche Eingabe");
            lAusgabe.setTextFill(Paint.valueOf("#ff0000"));
        } catch (Exception exception) {
            lAusgabe.setText("Radius zu klein");
            lAusgabe.setTextFill(Paint.valueOf("ff0000"));
        }

    }




}
