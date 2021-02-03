package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
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
        root.getChildren().add(getAnlegenZeile());
        root.getChildren().add(getEintragenZeile());
        root.getChildren().add(getSuchZeile());
        root.getChildren().add(getSuchErgebnisZeile());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Passwort-Manager");
        primaryStage.show();
    }

    private Node getAnlegenZeile() {
        GridPane gpAnlegen = new GridPane();
        gpAnlegen.setVgap(5);
        gpAnlegen.setHgap(8);
        gpAnlegen.setPadding(new Insets(10));

        gpAnlegen.add(getNameZeile(),1,0);
        gpAnlegen.add(getBenutzerNameZeile(), 1,1);
        gpAnlegen.add(getPasswdZeile(), 1,2);
        gpAnlegen.add(new Separator(), 0,3,3,1);
        return gpAnlegen;
    }

    private Node getSuchErgebnisZeile() {
        //TODO Ergebnis in einzelne Labels aufspalten und dem Akkordion übergeben
        //Dazu suche() anpassen (return value)
        Accordion aErgebnis = new Accordion();
        for (int i = 1; i <= 5; ++i) {
            HBox box = new HBox();
            box.getChildren().add(new Label("Label der Box " + i));
            TitledPane pane = new TitledPane("Box " + i, box);
            aErgebnis.getPanes().add(pane);
        }
        return aErgebnis;
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
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER);
        Button bEintragen = new Button("Eintragen");
        bEintragen.setOnAction(e -> eintragen());
        lStatus = new Label();
        box.getChildren().addAll(lStatus, bEintragen);
        return box;
    }

    private void eintragen() {
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
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        tfPasswort = new TextField();
        tfPasswort.setPrefWidth(150);
        Label lPasswort = new Label("Passwort");
        lPasswort.setPrefWidth(50);

        box.getChildren().addAll(lPasswort, tfPasswort);
        return box;
    }

    private Node getBenutzerNameZeile() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        tfBenutzerName = new TextField();
        tfBenutzerName.setPrefWidth(150);
        Label lBenutzer = new Label("Benutzer");
        lBenutzer.setPrefWidth(50);

        box.getChildren().addAll(lBenutzer, tfBenutzerName);
        return box;
    }

    private Node getNameZeile() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));
        tfName = new TextField();
        tfName.setPrefWidth(150);
        Label lName = new Label("Name");
        lName.setPrefWidth(50);

        box.getChildren().addAll(lName, tfName);
        return box;
    }
}