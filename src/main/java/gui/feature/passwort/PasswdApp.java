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

import java.lang.reflect.Array;


public class PasswdApp extends Application {

    private TextField tfLaenge;
    private CheckBox chckCapitals;
    private CheckBox chckNumbers;
    private CheckBox chckExclusive;
    private TextField tfAusgabe;
    private String validNormal;
    private String validCapital;
    private String validNumbers;
    private String validExclusives;

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
        hAusgabe.getChildren().addAll(lAusgabe, tfAusgabe);

        vBox.getChildren().addAll(hLaenge, chckCapitals, chckNumbers, chckExclusive, btnGenerate, hAusgabe);

        Scene scene = new Scene(vBox, 400, 300);
        primaryStage.setTitle("PasswdApp");
        primaryStage.setScene(scene);
        primaryStage.show();

        validNormal = "abcdefghijklmnopqrstuvwxyz";
        validCapital = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        validNumbers = "0123456789";
        validExclusives = "!§$%&/()=?";
    }

    private void generate(ActionEvent e) {

        String allSelected = "" + validNormal + validCapital + validNumbers + validExclusives;
        String capitalsNumbers = "" + validNormal + validCapital + validNumbers;
        String capitalsExclusive = "" + validNormal + validCapital + validExclusives;
        String numbersExclusive = "" + validNormal + validNumbers + validExclusives;
        String capitals = "" + validNormal + validCapital;
        String numbers = "" + validNormal + validNumbers;
        String excluxive = "" + validNormal + validExclusives;

        int length = Integer.parseInt(tfLaenge.getText());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < length; i++) {

            if (chckCapitals.isSelected() && chckNumbers.isSelected() && chckExclusive.isSelected()) {
                int j = (int) (Math.random() * (allSelected.length() - 1));
                sb.append(allSelected.charAt(j));

            } else if (chckCapitals.isSelected() && chckNumbers.isSelected()) {
                int j = (int) (Math.random() * (capitalsNumbers.length() - 1));
                sb.append(capitalsNumbers.charAt(j));

            } else if (chckCapitals.isSelected() && chckExclusive.isSelected()) {
                int j = (int) (Math.random() * (capitalsExclusive.length() - 1));
                sb.append(capitalsExclusive.charAt(j));

            } else if (chckNumbers.isSelected() && chckExclusive.isSelected()) {
                int j = (int) (Math.random() * (numbersExclusive.length() - 1));
                sb.append(numbersExclusive.charAt(j));

            } else if (chckCapitals.isSelected()) {
                int j = (int) (Math.random() * (capitals.length() - 1));
                sb.append(capitals.charAt(j));

            } else if (chckNumbers.isSelected()) {
                int j = (int) (Math.random() * (numbers.length() - 1));
                sb.append(numbers.charAt(j));

            } else if (chckExclusive.isSelected()) {
                int j = (int) (Math.random() * (excluxive.length() - 1));
                sb.append(excluxive.charAt(j));

            } else {
                int j = (int) (Math.random() * (validNormal.length() - 1));
                sb.append(validNormal.charAt(j));
            }
        }
        tfAusgabe.setText(sb.toString());
    }
}
