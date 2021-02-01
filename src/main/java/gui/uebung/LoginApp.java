package gui.uebung;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;

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


    private TextField password;
    private TextField username;
    private Label llogin;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        username = new TextField();
        username.setMaxWidth(150);
        password = new TextField();
        password.setMaxWidth(150);
        Label lusername = new Label("Username: ");
        Label lpassword = new Label("Password:  ");
        Button blogin = new Button("Login");
        blogin.setOnAction(e-> login(e));
        llogin = new Label ();




        VBox root = new VBox();

        HBox zeile1 = new HBox();
        zeile1.getChildren().add(lusername);
        zeile1.getChildren().add(username);

        HBox zeile2 = new HBox();
        zeile2.getChildren().add(lpassword);
        zeile2.getChildren().add(password);

        HBox zeile3 = new HBox();
        zeile3.getChildren().add(blogin);

        HBox zeile4 = new HBox();
        zeile4.getChildren().add(llogin);


        root.getChildren().add(zeile1);
        root.getChildren().add(zeile2);
        root.getChildren().add(zeile3);
        root.getChildren().add(zeile4);



        Insets insets = new Insets(50, 50, 10, 50);
        root.setPadding(insets);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void login(ActionEvent e) {
        if (username.getText().equals("User") && password.getText().equals("abc123")) {
            llogin.setText("Erfolgreicher Login");
        } else {
            llogin.setText("Falsches Passwort oder Nutzername");
        }
    }
}
