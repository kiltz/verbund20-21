package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class managerController {

    public TextField tfName;
    public TextField tfBenutzer;
    public TextField tfPasswort;
    public TextArea taAusgabe;
    public TextField tfSuche;
    private Manager manager = new Manager();

    @FXML
    private void eintragen() {
        try {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        } catch (Exception e) {
            System.out.println("Ich bin kaputt D:");
        }
    }

    @FXML
    private void suche() {
        List<Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (Passwort p : erg) {
            txt.append(p.getName() + "\t" + p.getBenutzername() + "\t" + p.getPasswort() + "\n");
        }
        taAusgabe.setText(txt.toString());
    }

}
