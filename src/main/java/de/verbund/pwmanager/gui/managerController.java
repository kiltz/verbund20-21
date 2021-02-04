package de.verbund.pwmanager.gui;

import gui.feature.passwort.PasswdApp;
import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class managerController {

    public TextField tfName;
    public TextField tfBenutzer;
    public TextField pfPasswort;
    public TextArea taAusgabe;
    public TextField tfSuche;

    private String validNormal = "abcdefghijklmnopqrstuvwxyz";
    private String validCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String validNumbers = "0123456789";
    private String validExclusives = "!@§$%&/()=?`{[]}#+-*";
    private String generatedPassword;

    private Manager manager = new Manager();

    @FXML
    private void eintragen() {

        try {
            if (!tfName.getText().isEmpty() && !tfBenutzer.getText().isEmpty() && !pfPasswort.getText().isEmpty()) {
                taAusgabe.setText("");
                manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), pfPasswort.getText()));
                tfName.setText("");
                tfBenutzer.setText("");
                pfPasswort.setText("");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("WHAT DID YOU DO?!?!?!");
            alert.setHeaderText("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAH");
            alert.setContentText("Chef, Aquarium brennt!");
            alert.show();
        }
    }

    @FXML
    private void suche() {
        List<Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (Passwort p : erg) {
            txt.append(p.getName() + "\t" + p.getBenutzername() + "\t" + p.getPasswort() + "\n");
        }
        taAusgabe.setText(txt.toString());
    }

    public String generate(ActionEvent actionEvent) {

        String allowedString = validNormal + validCapital + validNumbers + validExclusives;
        generatedPassword = "";

        for (int i = 0; i < 12; i++) {
            int pos = (int) (Math.random() * allowedString.length());
            generatedPassword += allowedString.charAt(pos);
        }
        int capitals = (int) (Math.random() * validCapital.length());
        generatedPassword.replace(generatedPassword.charAt(0), validCapital.charAt(capitals));

        int numbers = (int) (Math.random() * validNumbers.length());
        generatedPassword.replace(generatedPassword.charAt(1), validNumbers.charAt(numbers));

        int exclusives = (int) (Math.random() * validExclusives.length());
        generatedPassword.replace(generatedPassword.charAt(2), validExclusives.charAt(exclusives));

        taAusgabe.setText("Vorgeschlagenes Passwort: " + generatedPassword);

        return generatedPassword;
    }

    public void loeschen(ActionEvent actionEvent) {
        manager.loeschen();
    }

    public void einfuegen(ActionEvent actionEvent) {
        pfPasswort.setText(generatedPassword);
    }
}
