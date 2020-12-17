package oop.basic;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KreisGui extends Application {
    private TextField tfRadius;
    private Label lUmfang;
    private Button bRechne;
    private Kreis k1;


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        Kreis k1 = new Kreis();
        tfRadius= new TextField();
        lUmfang= new Label("Kreis"+k1.berechneUmfang());
        bRechne= new Button("Berechne Umfang");
        bRechne.setOnAction(e -> bRechne());

        box.getChildren().addAll(tfRadius,lUmfang,bRechne);
        Scene scene = new Scene(box,  400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Kreis");
        primaryStage.show();
    }

    private void bRechne() throws Exception {
        int zahl = Integer.parseInt(tfRadius.getText());
        System.out.println("GetRadius");
        lUmfang.setText("Der Umfang Beträgt"+k1.berechneUmfang());
        k1.setRadius(zahl);
        String text = ""+zahl;
        System.out.println(k1.getRadius());
    }
}
