package gui;

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

public class LoginDialog extends Application{
    public static void main(String[] args) {
        launch(null);
    }

    private TextField tfName;
    private VBox vbox;
    private PasswordField password;
    private String loginId = "Julian";
    private String loginPw = "Passwort";


    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lname = new Label("Benutzername: ");
        tfName = new TextField();

        Label lpw = new Label("Passwort: ");
        password = new PasswordField();

        Button btnLogin = new Button("Login");
        btnLogin.setPadding(insets);
        Insets insets = new Insets(20);
        btnLogin.setOnAction(event -> login(e));

    }

    private void login(ActionEvent e) {
        String name = tfName.getText();
        String passwort = password.getText();
        Label ausgabe = new Label();
    }
}
