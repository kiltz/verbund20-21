package oop.erbe.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import oop.basic.Kreis;
import oop.basic.aufgabe.Konto;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class BankGUI extends Application {
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

            Scene scene = new Scene(box, 400, 500);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Bank");
            primaryStage.show();


        }

    private void berechneUmfang() {

    }


}

