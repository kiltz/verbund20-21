package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * Aufgabe:
 * Zeigt zwei Eingabefelder für Benutzername und Passwort
 * Beschribt die Eingabefelder mit einem Label
 *
 * Erzeugt einen Button (Login)
 *
 * Macht den Dialog hübsch
 *
 * Validiert den Dialog
 * 1. Benutzername darf nicht leer sein
 * 2. Passwort darf nicht leer sein
 * 3. Benutzernamen und Passwort müssen irgendwelchen festen Werten entsprechen
 *
 * Hinweis: Schachtelt VBox und HBox
 *
 */
public class PasswdManagerApp extends Application {

    private TextField tf1;
    private PasswordField pf2;
    private TextField tf2;
    private TextField tf3;
    private TextField tf4;
    private TextArea ta1;
    private List<String> daten;

    public void neu(String p) {
        // Validierung
        daten.add(p);
    }

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("Name");
        Label l2 = new Label("Benutzer");
        Label l3 = new Label("Passwd");
        tf1 = new TextField();
        tf2 = new TextField();
        tf3 = new TextField();
        tf4 = new TextField();
        ta1 = new TextArea();
        ta1.setPrefRowCount(4);
        ta1.setPrefColumnCount(20);
        ta1.setWrapText(true);
        daten = new ArrayList<String>();

        Button b1 = new Button("Eintragen");
        b1.setOnAction(e -> eintragen(e));
        Button b2 = new Button("Suche");
        b1.setOnAction(e -> suche(e));
        VBox vb1 = new VBox();
        vb1.setSpacing(10.0);
        HBox hb1 = new HBox();
        hb1.setSpacing(10.0);
        HBox hb2 = new HBox();
        hb2.setSpacing(40.0);
        HBox hb3 = new HBox();
        hb3.setSpacing(10.0);
        HBox hb4 = new HBox();
        hb4.setSpacing(10.0);
        HBox hb5 = new HBox();
        hb5.setSpacing(10.0);
        HBox hb6 = new HBox();
        hb6.setSpacing(10.0);
        hb1.getChildren().addAll(l1, tf1);
        hb2.getChildren().addAll(l2, tf2);
        hb3.getChildren().addAll(l3, tf3);
        hb4.getChildren().addAll(b1);
        hb5.getChildren().addAll(tf4 ,b2);
        hb6.getChildren().addAll(ta1);
        vb1.getChildren().addAll(hb1, hb2, hb3, hb4, hb5, hb6);
        Scene scene = new Scene(vb1, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void suche(ActionEvent e) {
        String Suche = tf4.getText();
        //List <String> daten = manager.suche(Suche);
    }

    private void eintragen(ActionEvent e) {
        String eingabe1 = tf1.getText();
        String eingabe2 = tf2.getText();
        String eingabe3 = tf3.getText();
        String gesammtEintrag = "Passwort{" +
                "name='" + eingabe1 + '\'' +
                ", benutzername='" + eingabe2 + '\'' +
                ", passwort='" + eingabe3 + '\'' +
                '}';
        daten.add(gesammtEintrag);

    }



}

