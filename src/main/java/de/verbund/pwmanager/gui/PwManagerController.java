package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.util.List;

public class PwManagerController {
    public TextField tfName;
    public TextField tfBenutzer;
    public TextField tfPasswort;
    public TextField tfSuche;
    public TextArea taAusgabe;
    public Label lAusgabe;
    private final Manager manager = new Manager();

    public void suchePW(ActionEvent actionEvent) {
        List<Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (Passwort p : erg) {
            txt.append(p.getName()+"\t"+p.getBenutzername()+"\t"+p.getPasswort()+"\n");
        }
        lAusgabe.setText("Suche erfolgreich");
        lAusgabe.setTextFill(Color.BLUE);
        tfName.setText("");
        tfBenutzer.setText("");
        tfPasswort.setText("");
        taAusgabe.setText(txt.toString());

    }

    public void erstellePW(ActionEvent actionEvent) throws Exception {
        try {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            lAusgabe.setTextFill(Color.BLUE);
            lAusgabe.setText(tfName.getText()+" wurde eingetragen.");
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        } catch (Exception e) {
            lAusgabe.setTextFill(Color.RED);
            lAusgabe.setText("Fehler: "+e.getMessage());
        }
    }

    public void aenderePW(ActionEvent actionEvent) throws Exception {
        try {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            lAusgabe.setTextFill(Color.BLUE);
            lAusgabe.setText(tfName.getText()+" wurde eingetragen.");
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        } catch (Exception e) {
            lAusgabe.setTextFill(Color.RED);
            lAusgabe.setText("Fehler: "+e.getMessage());
        }
    }
}
