package gui.fxml;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

/**
 * @author tz
 */
public class LoginController {

    @FXML
    public TextField tfEmail;
    @FXML
    public PasswordField tfPasswort;
    @FXML
    public Label lStatus;

    @FXML
    void initialize() {
        System.out.println("Lebe...");

    }

    public void doLogin() {
        System.out.println("Login..."+tfEmail.getText()+"/"+tfPasswort.getText());
        lStatus.setText("Wilkommen...");
    }

    public void doBeenden(){
        System.exit(0);
    }

    public void doInfo() throws IOException {
        Stage stage = new Stage();
        URL res = getClass().getResource("/gui/fxml/info.fxml");
        Parent root = FXMLLoader.load(res);
        stage.setTitle("Info");
        stage.setScene(new Scene(root, 200, 100));
        stage.show();

    }
}