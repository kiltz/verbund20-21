package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class passwdManagerApp extends Application {
    public TextField tfName;
    public TextField tfBenutzer;
    public PasswordField pfPassword;
    public TextField tfSuchen;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root = new VBox();

        HBox boxLineName=getLineName();
        HBox boxLineBenutzer=getLineBenutzer();
        HBox boxLinePassword=getLinePassword();
        HBox boxLineSuchen=getLineSuchen();

        root.getChildren().add(boxLineName);
        root.getChildren().add(boxLineBenutzer);
        root.getChildren().add(boxLinePassword);
        root.getChildren().add(boxLineSuchen);

        Scene scene=new Scene(root, 400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("passwdManagerApp");
        primaryStage.show();
    }

    public HBox getLineName(){
        Label lName=new Label("Name");
        tfName=new TextField();

        HBox box=new HBox();
        box.getChildren().add(lName);
        box.getChildren().add(tfName);
        return box;
    }

    public HBox getLineBenutzer(){
        Label lBenutzer=new Label("Benutzer");
        tfBenutzer=new TextField();
        HBox box=new HBox();
        box.getChildren().add(lBenutzer);
        box.getChildren().add(tfBenutzer);
        return box;
    }

    public HBox getLinePassword(){
        Label lPassword=new Label("Passwort");
        pfPassword=new PasswordField();
        Button bEintragen=new Button("Eintragen");
        bEintragen.setOnAction(e->eintragen(e));
        HBox box=new HBox();
        box.getChildren().add(lPassword);
        box.getChildren().add(pfPassword);
        box.getChildren().add(bEintragen);
        return box;
    }

    public HBox getLineSuchen(){
        tfSuchen=new TextField();
        Button bSuchen=new Button("Suchen");
        bSuchen.setOnAction(e->suchen(e));
        HBox box=new HBox();
        box.getChildren().add(tfSuchen);
        box.getChildren().add(bSuchen);
        return box;
    }

    public void eintragen(ActionEvent e){

    }
    public void suchen(ActionEvent e){

    }
}
