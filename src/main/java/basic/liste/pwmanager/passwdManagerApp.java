package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.xml.soap.Text;
import java.util.List;


public class passwdManagerApp extends Application {

    private TextField tfName;
    private TextField tfUser;
    private PasswordField pfPassword;
    private TextField tfSearch;
    private TextArea taOutput;
    private Manager manager;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20, 20, 20, 20));

        HBox hName = new HBox(10);
        Label lName = new Label("Name: ");
        tfName = new TextField();
        hName.getChildren().addAll(lName, tfName);

        HBox hUser = new HBox(10);
        Label lUser = new Label("Benutzer: ");
        tfUser = new TextField();
        hUser.getChildren().addAll(lUser, tfUser);

        HBox hPassword = new HBox(10);
        Label lPassword = new Label("Passwort: ");
        pfPassword = new PasswordField();
        hPassword.getChildren().addAll(lPassword, pfPassword);

        Button btnInput = new Button("Eintragen");
        btnInput.setOnAction(e -> input(e));

        HBox hSearch = new HBox(10);
        tfSearch = new TextField();
        Button btnSearch = new Button("Suchen");
        btnSearch.setOnAction(f -> suchen(f));
        hSearch.getChildren().addAll(tfSearch, btnSearch);

        taOutput = new TextArea();
        taOutput.setEditable(false);
        taOutput.setPrefWidth(500);

        vBox.getChildren().addAll(hName, hUser, hPassword, btnInput, hSearch, taOutput);

        manager = new Manager();

        Scene scene = new Scene(vBox, 500, 400);
        primaryStage.setTitle("Passwort Manager App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void suchen(ActionEvent f) {
        taOutput.setText("");
        List<Passwort> passwords = manager.suche(tfSearch.getText());
        for (Passwort password : passwords) {
            taOutput.setText(taOutput.getText() + password +"\n");
        }
    }

    private void input(ActionEvent e) {
        manager.neu(new Passwort(tfName.getText(), tfUser.getText(), pfPassword.getText()));
        tfName.setText("");
        tfUser.setText("");
        pfPassword.setText("");
    }
}

