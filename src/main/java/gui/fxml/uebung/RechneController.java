package gui.fxml.uebung;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class RechneController {

    public TextField tfEins;
    public TextField tfZwei;
    public Label lErgebnis;

    public void doRechne(ActionEvent actionEvent) {
        System.out.println(tfEins.getText() + "/" + tfZwei.getText());
        lErgebnis.setText("Ganz viel");
    }
}
