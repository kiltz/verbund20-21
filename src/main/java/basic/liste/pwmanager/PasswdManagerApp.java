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


public class PasswdManagerApp extends Application {

    private TextField tfName;
    private TextField tfBenutzer;
    private PasswordField pfPasswort;
    private TextField tfSuchen;
    private TextArea taAusgabe;
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

        HBox hBenutzer = new HBox(10);
        Label lBenutzer = new Label("Benutzer: ");
        tfBenutzer = new TextField();
        hBenutzer.getChildren().addAll(lBenutzer, tfBenutzer);

        HBox hPasswort = new HBox(10);
        Label lPasswort = new Label("Passwort: ");
        pfPasswort = new PasswordField();
        hPasswort.getChildren().addAll(lPasswort, pfPasswort);

        Button btnEintragen = new Button("Eintragen");
        btnEintragen.setOnAction(e -> eintragen(e));

        HBox hSuchen = new HBox(10);
        tfSuchen = new TextField();
        Button btnSuchen = new Button("Suchen");
        btnSuchen.setOnAction(f -> suchen(f));
        hSuchen.getChildren().addAll(tfSuchen, btnSuchen);

        taAusgabe = new TextArea();
        taAusgabe.setEditable(false);
        taAusgabe.setPrefWidth(500);

        vBox.getChildren().addAll(hName, hBenutzer, hPasswort, btnEintragen, hSuchen, taAusgabe);

        manager = new Manager();

        Scene scene = new Scene(vBox, 500, 400);
        primaryStage.setTitle("Passwort Manager App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void suchen(ActionEvent f) {
        taAusgabe.setText("");
        List<Passwort> passwords = manager.suche(tfSuchen.getText());
        for (Passwort password : passwords) {
            taAusgabe.setText(taAusgabe.getText() + password +"\n");
        }
    }

    private void eintragen(ActionEvent e) {
        manager.neu(new Passwort(tfName.getText(), tfBenutzer.getText(), pfPasswort.getText()));
        tfName.setText("");
        tfBenutzer.setText("");
        pfPasswort.setText("");
    }
}
