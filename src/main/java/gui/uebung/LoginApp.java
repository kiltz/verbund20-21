package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import jdk.nashorn.internal.ir.LabelNode;

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

    private Label lAusgabe=new Label("Daten eingeben");
    private TextField tfName;
    private TextField tfPassword;
    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox completeBox=new VBox();
        Insets insets=new Insets(10,10,10,10);
        HBox line1=new HBox();
        Label lName=new Label("Name:");
        tfName=new TextField();
        line1.getChildren().add(lName);
        line1.getChildren().add(tfName);
        line1.setSpacing(10);
        line1.setPadding(insets);

        HBox line2=new HBox();
        Label lPassword=new Label("Passwort:");
        tfPassword=new TextField();
        line2.getChildren().add(lPassword);
        line2.getChildren().add(tfPassword);
        line2.setSpacing(10);
        line2.setPadding(insets);

        HBox line3=new HBox();
        Button bLogin=new Button("Login");
        bLogin.setOnAction(e->login(e));
        line3.getChildren().add(bLogin);
        line3.setSpacing(10);
        line3.setPadding(insets);

        HBox line4=new HBox();
        line4.getChildren().add(lAusgabe);
        line4.setSpacing(10);
        line4.setPadding(insets);

        completeBox.getChildren().add(line1);
        completeBox.getChildren().add(line2);
        completeBox.getChildren().add(line3);
        completeBox.getChildren().add(line4);

        Scene scene=new Scene(completeBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();

    }
    public void login(ActionEvent e){
        if(tfName.getText().equals("Hans") && tfPassword.getText().equals("Hans")){
            lAusgabe.setText("Login erfolgreich!");
        }
        else{
            lAusgabe.setText("Fehlerhafte eingabe!");
        }

    }
}
