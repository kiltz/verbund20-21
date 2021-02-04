package gui.fxml.uebung;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechnerController {

    public TextField tfEins;
    public TextField tfZwei;
    public Label lErgebnis;

    public void doRechne(ActionEvent actionEvent){
        System.out.println(tfEins.getText()+"/"+tfZwei.getText());
        int zahl = Integer.parseInt(tfEins.getText());
        int zahl2 = Integer.parseInt(tfZwei.getText());
        lErgebnis.setText("" + (zahl+zahl2));

    }
}
