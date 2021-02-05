package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.List;

public class managerController {

    public TextField textName;
    public TextField textUser;
    public TextField textPasswort;
    public TextArea textAusgabe;
    public TextField textSuche;

    private String vorschlagPasswort;

    private Manager manager = new Manager();

    @FXML
    private void eintragen() {

        try {
            if (!textName.getText().isEmpty() && !textUser.getText().isEmpty() && !textPasswort.getText().isEmpty()) {
                textAusgabe.setText("");
                manager.neu(new Passwort(textName.getText(), textUser.getText(), textPasswort.getText()));
                textName.setText("");
                textUser.setText("");
                textPasswort.setText("");
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Keine leeren Eingaben!");
        }
    }

    @FXML
    private void suche() { //Anzeige in Fenster
        List<Passwort> erg = manager.suche(textSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (Passwort p : erg) {
            txt.append(p.getName() + "\t" + p.getBenutzername() + "\t" + p.getPasswort() + "\n");
        }
        textAusgabe.setText(txt.toString());
    }

    public String generate(ActionEvent actionEvent) {

        String allowedString = "abcdefghijklmnopqrstuvwxyz";
        vorschlagPasswort = "";

        for (int i = 0; i < 12; i++) {
            int pos = (int) (Math.random() * allowedString.length());
            vorschlagPasswort += allowedString.charAt(pos);
        }

        textAusgabe.setText("Vorschlag: " + vorschlagPasswort);

        return vorschlagPasswort;
    }

    public void listeLeeren(ActionEvent actionEvent) {
        manager.listeLoeschen();
    }

    public void einfuegen(ActionEvent actionEvent) {
        textPasswort.setText(vorschlagPasswort);
    }
}