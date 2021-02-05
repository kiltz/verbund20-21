package de.verbund.pwmanager.gui;

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
import de.verbund.pwmanager.gui.pwmController2;



public class pwmController {




    public TextField tfName;
    public TextField tfBenutzer;
    public Manager manager=new Manager();
    public TextField tfSuche;
    public TextArea taAusgabe;
    public PasswordField pfPassword;
    public CheckBox cbSonderzeichen;
    public CheckBox cbGroßundKlein;
    public CheckBox cbZahlen;
    public CheckBox cbAlles;
    public TextField tflenght;
    public static int GenerateCounter;
    public static int SonderCounter;
    public static int ZahlenCounter;
    public static int GroßkleinCounter;
    public static int AllesCounter;

    String savedpasswordcleartext;

    public String password;
    public void hinzufuegen(ActionEvent actionEvent) throws Exception{

        Passwort pw = new Passwort(tfName.getText(), tfBenutzer.getText(), pfPassword.getText());
        System.out.println(pw);
        manager.neu(pw);
        System.out.println(tfName.getText());
        tfName.setText("");
        tfBenutzer.setText("");
        pfPassword.setText("");
        taAusgabe.setText("Eintrag eingefügt!");
    }

    public void suchen(ActionEvent actionEvent) {
        List<Passwort> foundList=manager.suche(tfSuche.getText());
        taAusgabe.setText("Name: \t Benutzer: \t Passwort:");
        for(Passwort entry:foundList){
            taAusgabe.setText(taAusgabe.getText() + "\n" + entry.getName() + ", \t" + entry.getBenutzername() + ", \t" + entry.getPasswort());
        }
    }
    public void pwgenerieren(ActionEvent actionEvent) {
        password = "";
        String erlaubteZeichen="abcdefghijklmnopqrstuvwxyz";
        if(cbSonderzeichen.isSelected())
        {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz!$%&/()=?";
            SonderCounter +=1;
        }
        if(cbZahlen.isSelected())
        {
            erlaubteZeichen = "1234567890";
            ZahlenCounter += 1;
        }
        if(cbGroßundKlein.isSelected())
        {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
            GroßkleinCounter+=1;
        }
        if(cbAlles.isSelected())
        {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz!$%&/()=?ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
            AllesCounter+=1;
        }

        for(int i=0; i<Integer.valueOf(tflenght.getText());i++){
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
            savedpasswordcleartext = password;
        }
        GenerateCounter += 1;
        pfPassword.setText(password);
        taAusgabe.setText("Passwort: " + password);
    }


    public void copy(ActionEvent actionEvent) {
        String str = savedpasswordcleartext;
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Clipboard clipboard = toolkit.getSystemClipboard();
        StringSelection strSel = new StringSelection(str);
        clipboard.setContents(strSel, null);

    }

    public void passwortGenerieren(ActionEvent actionEvent) throws IOException {
        URL res = getClass().getResource("/passwdManager2.fxml");
        Parent root = FXMLLoader.load(res);
        Stage stage = new Stage();
        stage.setTitle("Passwort Generieren");
        stage.setScene(new Scene(root));
        stage.show();
    }
    @FXML
    public void statistik(ActionEvent actionEvent) throws IOException {
        URL res = getClass().getResource("/passwdManager3.fxml");
        Parent root = FXMLLoader.load(res);
        Stage stage = new Stage();
        stage.setTitle("Statistik");
        stage.setScene(new Scene(root));
        stage.show();
        pwmController2.counter();
    }



}
