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

    TextField tRadius;
    Label lAusgabe;
    int radius;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box;
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        tRadius=new TextField();
        lAusgabe=new Label();

        Button bRechnen=new Button("Berechne Umfang");
        bRechnen.setOnAction(e->rechneUmfang(e));

        box.getChildren().addAll(tRadius, lAusgabe, bRechnen);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kreis");
        primaryStage.show();

    }

    private void rechneUmfang(ActionEvent e) {
        String radiusText=tRadius.getText();
        try{
            int r=Integer.parseInt(radiusText);
            setRadius(r);
            lAusgabe.setText("Umfang: " +(2*this.radius*Math.PI));
        }
        catch(NumberFormatException f){
            System.out.println("Fehler bei der Eingabe");
        } catch (Exception exception) {
            System.out.println("Radius zu klein");;
        }

    }

    private void setRadius(int radius) throws Exception{
        if (radius >= 0) {
            this.radius = radius;
        }
        else {

            throw new Exception("Radius ist zu klein!");
        }
    }


}
