package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.util.List;

public class pwmController {


    public TextField tfName;
    public TextField tfBenutzer;
    public Manager manager=new Manager();
    public TextField tfSuche;
    public TextArea taAusgabe;
    public PasswordField pfPassword;
    int ten = 10;
    int twenty = 20;

    String savedpasswordcleartext;

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

    public void generatepasswordnumberspecialcharactersTEN(ActionEvent actionEvent) {
        password = "";
        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz0123456789!§$%&/()=?`´";
        for(int i=0; i<10;i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
            savedpasswordcleartext = password;
        }
        pfPassword.setText(password);
        taAusgabe.setText("Passwort: " + password);

    }

    public void generatepasswordnumberspecialcharactersTWENTY(ActionEvent actionEvent) {
        password = "";

        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz0123456789!§$%&/()=?`´";
        for(int i=0; i<20;i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
            savedpasswordcleartext = password;
        }
        pfPassword.setText(password);
        taAusgabe.setText("Passwort: " + password);

    }

    public void generatepasswordTEN(ActionEvent actionEvent) {
        password = "";

        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<10;i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
            savedpasswordcleartext = password;
        }
        pfPassword.setText(password);
        taAusgabe.setText("Passwort: " + password);

    }

    public void generatepasswordTWENTY(ActionEvent actionEvent) {
        password = "";

        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz";
        for(int i=0; i<20;i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
            savedpasswordcleartext = password;
        }
        pfPassword.setText(password);
        taAusgabe.setText("Passwort: " + password);

    }


    public void copy(ActionEvent actionEvent) {
        String str = savedpasswordcleartext;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection strSel = new StringSelection(str);
        clipboard.setContents(strSel, null);

    }




}
