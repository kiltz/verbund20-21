package scr.main.java.gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class LoginGui extends Application {

    private TextField tfName;
    private PasswordField tfPasswort;
    private String Passwort = "12345";
    private String Name = "Testa";



    private VBox box;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hBoxName = new HBox(10);
        Label lName = new Label("Name");
        tfName = new TextField();

        hBoxName.getChildren().addAll(lName, tfName);

        HBox hBoxPasswd = new HBox(10);
        Label lPasswort = new Label("Passwort");



        tfPasswort = new PasswordField();
        hBoxPasswd.getChildren().addAll(lPasswort, tfPasswort);




        Button bLogin = new Button("Einloggen");
        bLogin.setOnAction(e -> login(e));

        box.getChildren().addAll(hBoxName, hBoxPasswd, bLogin);



        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);


        primaryStage.setTitle("Login");
        primaryStage.show();

    }

    private void login(ActionEvent e) {
        String name = tfName.getText();
        String passwort = tfPasswort.getText();
        Label output;
        if (Passwort.equals(passwort)&&Name.equals(name)) {
            output = new Label("Login erfolgreich");
        } else {
            output = new Label("Login nicht erfolgreich");
        }
        box.getChildren().add(output);

    }
}
