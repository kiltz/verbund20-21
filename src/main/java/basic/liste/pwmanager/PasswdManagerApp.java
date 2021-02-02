package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.control.Button;

import java.util.List;


public class PasswdManagerApp extends Application {


    private TextField tfname;
    private TextField tfbenutzer;
    private TextField tfpasswort;
    private Label leintragen;
    private Manager manager;
    private TextField tfsuche;
    private TextArea taergebnis;
    private Label lsuche;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lname = new Label("Name:     ");
        Label lbenutzer = new Label("Benutzer: ");
        Label lpasswort = new Label("Passwort: ");
        tfname = new TextField();
        tfbenutzer = new TextField();
        tfpasswort = new TextField();
        Button beintragen = new Button("Eintragen");
        beintragen.setOnAction(e-> eintragen(e));
        leintragen = new Label();
        tfsuche = new TextField();
        Button bsuche = new Button("Suche");
        bsuche.setOnAction(s-> suchen(s));
        taergebnis = new TextArea();
        lsuche = new Label();

        manager = new Manager();
        Passwort p = new Passwort("Facebook", "schnubselbrumm", "ganzGeheim");
        manager.neu(p);
        manager.neu(new Passwort("amazon", "nobody", "keins"));
        manager.neu(new Passwort("github", "kiltz", "nix"));
        manager.neu(new Passwort("email", "f@kiltz.de", "keins"));



        VBox root = new VBox();

        HBox zeile1 = new HBox();
        zeile1.getChildren().add(lname);
        zeile1.getChildren().add(tfname);

        HBox zeile2 = new HBox();
        zeile2.getChildren().add(lbenutzer);
        zeile2.getChildren().add(tfbenutzer);

        HBox zeile3 = new HBox();
        zeile3.getChildren().add(lpasswort);
        zeile3.getChildren().add(tfpasswort);

        HBox zeile4 = new HBox();
        zeile4.getChildren().add(beintragen);
        zeile4.getChildren().add(leintragen);

        HBox zeile5 = new HBox();
        zeile5.getChildren().add(tfsuche);
        zeile5.getChildren().add(bsuche);

        HBox zeile6 = new HBox();
        zeile6.getChildren().add(taergebnis);

        HBox zeile7 = new HBox();
        zeile7.getChildren().add(lsuche);

        root.getChildren().add(zeile1);
        root.getChildren().add(zeile2);
        root.getChildren().add(zeile3);
        root.getChildren().add(zeile4);
        root.getChildren().add(zeile5);
        root.getChildren().add(zeile6);
        root.getChildren().add(zeile7);


        Insets insets = new Insets(50, 50, 10, 50);
        root.setPadding(insets);
        Scene scene = new Scene(root, 550, 450);
        primaryStage.setScene(scene);
        primaryStage.show();
    }



    public void eintragen(ActionEvent e) {

        if (tfname.getText().equals("") || tfname.getText().equals(" ")) {
            leintragen.setText("   Kein Name eingegeben!");
            leintragen.setTextFill(Color.web("#E23130"));
        } else if (tfbenutzer.getText().equals("") || tfbenutzer.getText().equals(" ")) {
            leintragen.setText("   Kein Benutzername eingegeben!");
            leintragen.setTextFill(Color.web("#E23130"));
        } else if (tfpasswort.getText().equals("") || tfpasswort.getText().equals(" ")) {
            leintragen.setText("   Kein Passwort eingegeben!");
            leintragen.setTextFill(Color.web("#E23130"));
        } else {
            leintragen.setText("   Eintrag erfolgreich!");
            leintragen.setTextFill(Color.web("#005091"));

            manager.neu(new Passwort(tfname.getText(),tfbenutzer.getText(), tfpasswort.getText()));
        }



    }

    public void suchen(ActionEvent s) {

        List<Passwort> ergebnise=manager.suche(tfsuche.getText());
        taergebnis.setText("");
        for(Passwort ergebnis:ergebnise) {
            taergebnis.setText(taergebnis.getText() + ergebnis.toString() + "\n");
        }

        if (tfsuche.getText().equals(" ") ) {
            lsuche.setText("Bitte etwas in die Suchleiste eingeben!");
            lsuche.setTextFill(Color.web("#E23130"));
        } else {
            lsuche.setText("Suche ist erfolgt!");
            lsuche.setTextFill(Color.web("#005091"));
        }
    }
}