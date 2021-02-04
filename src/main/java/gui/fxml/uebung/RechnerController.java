package gui.fxml.uebung;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechnerController {

    public TextField tf1;
    public TextField tf2;
    public Label lErgebnis;

    public void rechne(ActionEvent actionEvent) {
        lErgebnis.setText("" + (Integer.parseInt(tf1.getText())+Integer.parseInt(tf2.getText())));
    }
}
