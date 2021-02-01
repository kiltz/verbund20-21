package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
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
import javafx.stage.Stage;

public class LoginApp extends Application {

    private TextField tfName;
    private PasswordField tfPasswort;
    private Label ausgabe;
    private String loginName = "Hans";
    private String loginPasswort = "Geheim";

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox(10.0);
        root.setPadding(new Insets(10, 20, 20, 10));
        root.getChildren().addAll(getBenutzerZeile(), getPasswortZeile(), getButtonZeile());
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();

    }

    private Node getBenutzerZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfName = new TextField();
        box.getChildren().addAll(new Label("Benutzername"), tfName);
        return box;
    }

    private Node getPasswortZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfPasswort = new PasswordField();
        box.getChildren().addAll(new Label("Passwort"), tfPasswort);
        return box;
    }

    private Node getButtonZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER_RIGHT);
        ausgabe = new Label();
        Button bLogin = new Button("Login");
        bLogin.setDefaultButton(true);
        bLogin.setOnAction(e -> login(e));
        box.getChildren().addAll(ausgabe, bLogin);
        return box;
    }


    private void login(ActionEvent e) {
        String name = tfName.getText();
        String passwort = tfPasswort.getText();

        if (loginName.equals(name) && loginPasswort.equals(passwort)) {
            ausgabe = new Label("Login erfolgreich!");
            ausgabe.setText("Login erfolgreich!");
        } else if (loginName.equals(name) & !loginPasswort.equals(passwort)) {
            ausgabe = new Label("Login nicht erfolgreich! Passwort falsch");
            ausgabe.setText("Login nicht erfolgreich! Passwort falsch");
        } else if (loginPasswort.equals(passwort) & !loginName.equals(name)) {
            ausgabe = new Label("Login nicht erfolgreich! Benutzer unbekannt");
            ausgabe.setText("Login nicht erfolgreich! Benutzer unbekannt");
        } else {
            ausgabe = new Label("Login nicht erfolgreich!");
            ausgabe.setText("Login nicht erfolgreich!");
        }
    }
}