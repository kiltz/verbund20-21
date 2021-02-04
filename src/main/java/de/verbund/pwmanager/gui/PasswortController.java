package de.verbund.pwmanager.gui;

import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;

import java.util.List;

public class PasswortController {
    private Manager manager;
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

    @FXML
    void initialize() {
        manager = new Manager();
    }


    public void doCreate(ActionEvent actionEvent) {
        if (tfName.getText().isEmpty()) {
            lAntwort.setText("Wen soll ich eintragen?");
        } else {
            try {
                manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));

                lAntwort.setText(tfName.getText()+" wurde eingetragen.");
                tfName.setText("");
                tfBenutzer.setText("");
                tfPasswort.setText("");
            } catch (Exception e) {

                lAntwort.setText("Fehler: "+e.getMessage());
            }
        }
    }

    public void doSuche(ActionEvent actionEvent) {
        List<Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (Passwort p : erg) {
            txt.append(p.getName()+"\t"+p.getBenutzername()+"\t"+p.getPasswort()+"\n");
        }
        taSuchErgebnis.setText(txt.toString());
    }

    public void doSwitch(ActionEvent actionEvent) {
    }
}
