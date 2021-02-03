package gui.uebung.mueloe;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
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

    private Label lStatus;
    private PasswordField tfPasswort;
    private TextField tfBenutzer;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox();
        root.setPadding(new Insets(10, 10, 10, 10));
        root.getChildren().add(getBenutzerZeile());
        root.getChildren().add(getPasswortZeile());
        root.getChildren().add(getButtonZeile());
        Scene scene = new Scene(root, 350, 200);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getButtonZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER_RIGHT);
        lStatus = new Label();
        Button bLogin = new Button("Login");
        bLogin.setDefaultButton(true);
        bLogin.setOnAction(e -> login());
        box.getChildren().addAll(lStatus, bLogin);
        return box;
    }

    private void login() {
        String ben = tfBenutzer.getText();
        String passwd = tfPasswort.getText();
        String meldung = "OK";
        String blau = "#005091";
        String rot = "#E23130";
        if (ben.isEmpty()) {
            meldung = "Benutzername ist leer";
        }
        if ("OK".equals(meldung) && ben.length() < 2) {
            meldung = "Benutzername ist zu kurz";
        }
        if ("OK".equals(meldung)) {
            lStatus.setTextFill(Color.web(blau));
        } else {
            lStatus.setTextFill(Color.web(rot));
        }
        //lStatus.setTextFill(Color.web("OK".equals(meldung) ? blau : rot));
        lStatus.setText(meldung);
    }

    private Node getPasswortZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfPasswort = new PasswordField();
        box.getChildren().addAll(new Label("Passwort"), tfPasswort);
        return box;
    }

    private Node getBenutzerZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfBenutzer = new TextField();
        box.getChildren().addAll(new Label("Benutzername"), tfBenutzer);
        return box;
    }
}
