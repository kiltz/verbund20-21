package de.verbund.pwmanager.service;

import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.List;

public class PasswdManagerApp extends Application {
    private static final String BLAU = "#005091";
    private static final String  ROT = "#E23130";

    private Manager manager;
    private TextField tfName;
    private TextField tfBenutzerName;
    private TextField tfPasswort;
    private Label lStatus;
    private TextField tfSuche;
    private TextArea taErgebnis;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        manager = new Manager();
        VBox root = new VBox(10);
        root.getChildren().add(getNameZeile());
        root.getChildren().add(getBenutzerNameZeile());
        root.getChildren().add(getPasswdZeile());
        root.getChildren().add(getEintragenZeile());
        root.getChildren().add(getSuchZeile());
        root.getChildren().add(getSuchErgebnisZeile());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Passwort-Manager");
        primaryStage.show();
    }

    private Node getSuchErgebnisZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER_RIGHT);
        taErgebnis = new TextArea();
        box.getChildren().add(taErgebnis);
        return box;
    }

    private Node getSuchZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER);
        tfSuche = new TextField();
        Button bSuche = new Button("Suche");
        bSuche.setOnAction(e -> suche());
        bSuche.setDefaultButton(true);
        box.getChildren().addAll(tfSuche, bSuche);
        return box;
    }

    private void suche() {
        List<Passwort> erg = manager.suche(tfSuche.getText());
        StringBuffer txt = new StringBuffer("Name\tBenutzer\tPasswort\n");
        for (Passwort p : erg) {
            txt.append(p.getName()+"\t"+p.getBenutzername()+"\t"+p.getPasswort()+"\n");
        }
        taErgebnis.setText(txt.toString());
    }

    private Node getEintragenZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER_RIGHT);
        Button bEintragen = new Button("Eintragen");
        bEintragen.setOnAction(e -> eintragen());
        lStatus = new Label();
        box.getChildren().addAll(lStatus, bEintragen);
        return box;
    }

    private void eintragen() {
        // TODO Validate
        if (tfName.getText().isEmpty()) {
            lStatus.setTextFill(Color.web(ROT));
            lStatus.setText("Wen soll ich eintragen?");
        } else {
            try {
                manager.neu(new Passwort(tfName.getText(), tfBenutzerName.getText(), tfPasswort.getText()));
                lStatus.setTextFill(Color.web(BLAU));
                lStatus.setText(tfName.getText()+" wurde eingetragen.");
                tfName.setText("");
                tfBenutzerName.setText("");
                tfPasswort.setText("");
            } catch (Exception e) {
                lStatus.setTextFill(Color.web(ROT));
                lStatus.setText("Fehler: "+e.getMessage());
            }
        }
    }

    private Node getPasswdZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfPasswort = new TextField();

        box.getChildren().addAll(new Label("Passwort"), tfPasswort);
        return box;
    }

    private Node getBenutzerNameZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfBenutzerName = new TextField();

        box.getChildren().addAll(new Label("Benutzer"), tfBenutzerName);
        return box;
    }

    private Node getNameZeile() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tfName = new TextField();

        box.getChildren().addAll(new Label("Name"), tfName);
        return box;
    }
}