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
    public TextField tfUser;
    public PasswordField pfPassword;
    public TextField tfSearch;
    private TextArea taOutput;

    public Manager manager;
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root = new VBox();

        HBox boxLineName=getLineName();
        HBox boxLineUser=getLineUser();
        HBox boxLinePassword=getLinePassword();
        HBox boxLineSearch=getLineSearch();
        HBox boxLineOutput=getLineOutput();

        root.getChildren().add(boxLineName);
        root.getChildren().add(boxLineUser);
        root.getChildren().add(boxLinePassword);
        root.getChildren().add(boxLineSearch);
        root.getChildren().add(boxLineOutput);

        root.setSpacing(10);

        Scene scene=new Scene(root, 400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Passwort Manager");
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

    public HBox getLineUser(){
        Label lBenutzer=new Label("User");
        tfUser=new TextField();
        HBox box=new HBox();
        box.getChildren().add(lBenutzer);
        box.getChildren().add(tfUser);
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

    public HBox getLineSearch(){
        tfSearch=new TextField();
        Button bSuchen=new Button("Suchen");
        bSuchen.setOnAction(e->suchen(e));
        HBox box=new HBox();
        box.getChildren().add(tfSearch);
        box.getChildren().add(bSuchen);
        box.setSpacing(10);
        return box;
    }

    public HBox getLineOutput(){
        taOutput=new TextArea();
        taOutput.setEditable(false);
        HBox box=new HBox();
        box.getChildren().add(taOutput);
        box.setSpacing(10);
        return box;
    }

    public void eintragen(ActionEvent e){
        manager.neu(new Passwort(tfName.getText(),tfUser.getText(), pfPassword.getText()));
    }
    public void suchen(ActionEvent e){

        manager.suche(tfSearch.getText());
    }
}


