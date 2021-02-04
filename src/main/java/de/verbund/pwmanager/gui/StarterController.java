package de.verbund.pwmanager.gui;

import java.awt.*;
import basic.liste.pwmanager.Manager;
import javafx.fxml.FXML;
import java.awt.event.ActionEvent;
import java.util.List;
import basic.liste.pwmanager.Passwort;
import basic.liste.pwmanager.Manager;
import de.verbund.pwmanager.test.TestFallCopy;
import java.io.File;
import de.verbund.pwmanager.utils.DateiCopy;



public class StarterController {

    private TextField tfname;
    private TextField tfbenutzer;
    private TextField tfpasswort;

    private Manager manager = new Manager();

    private TextArea taergebnis;


    public void doSave(javafx.event.ActionEvent save) throws Exception {
        manager.neu(new Passwort(tfname.getText(),tfbenutzer.getText(), tfpasswort.getText()));

        DateiCopy passwörter = new DateiCopy("Passwörter.txt");
///        passwörter.schreibe(manager.neu(new Passwort(tfname.getText(),tfbenutzer.getText(), tfpasswort.getText())));

//        String passwort = manager

        String inhalt = passwörter.lese();
        System.out.println("'" + inhalt + "'");
//        System.out.println("'" + passwort + "'");

    }

    public void doChange(javafx.event.ActionEvent change) {

    }

    public void doSearch(javafx.event.ActionEvent search) {
        List<Passwort> liste = manager.suche("m");
        for(Passwort ergebnis: liste) {
            taergebnis.setText(taergebnis.getText() + ergebnis.toString() + "\n");
        }
    }
}