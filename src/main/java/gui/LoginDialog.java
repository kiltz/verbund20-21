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
import javafx.scene.paint.Color;

public class LoginDialog extends Application{
    public static void main(String[] args) {
        launch(null);
    }

    private TextField tfName;
    private PasswordField password;
    private Label lprufen;


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10));

        HBox hBoxName = new HBox(10);
        Label lname = new Label("Benutzername: ");
        tfName = new TextField();

        HBox hBoxPassword = new HBox(10);
        Label lpw = new Label("Passwort: ");
        password = new PasswordField();

        Button btnLogin = new Button("Login");
        Insets insets = new Insets(20);
        btnLogin.setPadding(insets);
        btnLogin.setOnAction(event -> login(event));

        hBoxName.getChildren().addAll(lname, tfName);
        hBoxPassword.getChildren().addAll(lpw, password);

        lprufen = new Label("");

        box.getChildren().addAll(hBoxName, hBoxPassword, btnLogin, lprufen);

        Scene scene = new Scene(box, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login App");
        primaryStage.show();
    }

    private void login(ActionEvent e) {
        String name = tfName.getText();
        String passwort = password.getText();

            if ("".equals(name) || "".equals(passwort)){
            lprufen.setText("Es muss etwas eingegeben werden!");
            lprufen.setTextFill(Color.RED);
        }
            else if("Test".equals(name) && "Geheim".equals(passwort)) {
            lprufen.setText("Login erfolgreich!");
            lprufen.setTextFill(Color.BLUE);
        }else{
            lprufen.setText("Login nicht erfolgreich!");
            lprufen.setTextFill(Color.RED);
        }
    }
}