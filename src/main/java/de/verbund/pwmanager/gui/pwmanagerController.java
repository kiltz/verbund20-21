package de.verbund.pwmanager.gui;


import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.List;


public class pwmanagerController {


    public Manager manager;
    @FXML
    public Button bSuche;
    @FXML
    public TextField tfName;
    @FXML
    public TextField tfUser;
    @FXML
    public TextField tfPasswd;
    @FXML
    public Label lStatus;
    @FXML
    public TextField tfSuche;
    @FXML
    public TextArea taAusgabe;


    public void suche(ActionEvent actionEvent) {
        Manager manager = new Manager();
        System.out.println(manager + "/" + tfSuche);

        List<Passwort> foundList = manager.suche(tfSuche.getText());
        taAusgabe.setText("Name: \t Benutzer: \t Passwort:");
        for (Passwort entry : foundList) {
            taAusgabe.setText(taAusgabe.getText() + "\n" + entry.getName() + ", \t" + entry.getBenutzername() + ", \t" + entry.getPasswort());
        }
    }


    public void eintragen(ActionEvent actionEvent) {
        {

            if (tfName.getText().isEmpty()) {
                lStatus.setTextFill(Color.web("#E23130"));
                lStatus.setText("Wen soll ich eintragen?");
            } else {
                try {
                    manager.neu(new Passwort(tfName.getText(), tfUser.getText(), tfPasswd.getText()));
                    lStatus.setTextFill(Color.web("#005091"));
                    lStatus.setText(tfName.getText() + " wurde eingetragen.");
                    tfName.setText("");
                    tfUser.setText("");
                    tfPasswd.setText("");
                } catch (Exception e) {
                   lStatus.setTextFill(Color.web("#E23130"));
                   lStatus.setText("Fehler: " + e.getMessage());
                }
            }
        }
    }
}