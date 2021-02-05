package de.verbund.pwmanager.gui;

import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.paint.Color;
import java.util.List;

public class PwManagerController {

    public TextField tfName;
    public TextField tfBenutzer;
    public TextField tfPasswort;
    public TextField tfSuche;
    public Label lAusgabe;
    public Label lName;
    private Manager manager;
    public TableView tvAusgabe;
    public TableColumn colBenutzer;
    public TableColumn colName;
    public TableColumn colPasswort;

    @FXML
    void initialize() {
        manager = new Manager();
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colBenutzer.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        colPasswort.setCellValueFactory(new PropertyValueFactory<>("passwort"));
        tvAusgabe.setRowFactory(tv -> {
            TableRow<Passwort> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    manager.suche(null);
                }
            });
            return row;
        });
    }

        public void suchePW (ActionEvent actionEvent) {
            manager = new Manager();
            List<Passwort> erg = manager.suche(tfSuche.getText());
            ObservableList<Passwort> pw = FXCollections
                    .observableArrayList(erg);
            StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
            for (Passwort p : erg) {
                txt.append(p.getName() + "\t" + p.getBenutzername() + "\t" + p.getPasswort() + "\n");
            }
            lAusgabe.setText("Suche erfolgreich");
            lAusgabe.setTextFill(Color.BLUE);
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
            tvAusgabe.setItems(pw);
            }

        public void erstellePW (ActionEvent actionEvent) {
        try {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            lAusgabe.setTextFill(Color.BLUE);
            lAusgabe.setText(tfName.getText() + " wurde eingetragen.");
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        } catch (Exception e) {
            lAusgabe.setTextFill(Color.RED);
            lAusgabe.setText("Fehler: " + e.getMessage());
        }
        }


        public void aenderePW (ActionEvent actionEvent) {
        try {
            manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), tfPasswort.getText()));
            lAusgabe.setTextFill(Color.BLUE);
            lAusgabe.setText(tfName.getText() + " wurde geändert.");
            tfName.setText("");
            tfBenutzer.setText("");
            tfPasswort.setText("");
        } catch (Exception e) {
            lAusgabe.setTextFill(Color.RED);
            lAusgabe.setText("Fehler: " + e.getMessage());
        }
    }
}
