package gui.fxml.uebung;

import java.awt.TextField;
import javafx.fxml.FXML;
import java.awt.Label;
import java.awt.event.ActionEvent;


public class RechnerController {

    public TextField tfEins;
    public TextField tfZwei;
    public Label lErgebnis;


    public void doRechne(javafx.event.ActionEvent actionEvent) {
        System.out.println(tfEins.getText()+"/"+tfZwei.getText());
        lErgebnis.setText("Ganz viel");
    }
}
