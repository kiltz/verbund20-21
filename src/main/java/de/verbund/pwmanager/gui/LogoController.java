package de.verbund.pwmanager.gui;

import javafx.fxml.FXML;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Tooltip;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class LogoController {
    public Label lLogo;

    @FXML
    void initialize() {
        Image image = new Image("img/logo.png");
        lLogo.setGraphic(new ImageView(image));
        lLogo.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        lLogo.setTooltip(new Tooltip("Passwort-Manager"));

    }
}
