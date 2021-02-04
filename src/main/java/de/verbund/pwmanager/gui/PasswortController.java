package de.verbund.pwmanager.gui;

import basic.liste.pwmanager.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

public class PasswortController {
    @FXML
    private TextField tfName;
    @FXML
    private TextField tfBenutzer;
    @FXML
    private TextField tfPasswort;
    @FXML
    private Label lAntwort;
    @FXML
    private TextField tfWechselName;
    @FXML
    private TextField tfWechselBenutzer;
    @FXML
    private TextField tfAltPasswort;
    @FXML
    private TextField tfNeuPasswort;
    @FXML
    private TextField tfSuche;
    @FXML
    private TextArea taSuchErgebnis;

    public void doCreate(ActionEvent actionEvent) {

    }

    public void doSuche(ActionEvent actionEvent) {
    }

    public void doSwitch(ActionEvent actionEvent) {
    }
}
