package gui.feature.passwort;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.layout.VBox;
import javafx.scene.control.Button;


public class PasswdApp extends Application {


    private TextField tflaenge;
    private CheckBox cbgroßbuchstabe;
    private CheckBox cbzahl;
    private CheckBox cbsonderzeichen;
    private CheckBox cballe;
    private Label lpasswort;


    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label llaenge = new Label("Laenge des Passworts: ");
        tflaenge = new TextField();
        Label lgroßbuchstabe = new Label("Großbuchstaben   ");
        cbgroßbuchstabe = new CheckBox();
        Label lzahl = new Label("Zahlen                   ");
        cbzahl = new CheckBox();
        Label lsonderzeichen = new Label("Sonderzeichen      ");
        cbsonderzeichen = new CheckBox();
        Label lalle = new Label("Alles kombiniert    ");
        cballe = new CheckBox();
        lpasswort = new Label();
        Button bgenerieren = new Button("Generieren");
        bgenerieren.setOnAction(g-> generate(g));



        VBox root = new VBox();

        HBox zeile1 = new HBox();
        zeile1.getChildren().add(llaenge);
        zeile1.getChildren().add(tflaenge);

        HBox zeile2 = new HBox();
        zeile2.getChildren().add(lgroßbuchstabe);
        zeile2.getChildren().add(cbgroßbuchstabe);

        HBox zeile3 = new HBox();
        zeile3.getChildren().add(lzahl);
        zeile3.getChildren().add(cbzahl);

        HBox zeile4 = new HBox();
        zeile4.getChildren().add(lsonderzeichen);
        zeile4.getChildren().add(cbsonderzeichen);

        HBox zeile5 = new HBox();
        zeile5.getChildren().add(lalle);
        zeile5.getChildren().add(cballe);

        HBox zeile6 = new HBox();
        zeile6.getChildren().add(bgenerieren);

        HBox zeile7 = new HBox();
        zeile7.getChildren().add(lpasswort);

        root.getChildren().addAll(zeile1, zeile2, zeile3, zeile4, zeile5, zeile6, zeile7);


        Insets insets = new Insets(50, 50, 10, 50);
        root.setPadding(insets);
        Scene scene = new Scene(root, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void generate(ActionEvent g) {


    }

}
