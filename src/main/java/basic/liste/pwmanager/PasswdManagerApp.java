package basic.liste.pwmanager;

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
import javafx.stage.Stage;


public class PasswdManagerApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    Manager manager = new Manager();
    TextField tfName;
    TextField tfBenutzer;
    TextField tfPasswd;
    TextField tfSuche;

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

    private Node getAusgabeZeile() {
        HBox box = new HBox(15);
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(4);
        textArea.setPrefColumnCount(20);
        textArea.setWrapText(true);
        box.getChildren().add(textArea);
        return box;
    }

    private Node getSucheZeile() {
        HBox box = new HBox(15);
        tfSuche = new TextField();
        Button bSuche = new Button("Suche");
        bSuche.setAlignment(Pos.CENTER_RIGHT);
        bSuche.setDefaultButton(true);
        bSuche.setOnAction(e -> suche());
        box.getChildren().addAll(tfSuche,bSuche);
        return box;
    }

    private void suche(){
        manager.suche(tfSuche.getText());

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
        manager.neu();
    }

    private Node getPasswdZeile() {
        HBox box = new HBox(15);
        Label lPasswd = new Label("Passwd");
        lPasswd.setPrefSize(50,10);
        tfPasswd = new TextField();
        box.getChildren().addAll(lPasswd,tfPasswd);
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


    private Node getNameZeile() {
        HBox box = new HBox(15);
        Label lName = new Label("Name");
        lName.setPrefSize(50,10);
        tfName = new TextField();
        box.getChildren().addAll(lName,tfName);
        return box;
    }


}
