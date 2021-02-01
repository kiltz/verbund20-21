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
import javafx.scene.paint.Paint;
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
 */

public class LoginApp extends Application {

    private TextField tfMail;
    private PasswordField pfPassword;
    private Label lResult;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vMain = new VBox(10);
        vMain.setPadding(new Insets(20, 20, 20, 20));

        HBox hMail = new HBox(10);
        Label lMail = new Label("E-Mail ");
        tfMail = new TextField();
        hMail.getChildren().addAll(lMail, tfMail);

        HBox hPassword = new HBox(10);
        Label lPassword = new Label("Passwort ");
        pfPassword = new PasswordField();
        hPassword.getChildren().addAll(lPassword, pfPassword);

        Button bLogin = new Button("Login");
        bLogin.setOnAction(e -> validate(e));

        lResult = new Label("Bitte geben Sie Ihre Daten ein");

        vMain.getChildren().addAll(hMail, hPassword, bLogin, lResult);

        Scene scene = new Scene(vMain, 300, 400);

        primaryStage.setTitle("Login App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void validate(ActionEvent e) {

        String mail = tfMail.getText();
        String password = pfPassword.getText();

        if (mail.isEmpty() || password.isEmpty()) {
            lResult.setText("Eingabe darf nicht leer sein!");
            lResult.setTextFill(Paint.valueOf("#ff0000"));

        } else {
            if (mail.equals("Hans") && password.equals("Hans123")) {
                lResult.setText("Willkommen!");
                lResult.setTextFill(Paint.valueOf("#00ff00"));
            } else {
                lResult.setText("Ungueltige Daten eingegeben!");
                lResult.setTextFill(Paint.valueOf("#ff0000"));
            }
        }
    }
}