package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.List;


public class PasswdManagerApp extends Application {
    private final Manager manager = new Manager();
    private TextField tfName;
    private TextField tfBenutzer;
    private TextField tfPasswd;
    private TextField tfSuche;
    private TextArea taAusgabe;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10,20,20,10));
        root.getChildren().add(getNameZeile());
        root.getChildren().add(getBenutzerZeile());
        root.getChildren().add(getPasswdZeile());
        root.getChildren().add(getEintragenZeile());
        root.getChildren().add(getSucheZeile());
        root.getChildren().add(getAusgabeZeile());
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getNameZeile() {
        HBox box = new HBox(15);
        Label lName = new Label("Name");
        lName.setPrefSize(50,10);
        tfName = new TextField();
        box.getChildren().addAll(lName,tfName);
        return box;
    }

    private Node getBenutzerZeile() {
        HBox box = new HBox(15);
        Label lBenutzer = new Label("Benutzer");
        lBenutzer.setPrefSize(50,10);
        tfBenutzer = new TextField();
        box.getChildren().addAll(lBenutzer,tfBenutzer);
        return box;
    }

    private Node getPasswdZeile() {
        HBox box = new HBox(15);
        Label lPasswd = new Label("Passwd");
        lPasswd.setPrefSize(50,10);
        tfPasswd = new TextField();
        box.getChildren().addAll(lPasswd,tfPasswd);
        return box;
    }

    private Node getEintragenZeile() {
        HBox box = new HBox(15);
        Button bEintragen = new Button("Eintragen");
        bEintragen.setAlignment(Pos.CENTER);
        bEintragen.setDefaultButton(true);
        bEintragen.setOnAction(e -> eintragen());
        box.getChildren().add(bEintragen);
        return box;
    }

    private void eintragen() {
        String name=tfName.getText();
        String benutzer=tfBenutzer.getText();
        String password=tfPasswd.getText();
        manager.neu(new Passwort(name,benutzer,password));
        taAusgabe.setText("Eintragung durchgeführt!");
        tfName.setText("");
        tfBenutzer.setText("");
        tfPasswd.setText("");
        taAusgabe.setText("");
    }

    private Node getAusgabeZeile() {
        HBox box = new HBox(15);
        taAusgabe = new TextArea();
        taAusgabe.setPrefRowCount(4);
        taAusgabe.setPrefColumnCount(20);
        taAusgabe.setWrapText(true);
        ScrollPane scrolli = new ScrollPane();
        scrolli.setMaxWidth(250);
        scrolli.setContent(taAusgabe);
        box.getChildren().add(scrolli);
        return box;
    }

    private Node getSucheZeile() {
        HBox box = new HBox(15);
        tfSuche = new TextField();
        Button bSuche = new Button("Suche");
        bSuche.setAlignment(Pos.CENTER_RIGHT);
        bSuche.setOnAction(e -> suchen());
        box.getChildren().addAll(tfSuche,bSuche);
        return box;
    }

    private void suchen() {
        taAusgabe.setText("");
        List<Passwort> ergebnise=manager.suche(tfSuche.getText());
        for(Passwort ergebnis:ergebnise){
            taAusgabe.setText(taAusgabe.getText() + ergebnis.toString() + "\n");
        }
        tfSuche.setText("");
    }
}
