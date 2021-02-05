package de.kiltz.pwmanager.gui;

import de.kiltz.pwmanager.StarterApp;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

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
