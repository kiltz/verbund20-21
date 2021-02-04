package gui.fxml.uebung;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class RechneController {
    public TextField tfZahl1;
    public TextField tfZahl2;
    public Label lErgebnis;

    public void doSchreibe(ActionEvent actionEvent) {
        lErgebnis.setText("HalloWelt");

    }
}
