package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class edditController {
    public Passwort passwort= pwmController.passwort;
    public TextField tfNameEddit;
    public TextField tfBenutzerEddit;
    public TextField tfPasswortEddit;



    public void ändern(ActionEvent actionEvent) {

    }

    public void zeigeAktuell(ActionEvent actionEvent) {
        tfNameEddit.setText(passwort.getName());
        tfBenutzerEddit.setText(passwort.getBenutzername());
        tfPasswortEddit.setText(passwort.getPasswort());
    }
}
