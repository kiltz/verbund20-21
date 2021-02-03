package gui.aufgabe.mueloe;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/*
  Aufgabe:
  Kopiert diese Datei nach RechnerApp.
  Zwei Textfelder, zwei Label und einen Button anzeigt.
  <p>
  [.5.] + [.2.] (=) 7
 @startuml
 class Application {


 }
 class RechnerApp{

 }
 class HBox{

 }
 class Label{

 }
 class Text Field{

 }
 class Button{

 }

 RechnerApp *-- HBox
 HBox "1" *-- "2" Label
 HBox "1" *-- "2" TextField
 HBox "1" *-- "1" Button

  Application </-- RechnerApp

  @enduml

  Assoziation: zwei Klassen haben eine Beziehung
  Aggregation: Die Art der Beziehung ist ein Ganzes zu seinem Teil (hat ein...)
  Komposition: ist eine Verstärkung der Agregation



 */
public class RechnerApp extends Application {

    private Label lErgebnis;
    private TextField tfEins;
    private TextField tfZwei;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lEins = new Label("+");
        lErgebnis = new Label("7");
        tfEins = new TextField("5");
        tfEins.setMaxWidth(50);
        tfZwei = new TextField("2");
        tfZwei.setMaxWidth(50);
        Button bRechne = new Button(" = ");
        bRechne.setDefaultButton(true);
        bRechne.setOnAction(e -> rechne(e));

        HBox root = new HBox();
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 10, 50);
        root.setPadding(insets);
        root.getChildren().addAll(tfEins, lEins,tfZwei, bRechne, lErgebnis);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Rechner");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void rechne(ActionEvent e) {
        // Textfelder auslesen
        String eingabe1 = tfEins.getText();
        String eingabe2 = tfZwei.getText();
        // String in int umwandeln
        int zahl1 = Integer.parseInt(eingabe1);
        int zahl2 = Integer.parseInt(eingabe2);

        // rechnen
        int ergebnis = zahl1 + zahl2;
        // Ergebnis ausgeben
        lErgebnis.setText(""+ergebnis);
    }
}