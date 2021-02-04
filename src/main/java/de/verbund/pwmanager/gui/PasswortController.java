package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

import java.util.List;


public class PasswortController {

    public TextField tfBenutzer;
    public TextField tfName;
    public TextField tfPasswort;
    public TextField tfSuche;

    private Manager manager = new Manager();

    public void erstellen(ActionEvent actionEvent) throws Exception {
        manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
    }

    public void suche(ActionEvent actionEvent) {
        List<de.verbund.pwmanager.service.Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (de.verbund.pwmanager.service.Passwort p : erg) {
            txt.append(p.getName()+"\t"+p.getBenutzername()+"\t"+p.getPasswort()+"\n");
        }
        //taErgebnis.setText(txt.toString());
        System.out.println(txt.toString());
    }
}
