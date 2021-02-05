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
    public Button Search;
    @FXML
    public TextField NameField;
    @FXML
    public TextField UserField;
    @FXML
    public TextField PasswdField;
    @FXML
    public Label lStatus; //anschauen
    @FXML
    public TextField SearchField;
    @FXML
    public TextArea ausgabe;


    public void Search(ActionEvent actionEvent) {
        List<Passwort> foundList = manager.suche(SearchField.getText());
        ausgabe.setText("Name: \t Benutzer: \t Passwort:");
        for (Passwort entry : foundList) {
            ausgabe.setText(ausgabe.getText() + "\n" + entry.getName() + ", \t" + entry.getBenutzername() + ", \t" + entry.getPasswort());
        }
    }


    public void eintragen(ActionEvent actionEvent) {
        {

            if (NameField.getText().isEmpty()) {
                lStatus.setTextFill(Color.web("#E23130"));
                lStatus.setText("Wen soll ich eintragen?");
            } else {
                try {
                    manager.neu(new Passwort(NameField.getText(), UserField.getText(), PasswdField.getText()));
                    lStatus.setTextFill(Color.web("#005091"));
                    lStatus.setText(NameField.getText() + " wurde eingetragen.");
                    NameField.setText("");
                    UserField.setText("");
                    PasswdField.setText("");
                } catch (Exception e) {
                   lStatus.setTextFill(Color.web("#E23130"));
                   lStatus.setText("Fehler: " + e.getMessage());
                }
            }
        }
    }
}