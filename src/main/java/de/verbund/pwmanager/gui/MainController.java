package de.verbund.pwmanager.gui;

import de.kiltz.pwmanager.StarterApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;

import java.io.IOException;
import java.net.URL;

public class MainController {

    public void doBeenden(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void ladePwManager(ActionEvent actionEvent) throws IOException {
        URL res = getClass().getResource("pwmanager.fxml");
        Parent root = FXMLLoader.load(res);
        StarterApp.pane.setCenter(root);
    }

    public void ladePwDatei(ActionEvent actionEvent) throws IOException {
        URL res = getClass().getResource("pwDatei.fxml");
        Parent root = FXMLLoader.load(res);
        StarterApp.pane.setCenter(root);
    }
}
