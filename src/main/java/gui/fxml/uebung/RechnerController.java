package gui.fxml.uebung;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechnerController {

    public TextField tfEins;
    public TextField tfZwei;
    public Button bRechne;
    public Label lErgebnis;
    public Label lPlus;

    public void doRechne(ActionEvent actionEvent) {
        int ergebnis = Integer.parseInt(tfEins.getText()) + Integer.parseInt(tfZwei.getText());
        lErgebnis.setText(""+ ergebnis);
    }
}
