package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class passwdManagerApp extends Application {
    public TextField tfName;
    public TextField tfBenutzer;
    public PasswordField pfPassword;
    public TextField tfSuchen;
    private TextArea taAusgabe;

    public Manager manager;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root = new VBox();

        HBox boxLineName=getLineName();
        HBox boxLineBenutzer=getLineBenutzer();
        HBox boxLinePassword=getLinePassword();
        HBox boxLineSuchen=getLineSuchen();
        HBox boxLineAusgabe=getLineAusgabe();

        root.getChildren().add(boxLineName);
        root.getChildren().add(boxLineBenutzer);
        root.getChildren().add(boxLinePassword);
        root.getChildren().add(boxLineSuchen);
        root.getChildren().add(boxLineAusgabe);

        root.setSpacing(10);

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
        box.setSpacing(10);
        return box;
    }

    public HBox getLineBenutzer(){
        Label lBenutzer=new Label("Benutzer");
        tfBenutzer=new TextField();
        HBox box=new HBox();
        box.getChildren().add(lBenutzer);
        box.getChildren().add(tfBenutzer);
        box.setSpacing(10);
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
        box.setSpacing(10);
        return box;
    }

    public HBox getLineSuchen(){
        tfSuchen=new TextField();
        Button bSuchen=new Button("Suchen");
        bSuchen.setOnAction(e->suchen(e));
        HBox box=new HBox();
        box.getChildren().add(tfSuchen);
        box.getChildren().add(bSuchen);
        box.setSpacing(10);
        return box;
    }

    public HBox getLineAusgabe(){
        taAusgabe=new TextArea();
        HBox box=new HBox();
        box.getChildren().add(taAusgabe);
        box.setSpacing(10);
        return box;
    }

    public void eintragen(ActionEvent e){
        manager.neu(new Passwort(tfName.getText(),tfBenutzer.getText(), pfPassword.getText()));
    }
    public void suchen(ActionEvent e){
        manager.suche(tfSuchen.getText());
    }
}
