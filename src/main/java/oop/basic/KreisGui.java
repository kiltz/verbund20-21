package oop.basic;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class KreisGui extends Application {

    TextField tfRadius;
    Label lOutput;
    int radius;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box;
        box = new VBox(10);

        tfRadius=new TextField();
        lOutput=new Label();

        Button bRechnen=new Button("Radius Eingeben umd Umfang zu berechnen");
        bRechnen.setOnAction(this::berechneUmfang);

        box.getChildren().addAll(tfRadius, lOutput, bRechnen);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Umfangberechnung");
        primaryStage.show();

    }

    private void berechneUmfang(ActionEvent e) {
        String radiusText=tfRadius.getText();
        try{
            int r=Integer.parseInt(radiusText);
            setRadius(r);
            lOutput.setText("Umfang: " +(2 * this.radius * Math.PI));
        }
        catch(NumberFormatException f){
            System.out.println("Eingabe ist Falsch!");
        } catch (Exception exception) {
            System.out.println("Radius ist zu klein");;
        }

    }

    private void setRadius(int radius) throws Exception{
        if (radius >= 0) {
            this.radius = radius;
        }
        else {

            throw new Exception("Radius ist zu klein");
        }
    }


}