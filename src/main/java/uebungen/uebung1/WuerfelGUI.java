package uebungen.uebung1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


    public class WuerfelGUI extends Application {
        private TextField tfAnzahl;

        @Override
        public void start(Stage primaryStage) throws Exception {
            VBox box = new VBox(10);
            box.setPadding(new Insets(20, 20, 10, 20));
            tfAnzahl = new TextField();
            TextField tfReichweite = new TextField();
            Label ausgabe = new Label();
            Button bWuerfeln = new Button("Würfeln");
            bWuerfeln.setOnAction(e -> wuerfeln(e));




            box.getChildren().addAll(tfAnzahl, tfReichweite,bWuerfeln, ausgabe);

            Scene scene = new Scene(box, 400, 200);
            primaryStage.setScene(scene);
            primaryStage.setTitle("WuerfelStatistik");
            primaryStage.show();


        }

        private void wuerfeln(ActionEvent e) {
            System.out.println();
        }
    }
