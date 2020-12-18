package uebungen.uebung1;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import oop.basic.Kreis;
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


    public class TaschenRechnerGui extends Application {

        private TextField tEingabe;
        private Label lErgebnis;
        private Label lKlick;

        public static void main(String[] args) {
            launch(args);
        }

        @Override
        public void start(Stage primaryStage) throws Exception {
            VBox box = new VBox(10);
            box.setPadding(new Insets(10, 20, 20, 20));

            // Eingabefeld für den Radius
            tEingabe  = new TextField();

            // Button um den Radius zu setzen
            Button bKlick = new Button("rechne");
            bKlick.setDefaultButton(true);


            int zahl1 = 0;
            int zahl2 = 1;
            int sum = zahl1 + zahl2;

            int Zahl1 = Integer.parseInt(String.valueOf(zahl1));
            System.out.println("sum");

            // Label um den Umfang auszugeben
            lErgebnis = new Label("Ergebnis =");

            box.getChildren().addAll(tEingabe, bKlick,lErgebnis );
            Scene scene = new Scene(box, 400, 250);
            primaryStage.setScene(scene);
            primaryStage.setTitle("Taschenrechner");
            primaryStage.show();

        }



            }


