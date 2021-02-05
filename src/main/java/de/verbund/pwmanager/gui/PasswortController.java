package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;

import java.util.List;


public class PasswortController {

    public TextField tfBenutzer;
    public TextField tfName;
    public TextField tfPasswort;
    public TextField tfSuche;
    public TextArea taListe;
    public Label lAusgabe;

    private Manager manager = new Manager();

    public void erstellen(ActionEvent actionEvent) throws Exception {
        if(tfName.getText().equals("") || tfBenutzer.getText().equals("") || tfPasswort.getText().equals("")){
            lAusgabe.setText("Ungueltige Eingabe!");
            lAusgabe.setTextFill(Color.RED);
        } else {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            lAusgabe.setText("Erstellen erfolgreich");
            lAusgabe.setTextFill(Color.BLUE);
            taListe.setText("");
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        }
    }

    public void suche(ActionEvent actionEvent) {
        List<de.verbund.pwmanager.service.Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (de.verbund.pwmanager.service.Passwort p : erg) {
            txt.append(p.getName()+"\t"+p.getBenutzername()+"\t"+p.getPasswort()+"\n");
        }
        taListe.setText(txt.toString());
        lAusgabe.setText("");

    }

    public void pwAendern(ActionEvent actionEvent)throws Exception {
        if(tfName.getText().equals("") || tfBenutzer.getText().equals("") || tfPasswort.getText().equals("")){
            lAusgabe.setText("Ungueltige Eingabe!");
            lAusgabe.setTextFill(Color.RED);
        } else {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            lAusgabe.setText("Passwort erfolgreich geändert");
            lAusgabe.setTextFill(Color.BLUE);
            taListe.setText("");
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        }
    }

    public void ausfuellen(KeyEvent keyEvent) {
        List<de.verbund.pwmanager.service.Passwort> erg = manager.suche(tfName.getText());
        if(erg.size() == 1){
            Passwort pw = erg.get(0);
            tfName.setText(pw.getName());
            tfBenutzer.setText(pw.getBenutzername());
            tfPasswort.setText(pw.getPasswort());
            }

        }
    }

