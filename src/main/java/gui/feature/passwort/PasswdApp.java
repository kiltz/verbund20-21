package gui.feature.passwort;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PasswdApp extends Application {

    private TextField tfLaenge;
    private CheckBox chckCapitals;
    private CheckBox chckNumbers;
    private CheckBox chckExclusive;
    private TextField tfAusgabe;
    private String validNormal = "abcdefghijklmnopqrstuvwxyz";
    private String validCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String validNumbers = "0123456789";
    private String validExclusives = "!@§$%&/()=?`{[]}#+-*";
    private String allowedString;

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox vBox = new VBox(10);
        vBox.setPadding(new Insets(20));

        HBox hLaenge = new HBox(10);
        Label lLaenge = new Label("Laenge: ");
        tfLaenge = new TextField();
        hLaenge.getChildren().addAll(lLaenge, tfLaenge);

        chckCapitals = new CheckBox("Großbuchstaben");
        chckNumbers = new CheckBox("Zahlen");
        chckExclusive = new CheckBox("Sonderzeichen");

        Button btnGenerate = new Button("Erstellen");
        btnGenerate.setOnAction(e -> generate(e));

        HBox hAusgabe = new HBox(10);
        Label lAusgabe = new Label("Passwort: ");
        tfAusgabe = new TextField();
        tfAusgabe.setEditable(false);
        hAusgabe.getChildren().addAll(lAusgabe, tfAusgabe);

        vBox.getChildren().addAll(hLaenge, chckCapitals, chckNumbers, chckExclusive, btnGenerate, hAusgabe);

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setTitle("PasswdApp");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void generate(ActionEvent e) {

        allowedString = validNormal;
        getValidLetters();

        String password = "";

        int length = Integer.parseInt(tfLaenge.getText());

        for (int i = 0; i < length; i++) {
            int pos = (int) (Math.random() * allowedString.length());
            password += allowedString.charAt(pos);
        }
        if (chckExclusive.isSelected() && chckCapitals.isSelected() && chckNumbers.isSelected()) {

            int capitals = (int) (Math.random() * validCapital.length());
            password.replace(password.charAt(0), validCapital.charAt(capitals));

            int numbers = (int) (Math.random() * validNumbers.length());
            password.replace(password.charAt(1), validNumbers.charAt(numbers));

            int exclusives = (int) (Math.random() * validExclusives.length());
            password.replace(password.charAt(2), validExclusives.charAt(exclusives));
        }
        tfAusgabe.setText(password);
    }


    private void getValidLetters() {
        if (chckCapitals.isSelected()) {
            allowedString += validCapital;
        }
        if (chckNumbers.isSelected()) {
            allowedString += validNumbers;
        }
        if (chckExclusive.isSelected()) {
            allowedString += validExclusives;
        }
    }
}
