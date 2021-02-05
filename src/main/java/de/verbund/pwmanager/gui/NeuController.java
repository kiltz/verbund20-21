package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class NeuController {
    public TextField tfName;
    public TextField tfBenutzer;
    public TextField tfPasswort;
    private Passwort passwort;

    @FXML
    void initialize() {
        passwort = VarianteEinsController.auswahl;
        if (passwort != null) {
            tfName.setText(passwort.getName());
            tfBenutzer.setText(passwort.getBenutzername());
            tfPasswort.setText(passwort.getPasswort());
        }
    }

    public void doSpeichern(ActionEvent actionEvent) {
        passwort.setName(tfName.getText());
        passwort.setBenutzername(tfBenutzer.getText());
        passwort.setPasswort(tfPasswort.getText());
        Manager m = new Manager();
        try {
            m.neu(passwort);
            ((Stage)tfName.getScene().getWindow()).close();
        } catch (Exception e) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setTitle("Fehler beim Speichern");
            alert.setContentText(e.getMessage());
            alert.show();
        }
    }
}
