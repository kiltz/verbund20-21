package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;

import java.util.List;

public class JulianController {

    public TextField tfName;
    public TextField tfUsername;
    public TextField tfPassword;
    public TextField tfAcc;
    public TextArea taResult;
    public Label gName;
    public Label gUsername;
    public Label gPassword;
    public Label lStatus;
    private Manager manager;


    public void forgotPassword(ActionEvent actionEvent) {
        try {
            manager.neu(new Passwort(tfName.getText(), tfUsername.getText(), tfPassword.getText()));
            lStatus.setTextFill(Color.BLUE);
            lStatus.setText(tfName.getText()+ " wurde eingetragen.");
            tfName.setText("");
            tfUsername.setText("");
            tfPassword.setText("");
        } catch (Exception e) {
            lStatus.setTextFill(Color.RED);
            lStatus.setText("Fehler: " + e.getMessage());
        }
    }

    public void createPassword(ActionEvent actionEvent) {
        try {
            manager.neu(new Passwort(tfName.getText(), tfUsername.getText(), tfPassword.getText()));
            lStatus.setTextFill(Color.BLUE);
            lStatus.setText(tfName.getText()+ " wurde eingetragen.");
            tfName.setText("");
            tfUsername.setText("");
            tfPassword.setText("");
        } catch (Exception e) {
            lStatus.setTextFill(Color.RED);
            lStatus.setText("Fehler: " + e.getMessage());
        }
    }

    public void searchPassword(ActionEvent actionEvent) {
        manager = new Manager();
        List<Passwort> erg = manager.suche(tfAcc.getText());
        StringBuffer txt = new StringBuffer("Name\t" + "  " + "Benutzer\t" + "Passwort\n");
        VBox boxAusgabe = new VBox(50);
        boxAusgabe.setPadding(new Insets(20));
        for (Passwort p : erg) {
            txt.append(p.getName() + "      " + "\t" + p.getBenutzername() + "     " + "     " + "\t" + p.getPasswort() + "      " + "\n");
        }
        taResult.setText(txt.toString());
    }
}
