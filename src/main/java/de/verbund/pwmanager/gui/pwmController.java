package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.TextField;

public class pwmController {


    public TextField tfName;
    public TextField tfBenutzer;
    public TextField tfPasswort;
    public Manager manager=new Manager();
    public void hinzufügen(ActionEvent actionEvent) throws Exception{
        manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
    }
}
