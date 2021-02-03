package oop.basic;

import javafx.application.Application;
<<<<<<< HEAD
import javafx.event.ActionEvent;
=======
import javafx.geometry.Insets;
>>>>>>> origin/FabianLechner
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
<<<<<<< HEAD
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
=======
import javafx.scene.paint.Color;


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
>>>>>>> origin/FabianLechner
