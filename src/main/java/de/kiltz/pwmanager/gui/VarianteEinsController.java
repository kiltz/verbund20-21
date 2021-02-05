package de.kiltz.pwmanager.gui;

import de.kiltz.pwmanager.service.Manager;
import de.kiltz.pwmanager.service.Passwort;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.IOException;
import java.net.URL;
import java.util.List;

public class VarianteEinsController {
    public TableView tabelle;
    public TableColumn colBenutzer;
    public TableColumn colName;
    public TextField tfSuche;
    public Label lInfo;
    private Manager manager;
    public static Passwort auswahl;

    @FXML
    void initialize() {
        manager = new Manager();
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colBenutzer.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        tabelle.setRowFactory(tv -> {
            TableRow<Passwort> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (event.getClickCount() == 2 && (!row.isEmpty())) {
                    try {
                        doZeigDetail(null);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            });
            return row;
        });

    }

    public void doSuche(ActionEvent actionEvent) {
        List<Passwort> liste = manager.suche(tfSuche.getText());
        ObservableList<Passwort> pw = FXCollections
                .observableArrayList(liste);
        tabelle.setItems(pw);
    }

    public void doZeigDetail(ActionEvent actionEvent) throws IOException {
        auswahl = (Passwort) tabelle.getSelectionModel().getSelectedItem();
        if(auswahl != null) {
            URL res = getClass().getResource("detail.fxml");
            Parent root = FXMLLoader.load(res);
            Stage stage = new Stage();
            stage.setTitle("Detail");
            stage.setScene(new Scene(root));
            stage.show();
        } else {
            lInfo.setText("Keiner ausgewählt");
        }
    }

    public void doCopyPasswd(ActionEvent actionEvent) {
        auswahl = (Passwort) tabelle.getSelectionModel().getSelectedItem();
        if(auswahl != null) {
            StringSelection content = new StringSelection(auswahl.getPasswort());

            Toolkit.getDefaultToolkit().getSystemClipboard().setContents(content, new ClipboardOwner() {
                @Override
                public void lostOwnership(Clipboard clipboard, Transferable contents) {
                }
            });
            lInfo.setText("PW kopiert");
        }
    }
}
