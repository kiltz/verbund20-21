package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswdManagerApp extends Application {
    Manager manager = new Manager();
    private TextField tfName;
    private TextField tfBenutzer;
    private TextField tfPasswort;
    private TextField tfSuche;
    private TextArea taBenutzer;

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox root = new VBox(10);
        root.getChildren().addAll(getName(), getBenutzer(), getPasswort(), getEintrag(), getSuche(), getWerte());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PasswortManagerApp");
        primaryStage.show();


    }

    private Node getWerte() {
        HBox box = new HBox(20);
        box.setPadding(new Insets(10));
        taBenutzer = new TextArea();
        box.getChildren().add(taBenutzer);
        return box;
    }

    private Node getSuche() {
        HBox box = new HBox(20);
        box.setPadding(new Insets(10));
        tfSuche = new TextField();
        Button bSuche = new Button("Suche");
        bSuche.setOnAction(e->suche());
        box.getChildren().addAll(tfSuche,bSuche);
        return box;
    }

    private void suche() {
        taBenutzer.setText("" + manager.suche(tfSuche.getText()));
    }

    private Node getEintrag() {
        HBox box = new HBox(20);
        box.setPadding(new Insets(10));

        Button bEintrag = new Button("Eintragen");
        bEintrag.setOnAction(e->eintragen());
        box.getChildren().add(bEintrag);
        return box;
    }

    private void eintragen() {
        manager.neu(new Passwort(tfName.getText(),tfBenutzer.getText(), tfPasswort.getText()));
    }

    private Node getPasswort() {
        HBox box = new HBox(20);
        box.setPadding(new Insets(10));

        Label lPasswort = new Label("Passwort");
        tfPasswort = new TextField();

        box.getChildren().addAll(lPasswort,tfPasswort);
        return box;
    }

    private Node getBenutzer() {
        HBox box = new HBox(20);
        box.setPadding(new Insets(10));

        Label lBenutzer = new Label("Benutzer");
        tfBenutzer = new TextField();

        box.getChildren().addAll(lBenutzer, tfBenutzer);
        return box;
    }

    private Node getName() {
        HBox box = new HBox(35);
        box.setPadding(new Insets(10));

        Label lName = new Label("Name");
        tfName = new TextField();

        box.getChildren().addAll(lName, tfName);
        return box;
    }
}
