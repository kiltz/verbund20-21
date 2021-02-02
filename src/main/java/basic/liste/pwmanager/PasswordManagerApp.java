package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PasswordManagerApp extends Application {
    private static TextField NameField;
    private static TextField UserField;
    private static TextField PasswdField;
    private static TextField SearchField;
    private static TextField ausgabe;

    public static void main(String[] args) { launch(null);
    }


    public void start(Stage primaryStage) throws Exception {

        Label Name = new Label("Name       ");
        NameField = new TextField();
        Label Benutzer = new Label("Benutzer  ");
        UserField = new TextField();
        Label Passwd = new Label("Passwd    ");
        PasswdField = new TextField();
        Button eintragen = new Button("eintragen");
        eintragen.setOnAction(e -> eintragen(e));
        SearchField = new TextField();
        Button Search = new Button("Suche");
        Search.setOnAction(e -> Search(e));
        ausgabe = new TextField();

        ausgabe.setPrefHeight(150);
        ausgabe.setPrefWidth(200);

        HBox HB1 = new HBox(Name, NameField);
        HBox HB2 = new HBox(Benutzer, UserField);
        HBox HB3 = new HBox(Passwd, PasswdField);
        HBox HB4 = new HBox(eintragen);
        HBox HB5 = new HBox(SearchField, Search);
        HBox HB6 = new HBox(ausgabe);

        VBox root = new VBox(HB1, HB2, HB3, HB4, HB5, HB6);
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 20, 10);
        root.setPadding(insets);


        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void Search(ActionEvent e) {
    }

    public static void eintragen(ActionEvent e) {
    }
}
