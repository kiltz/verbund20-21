package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
public class LoginApplikation extends Application {

    private Label lAusgabe=new Label("Bitte fülle alle Felder aus!");
    private TextField tfName;
    private TextField tfPassword;
    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
//boxerstellung
        VBox completeBox=new VBox();
//zeile eins in der ansicht
        HBox zeile1=new HBox();
        Label lName=new Label("Nutzername:");
        tfName=new TextField();
        zeile1.getChildren().add(lName);
        zeile1.getChildren().add(tfName);
//zeile zwei in der ansicht
        HBox zeile2=new HBox();
        Label lPassword=new Label("Passwort:");
        tfPassword=new TextField();
        zeile2.getChildren().add(lPassword);
        zeile2.getChildren().add(tfPassword);
//zeile drei in der ansicht
        HBox zeile3=new HBox();
        Button bLogin=new Button("Login");
        bLogin.setOnAction(e->login(e));
        zeile3.getChildren().add(bLogin);
//zeile vier in der ansicht
        HBox zeile4=new HBox();
        zeile4.getChildren().add(lAusgabe);
        //alle elemente der Box hinzufügen
        completeBox.getChildren().add(zeile1);
        completeBox.getChildren().add(zeile2);
        completeBox.getChildren().add(zeile3);
        completeBox.getChildren().add(zeile4);

        //scenen einstellungen
        Scene scene=new Scene(completeBox, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Pauls Superlogin");
        primaryStage.show();

    }

    //methode login
    public void login(ActionEvent e){
        if(tfName.getText().equals("Paul") && tfPassword.getText().equals("123")){
            lAusgabe.setText("Login erfolgreich!");
        }
        else{
            lAusgabe.setText("Fehler!");
        }

    }
}
