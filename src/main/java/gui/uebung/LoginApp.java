package gui.uebung;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
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

    private TextField tfName;
    private PasswordField tfPasswort;
    private Label lErfolgreich;


    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10,20,20,20));



        HBox hBoxName = new HBox(10);
        Label lName = new Label("Name:     ");
        tfName = new TextField();

        HBox hBoxPasswort = new HBox(10);
        Label lPasswort = new Label("Passwort:");
        tfPasswort = new PasswordField();

        Button login = new Button("Login");
        login.setOnAction(e -> login());

        hBoxName.getChildren().addAll(lName, tfName);
        hBoxPasswort.getChildren().addAll(lPasswort, tfPasswort);

        lErfolgreich = new Label("");


        box.getChildren().addAll(hBoxName, hBoxPasswort, login, lErfolgreich);

        Scene scene = new Scene(box, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("LoginApp");
        primaryStage.show();

    }

    private void login() {

        String name = tfName.getText();
        System.out.println("Name: " + name);
        String passwort = tfPasswort.getText();
        System.out.println("Passwort: " + passwort);

        if ("".equals(name) || "".equals(passwort)){
            lErfolgreich.setText("Es muss etwas eingegeben werden!");
            lErfolgreich.setTextFill(Color.RED);
        }
        else if("Test".equals(name) && "Geheim".equals(passwort)) {
            lErfolgreich.setText("Login erfolgreich!");
            lErfolgreich.setTextFill(Color.BLUE);
        }else{
            lErfolgreich.setText("Login nicht erfolgreich!");
            lErfolgreich.setTextFill(Color.RED);
        }
    }
}
