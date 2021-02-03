package gui.feature.passwort;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswdApp extends Application {

    private TextField tfEingabe;
    private Label lAusgabe;
    private final String großBuchstaben="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private final String zahlen="0123456789";
    private final String sonderZeichen="!@§$%&/()=?`{[]}#+-*";

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
        bEingabe.setOnAction(e ->eingeben(e) );
        box.getChildren().addAll(tfEingabe,bEingabe);
        return box;
    }

    private void eingeben(ActionEvent e) {
        String password = "";
        int laenge = Integer.parseInt(tfEingabe.getText());
        for (int i = 0; i < laenge; i++) {
            String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
        }
        lAusgabe.setText("Ihr neues Passwort: " + password);
    }

    private Node getAusgabeZeile() {
        HBox box = new HBox();
        lAusgabe = new Label();
        lAusgabe.setText("test");
        box.getChildren().add(lAusgabe);
        return box;
    }
}