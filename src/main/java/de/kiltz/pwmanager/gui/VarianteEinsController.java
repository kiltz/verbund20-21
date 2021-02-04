package de.kiltz.pwmanager.gui;

import de.kiltz.pwmanager.service.Manager;
import de.kiltz.pwmanager.service.Passwort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

import java.util.List;

public class VarianteEinsController {
    public TableView tabelle;
    public TableColumn colBenutzer;
    public TableColumn colName;
    public TextField tfSuche;
    private Manager manager;

    @FXML
    void initialize() {
        manager = new Manager();
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colBenutzer.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
    }

    public void doSuche(ActionEvent actionEvent) {
        List<Passwort> liste = manager.suche(tfSuche.getText());
        ObservableList<Passwort> pw = FXCollections
                .observableArrayList(liste);
        tabelle.setItems(pw);
    }

    public void doZeigDetail(ActionEvent actionEvent) {
        Passwort auswahl = (Passwort) tabelle.getSelectionModel().getSelectedItem();
        // TODO Fenster mit Detailansicht anzeigen
        if(auswahl != null) {
            System.out.println(auswahl);
        } else {
            System.out.println("Keiner ausgewählt");
        }
    }
}
