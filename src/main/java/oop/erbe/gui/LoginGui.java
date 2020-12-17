package oop.erbe.gui;

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
import javafx.stage.Stage;

public class LoginGui extends Application {

    private TextField tfName;
    private PasswordField tfPasswort;
    private VBox box;
    private Label lAnswer;



    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hBoxName = new HBox(10);
        Label lName = new Label("Name");
        tfName = new TextField();

        hBoxName.getChildren().addAll(lName, tfName);

        HBox hBoxPasswd = new HBox(10);
        Label lPasswort = new Label("Passwort");
        tfPasswort = new PasswordField();
        hBoxPasswd.getChildren().addAll(lPasswort, tfPasswort);

        Button bLogin = new Button("login");
        bLogin.setOnAction(e -> login(e));

        box.getChildren().addAll(hBoxName, hBoxPasswd, bLogin);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();

    }

    private void login(ActionEvent e) {
        String name = tfName.getText();
        String geheim = tfPasswort.getText();
        System.out.println("Name: " + name);
        System.out.println("Geheim: " + geheim);
        if ("Tester".equals(name)&&"geheim".equals(geheim)) {
            System.out.println("Alles gut!");
            HBox hBoxAnswer = new HBox(10);
            Label lAnswer = new Label("Login erfolgreich");
        }else{
            System.out.println("Nix gibts!");

        }
        // Aufgabe:
        // Prüft Passwort und Name gegen fixe Werte
        // Wenn die Daten stimmen zeige in Label "Login erfolgreich!"
        // Wenn die Daten NICHT stimmen zeige in Label "Login NICHT erfolgreich!"

    }
}
