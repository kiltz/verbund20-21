package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class pwmController {


    public TextField tfName;
    public TextField tfBenutzer;
    public TextField tfPasswort;
    public Manager manager=new Manager();
    public TextField tfSuche;
    public TextArea taAusgabe;

    public void hinzufügen(ActionEvent actionEvent) throws Exception{
        manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
    }

    public void suchen(ActionEvent actionEvent) {
        List<Passwort> foundList=manager.suche(tfSuche.getText());
        for(Passwort entry:foundList){
            taAusgabe.setText(taAusgabe.getText() + "\n" + entry.getName() + ";" + entry.getBenutzername() + ";" + entry.getPasswort());
        }
    }
}
