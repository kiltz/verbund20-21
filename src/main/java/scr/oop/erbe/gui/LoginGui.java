package oop.erbe.gui;

import javafx.animation.ParallelTransition;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
<<<<<<< HEAD
import javafx.scene.layout.HBoxBuilder;
import javafx.scene.layout.StackPane;
=======
>>>>>>> origin/FabianLechner
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class LoginGui extends Application {
    private VBox box;
    private TextField tfName;
<<<<<<< HEAD
    private PasswordField tfPasswort;
=======
    private VBox box;
    private PasswordField tfPasswort;
    private Label ausgabe = new Label();
    private String loginName = "Hans";
    private String loginPasswort = "Geheim";

    public LoginGui() {
    }
>>>>>>> origin/FabianLechner

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

        Button bLogin = new Button("login");
        bLogin.setOnAction(e -> login(e));

        box.getChildren().addAll(hBoxName, hBoxPasswd, bLogin);
        
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();

    }
<<<<<<< HEAD

    private int zaehler = 0;

    private void login(ActionEvent e) {
        String name = tfName.getText();
        String password = tfPasswort.getText();
        System.out.println("Name: " + name);
        if ("Fabian".equals(name) && "Geheim".equals(password)) {
            Label geschafft = new Label("Login Erfolgreich!");
            box.getChildren().add(geschafft);
        }
        else {
            Label nichtgeschafft = new Label("Login nicht Erfolgreich!");
            box.getChildren().add(nichtgeschafft);


            }
            // Wenn die Daten stimmen zeige in Label "Login erfolgreich!"
            // Wenn die Daten NICHT stimmen zeige in Label "Login NICHT erfolgreich!"

        }
    }
=======
    private void login(ActionEvent e) {
        String name = tfName.getText();
        String passwort = tfPasswort.getText();
        Label ausgabe;

            if (loginName.equals(name) && loginPasswort.equals(passwort)) {
                ausgabe = new Label("Login erfolgreich!");
                ausgabe.setText("Login erfolgreich!");
            } else {
                ausgabe = new Label("Login nicht erfolgreich!");
                ausgabe.setText("Login nicht erfolgreich!");
            }
        box.getChildren().add(ausgabe);
        }
    }
>>>>>>> origin/FabianLechner
