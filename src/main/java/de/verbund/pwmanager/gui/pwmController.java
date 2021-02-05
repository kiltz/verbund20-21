package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;
import java.util.concurrent.ExecutionException;

public class pwmController {


    public TextField tfName;
    public TextField tfBenutzer;
    public Manager manager = new Manager();
    public TextField tfSuche;
    public TextArea taAusgabe;
    public PasswordField pfPassword;

    public String password;

    public void hinzufügen(ActionEvent actionEvent) throws Exception {
        try {
            if (!tfName.getText().isEmpty() && !tfBenutzer.getText().isEmpty() && !pfPassword.getText().isEmpty()) {
                manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), pfPassword.getText()));
                tfName.setText("");
                tfBenutzer.setText("");
                pfPassword.setText("");
                taAusgabe.setText("Eintrag eingefügt!");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Fehler!");
            alert.setHeaderText("Eingaben sind leer!");
            alert.setContentText("Eingaben für Name, Benutzer und Passwort dürfen nicht leer sein!");
            alert.show();
            alert.setHeight(200);
            alert.setWidth(300);
        }
    }

    public void suchen(ActionEvent actionEvent) {
        List<Passwort> foundList = manager.suche(tfSuche.getText());
        taAusgabe.setText("Name: \t Benutzer: \t Passwort:");
        for (Passwort entry : foundList) {
            taAusgabe.setText(taAusgabe.getText() + "\n" + entry.getName() + ", \t" + entry.getBenutzername() + ", \t" + entry.getPasswort());
        }
    }

    public void generate(ActionEvent actionEvent) {
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
        for (int i = 0; i < 15; i++) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
        }
        pfPassword.setText(password);
        taAusgabe.setText("Vorgeschlagenes Passwort: " + password);

    }


    public void loeschen(ActionEvent actionEvent) {
        manager.loeschen();
    }
}
