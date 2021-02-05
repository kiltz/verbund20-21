package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
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
    public CheckBox cbSonderzeichen;
    public CheckBox cbGroßundKlein;
    public CheckBox cbZahlen;
    public CheckBox cbAlles;
    public TextField tflenght;

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
    public void pwgenerieren(ActionEvent actionEvent) {
        password = "";
        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz";
        if(cbSonderzeichen.isSelected())
        {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz!§$%&/()=?";
        }
        if(cbZahlen.isSelected())
        {
            erlaubteZeichen = "1234567890";
        }
        if(cbGroßundKlein.isSelected())
        {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if(cbAlles.isSelected())
        {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz!§$%&/()=?ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        }

        for(int i=0; i<Integer.valueOf(tflenght.getText());i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
            savedpasswordcleartext = password;
        }
        pfPassword.setText(password);
        taAusgabe.setText("Passwort: " + password);
    }
}
