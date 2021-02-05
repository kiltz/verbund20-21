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

    public void doErsteVersion(ActionEvent actionEvent) throws IOException {
        URL res = getClass().getResource("varianteEins.fxml");
        Parent root = FXMLLoader.load(res);
        StarterApp.pane.setCenter(root);
    }

    public void doLeer(ActionEvent actionEvent) throws IOException {
        URL res = getClass().getResource("logo.fxml");
        Parent root = FXMLLoader.load(res);
        StarterApp.pane.setCenter(root);
    }
}
