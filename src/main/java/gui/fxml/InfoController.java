package gui.fxml;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

/**
 * @author tz
 */
public class InfoController {

    @FXML
    private Label lVersion;

    @FXML
    void initialize() {
        lVersion.setText("Version 0.2");
    }

}
