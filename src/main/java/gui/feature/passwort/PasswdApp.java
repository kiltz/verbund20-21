package gui.feature.passwort;

import javafx.application.Application;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswdApp extends Application {

     TextField tfEingabe;
     Label lAusgabe;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.getChildren().add(getEingabeZeile());
        root.getChildren().add(getAusgabeZeile());
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getEingabeZeile() {
        HBox box = new HBox();
        tfEingabe = new TextField();
        Button bEingabe = new Button("Eingabe");
        bEingabe.setDefaultButton(true);
        bEingabe.setOnAction(e ->eingeben() );
        box.getChildren().addAll(tfEingabe,bEingabe);
        return box;
    }

    private String eingeben() {
        int eingabe = Integer.parseInt(tfEingabe.getText());
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
        String neu = ""+erlaubteZeichen.charAt(4)+erlaubteZeichen.charAt(7)+erlaubteZeichen.charAt(12);
        System.out.println(neu);
        String test = "";
        for (int i = 0; i < eingabe; ++i) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            test += erlaubteZeichen.charAt(pos);
        }
        return test;
    }

    private Node getAusgabeZeile() {
        HBox box = new HBox();
        lAusgabe = new Label();
        lAusgabe.setText("test");
        box.getChildren().add(lAusgabe);
        return box;
    }
}