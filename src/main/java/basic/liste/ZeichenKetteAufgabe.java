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
import javafx.scene.paint.Color;
import javafx.stage.Stage;


public class ZeichenKetteAufgabe extends Application {
    private TextField tfPasswortLaenge;
    private Label lPasswort;
    private String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
    private String grossbuchstaben = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String zahlen = "1234567890";
    private String sonderzeichen = "!?.;_-";
    private CheckBox cGroß;
    private CheckBox cZahl;
    private CheckBox cSonder;
    private CheckBox cAlles;




    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        Scene scene = new Scene(root, 400, 180);

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
        if(eingabe.equals(""))
        {
            lPasswort.setText("Geben Sie eine länge an!");
            lPasswort.setTextFill(Color.RED);
        }
        int zahl = Integer.parseInt(eingabe);
        if(zahl <= 0){
            lPasswort.setText("Ungültige Eingabe");
            lPasswort.setTextFill(Color.RED);
        } else {
            String test = "";
            if (cGroß.isSelected()) {
                erlaubteZeichen += grossbuchstaben;
            }
            if (cZahl.isSelected()) {
                erlaubteZeichen += zahlen;
            }
            if (cSonder.isSelected()) {
                erlaubteZeichen += sonderzeichen;
            }
            if (cAlles.isSelected()) {
                erlaubteZeichen += sonderzeichen += zahlen += grossbuchstaben;
            }
            for (int i = 0; i < zahl; ++i) {
                int pos = (int) (Math.random() * erlaubteZeichen.length());
                test += erlaubteZeichen.charAt(pos);
            }
            lPasswort.setText("Passwort: " + test);
            lPasswort.setTextFill(Color.BLUE);
        }
    }

    private Node getCheckbox() {
        HBox box = new HBox(10);
        box.setPadding(new Insets(10));

        cGroß = new CheckBox("Großbuchstaben");
        cSonder = new CheckBox("Sonderzeichen");
        cZahl = new CheckBox("Zahlen");
        cAlles = new CheckBox("Alles");
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
