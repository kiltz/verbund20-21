package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.List;

public class PasswdManagerApp extends Application{

    private VBox box;
    private TextField txtname, txtbenutzer, txtpasswd, txtsuche;
    private TextArea txtAausgabe;
    private Manager manager = new Manager();


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hBox1 = new HBox(10);
        Label lname = new Label("Name: ");
        txtname = new TextField();
        hBox1.getChildren().addAll(lname, txtname);

        HBox hBox2 = new HBox(10);
        Label lbenutzer = new Label("Benutzer: ");
        txtbenutzer = new TextField();
        hBox2.getChildren().addAll(lbenutzer, txtbenutzer);

        HBox hBox3 = new HBox(10);
        Label lpasswd = new Label("Passwort: ");
        txtpasswd = new TextField();
        hBox3.getChildren().addAll(lpasswd, txtpasswd);

        HBox hBox4 = new HBox(10);
        Button btnEintragen = new Button("Eintragen");
        btnEintragen.setOnAction(e -> Eintragen(e));
        hBox4.getChildren().addAll(btnEintragen);

        HBox hBox5 = new HBox(10);
        txtsuche = new TextField();
        Button btnSuche = new Button("Suche");
        btnSuche.setOnAction(e -> Suchen(e));
        hBox5.getChildren().addAll(txtsuche,btnSuche);

        HBox hBox6 = new HBox(10);
        txtAausgabe = new TextArea();
        txtAausgabe.setPrefRowCount(4);
        txtAausgabe.setPrefColumnCount(20);
        txtAausgabe.setWrapText(true);
        hBox6.getChildren().addAll(txtAausgabe);

        box.getChildren().addAll(hBox1,hBox2,hBox3,hBox4,hBox5,hBox6);
        Scene scene = new Scene(box, 400, 350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login");
        primaryStage.show();


    }
    private void Eintragen(ActionEvent e) {
        manager.neu(new Passwort(txtname.getText(), txtbenutzer.getText(), txtpasswd.getText()));

    }
    private void Suchen(ActionEvent e) {
        List<Passwort> liste = manager.suche(""+txtsuche.getText());
        for (Passwort passwort : liste ) {
            txtAausgabe.setText(String.valueOf(passwort));
        }
    }

}
