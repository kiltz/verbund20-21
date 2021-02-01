package gui.uebung;

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

/**
 * Aufgabe:
 * Zeigt zwei Eingabefelder für Benutzername und Passwort
 * Beschribt die Eingabefelder mit einem Label
 * <p>
 * Erzeugt einen Button (Login)
 * <p>
 * Macht den Dialog hübsch
 * <p>
 * Validiert den Dialog
 * 1. Benutzername darf nicht leer sein
 * 2. Passwort darf nicht leer sein
 * 3. Benutzernamen und Passwort müssen irgendwelchen festen Werten entsprechen
 * <p>
 * Hinweis: Schachtelt VBox und HBox
 */

/**
 * Aufgabe:
 * Kopiert diese Datei nach RechnerApp.
 * Zwei Textfelder, zwei Label und einen Button anzeigt.
 * <p>
 * [.5.] + [.2.] (=) 7
 */
public class LoginApp extends Application {

    private TextField tfEins;
    private PasswordField pfZwei;
    private Label erfolgreich;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        erfolgreich = new Label();

        tfEins = new TextField();
        pfZwei = new PasswordField();
        Button Login = new Button("Login");
        Login.setDefaultButton(true);
        Login.setOnAction(e -> einloggen(e));

        HBox root = new HBox();
        VBox Box1 = new VBox(20);
        VBox Box2 = new VBox(20);

        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 10, 50);
        root.setPadding(insets);
        /*
        root.getChildren().add(tfEins);
        root.getChildren().add(lEins);
        root.getChildren().add(tfZwei);
        root.getChildren().add(bRechne);
        root.getChildren().add(lErgebnis);
        oder kürzer:
         */
        Box1.getChildren().addAll(tfEins, pfZwei);
        Box2.getChildren().addAll(Login, erfolgreich);
        root.getChildren().addAll(Box1, Box2);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Login");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void einloggen(ActionEvent e) {
        System.out.println("Klick");
        // Textfelder auslesen
        // String in int umwandeln
        String Nutzername = tfEins.getText();
        String Passwort = pfZwei.getText();
//        System.out.println(Nutzername);
 //       System.out.println(Passwort);
        // rechnen
        if (Nutzername.equals("vladimir") && Passwort.equals("pass")) {
            erfolgreich.setText("einloggen erfolgreich");
        }
        else {
            erfolgreich.setText("fehlgeschlagen");
        }
    }
}

