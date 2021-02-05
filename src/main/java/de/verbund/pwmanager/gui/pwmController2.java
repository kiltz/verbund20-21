package de.verbund.pwmanager.gui;

import java.awt.*;
import de.verbund.pwmanager.service.Manager;
import de.verbund.pwmanager.service.Passwort;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.CheckBox;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.IOException;
import java.util.List;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.net.URL;
import de.verbund.pwmanager.gui.pwmController;

public class pwmController2 {
    public static Label lsonderCounter;
    public static Label lgroßkleinCounter;
    public static Label lzahlenCounter;
    public static Label lallesCounter;
    public static Label lgenerateCounter;


    public static void counter() {
        lsonderCounter.setText("Sonderzeichen Passwort "+ pwmController.SonderCounter+"x Generiert");
        lzahlenCounter.setText("Zahlen Passwort "+pwmController.ZahlenCounter+"x Generiert");
        lgroßkleinCounter.setText("Groß & Klein Passwort "+pwmController.GroßkleinCounter+"x Generiert");
        lallesCounter.setText("Passwort mit allen Zeichen "+pwmController.AllesCounter+"x Generiert");
        lgenerateCounter.setText(pwmController.GenerateCounter+" Passwortörter Generiert");
    }
}
