package gui.uebung;

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

/**
 * Aufgabe:
 * Zeigt zwei Eingabefelder für Benutzername und Passwort
 * Beschribt die Eingabefelder mit einem Label
 *
 * Erzeugt einen Button (Login)
 *
 * Macht den Dialog hübsch
 *
 * Validiert den Dialog
 * 1. Benutzername darf nicht leer sein
 * 2. Passwort darf nicht leer sein
 * 3. Benutzernamen und Passwort müssen irgendwelchen festen Werten entsprechen
 *
 * Hinweis: Schachtelt VBox und HBox
 *
 */
public class LoginApp extends Application {

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("Benutzername");
        Label l2 = new Label("Passwort");
        Label l3 = new Label();
        TextField tf1 = new TextField();
        PasswordField tf2 = new PasswordField();
        Button b1 = new Button("Login");
        b1.setOnAction(e -> login(e));
        VBox vb1 = new VBox();
        vb1.setSpacing(10.0);
        HBox hb1 = new HBox();
        hb1.setSpacing(10.0);
        HBox hb2 = new HBox();
        hb2.setSpacing(10.0);
        HBox hb3 = new HBox();
        hb3.setSpacing(10.0);
        HBox hb4 = new HBox();
        hb4.setSpacing(10.0);
        hb1.getChildren().addAll(l1, tf1);
        hb2.getChildren().addAll(l2, tf2);
        hb3.getChildren().addAll(b1);
        hb4.getChildren().addAll(l3);
        vb1.getChildren().addAll(hb1, hb2, hb3, hb4);
        Scene scene = new Scene(vb1, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void login(ActionEvent e) {
    }
}
