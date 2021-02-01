package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
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
    private Label lErgebnis;
    private TextField tfEins;
    private TextField tfZwei;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l = new Label("Login Dialog!");
        HBox root = new HBox();
        root.getChildren().add(l);
        tfEins = new TextField("");
        tfZwei = new TextField("");
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void rechne(ActionEvent e) {
        String eingabe1 = tfEins.getText();
        String eingabe2 = tfZwei.getText();
        int zahl1 = Integer.parseInt(eingabe1);
        int zahl2 = Integer.parseInt(eingabe2);
        
        // Ergebnis ausgeben

    }
}
