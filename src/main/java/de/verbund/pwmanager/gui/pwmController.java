package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class pwmController {


    public TextField tfName;
    public TextField tfBenutzer;
    public Manager manager=new Manager();
    public TextField tfSuche;
    public TextArea taAusgabe;
    public PasswordField pfPassword;

    public String password;
    public void hinzufügen(ActionEvent actionEvent) throws Exception{
        manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), pfPassword.getText()));
        tfName.setText("");
        tfBenutzer.setText("");
        pfPassword.setText("");
        taAusgabe.setText("Eintrag eingefügt!");
    }

    public void suchen(ActionEvent actionEvent) {
        List<Passwort> foundList=manager.suche(tfSuche.getText());
        taAusgabe.setText("Name: \t Benutzer: \t Passwort:");
        for(Passwort entry:foundList){
            taAusgabe.setText(taAusgabe.getText() + "\n" + entry.getName() + ", \t" + entry.getBenutzername() + ", \t" + entry.getPasswort());
        }
    }

    public void generate(ActionEvent actionEvent) {
        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<15;i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
        }
        pfPassword.setText(password);
        taAusgabe.setText("Vorgeschlagenes Passwort: " + password);

    }


    public void loeschen(ActionEvent actionEvent){
        manager.loeschen();
    }
}
