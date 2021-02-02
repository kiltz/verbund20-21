package gui.feature.passwort.PasswdApp;

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

public class Zeichenkette extends Application {

    private Label lausgabe;
    private TextField txtEingabe;
    private CheckBox cbGroßbuchstaben, cbZahlen, cbSonderzeichen, cbAlles;
    public static void main(String[] args) { launch(args);}

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box;
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        HBox hbox1 = new HBox();
        txtEingabe = new TextField();
        hbox1.getChildren().addAll(txtEingabe);

        HBox hbox2 = new HBox();
        cbGroßbuchstaben = new CheckBox("Großbuchstaben");
        hbox2.getChildren().addAll(cbGroßbuchstaben);

        HBox hbox3 = new HBox();
        cbZahlen = new CheckBox("Zahlen");
        hbox3.getChildren().addAll(cbZahlen);

        HBox hbox4 = new HBox();
        cbSonderzeichen = new CheckBox("Sonderzeichen");
        hbox4.getChildren().addAll(cbSonderzeichen);

        HBox hbox5 = new HBox();
        cbAlles = new CheckBox("Alles");
        hbox5.getChildren().addAll(cbAlles);

        HBox hbox6 = new HBox();
        Button btngenerate = new Button("Generieren");
        lausgabe = new Label("");
        btngenerate.setOnAction(e -> generate(e));
        hbox6.getChildren().addAll(btngenerate,lausgabe);


        box.getChildren().addAll(hbox1, hbox2, hbox3, hbox4, hbox5, hbox6);
        Scene scene = new Scene(box, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Passwortgenerator");
        primaryStage.show();

    }
    private void generate(ActionEvent e) {
        int passwortlaenge = Integer.valueOf(txtEingabe.getText());
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
        if(cbGroßbuchstaben.isSelected()) {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        }
        if(cbSonderzeichen.isSelected()) {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz!§$%&/()=?";
        }
        if(cbZahlen.isSelected()) {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz123456789";
        }
        if(cbAlles.isSelected()) {
            erlaubteZeichen = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ!§$%&/()=?123456789";
        }
        String neu2 = "";
        for(int i = 0; i < passwortlaenge; i++) {
            int rnd = (int) (Math.random() * erlaubteZeichen.length());
            neu2 += erlaubteZeichen.charAt(rnd);
        }
        lausgabe.setText(" "+neu2);
    }
}
