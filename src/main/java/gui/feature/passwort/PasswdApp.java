package gui.feature.passwort;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PasswdApp extends Application {

    private TextField tfLaenge;
    Label lAusgabe=new Label("Ihr neues Passwort: ");

    private String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root=new VBox();

        HBox boxLaenge=new HBox();
        Label lLaenge=new Label("Geben Sie Ihre gewünschte Länge an: ");
        tfLaenge=new TextField();
        boxLaenge.getChildren().add(lLaenge);
        boxLaenge.getChildren().add(tfLaenge);


        Button bErzeugen=new Button("Erzeuge Passwort");
        bErzeugen.setOnAction(e->erzeugen(e));



        root.getChildren().add(boxLaenge);
        root.getChildren().add(bErzeugen);
        root.getChildren().add(lAusgabe);

        Scene scene=new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PasswdApp");
        primaryStage.show();
    }

    public void erzeugen(ActionEvent e){
        String password = "";
        int laenge=Integer.parseInt(tfLaenge.getText());
        for (int i = 0; i < laenge; i++) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
        }
        lAusgabe.setText("Ihr neues Passwort: " + password);

    }
}
