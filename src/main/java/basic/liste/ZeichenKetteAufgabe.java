package basic.liste;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class ZeichenKetteAufgabe extends Application {
    private TextField tfPasswortLaenge;
    private Label lPasswort;
    private String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 400, 400);

        Button bGenerieren = new Button("Passwort generieren");
        bGenerieren.setOnAction(e-> generieren());

        root.getChildren().addAll(getPasswortLaenge(), getCheckbox(), bGenerieren,getPasswort());
        primaryStage.setScene(scene);
        primaryStage.setTitle("gui.feature.passwort.PasswdApp");
        primaryStage.show();
    }

    private Node getPasswort() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));

        lPasswort = new Label("");
        box.getChildren().add(lPasswort);
        return box;
    }

    private void generieren() {
        String eingabe = tfPasswortLaenge.getText();
        int zahl = Integer.parseInt(eingabe);
        String test = "";
        for (int i = 0; i < 15; ++i) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            test += erlaubteZeichen.charAt(pos);
        }
    }

    private Node getCheckbox() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));

        CheckBox cGroß = new CheckBox("Großbuchstaben");
        CheckBox cSonder = new CheckBox("Sonderzeichen");
        CheckBox cZahl = new CheckBox("Zahlen");
        CheckBox cAlles = new CheckBox("Alles");
        box.getChildren().addAll(cGroß, cZahl, cSonder, cAlles);
        return box;
    }

    private Node getPasswortLaenge() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));

        Label lPasswort = new Label("Passwortlänge eingeben: ");
        tfPasswortLaenge = new TextField();

        box.getChildren().addAll(lPasswort, tfPasswortLaenge);
        return box;
    }
}
