package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();

        Label lInfo = new Label("Ein kleiner Text");
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Ein Status");
        box.getChildren().add(lStatus);
        Label lMeinTextfeld = new Label("neues Textfeld mit random Wörtern");
        box.getChildren().add(lMeinTextfeld);
        Label lDiesIstKeineUebung =new Label("Achtung Achtung, Durchsage: Dies ist keine Übung!");
        box.getChildren().add(lDiesIstKeineUebung);
        TextField tAntwort = new TextField("Hier eine Antwort eingeben");
        box.getChildren().add(tAntwort);
        Label lHilferuf =new Label("Hilfe mein Nachbar hat mein Klingelschild geklaut!");
        box.getChildren().add(lHilferuf);
        TextField tNeuesTextfeld = new TextField("Hier ist ein kleines Textfeld");
        box.getChildren().add(tNeuesTextfeld);
        Button kKnopf = new Button("kleiner süßer Button");
        box.getChildren().add(kKnopf);

        Scene scene = new Scene(box, 500,350);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein etwas größeres sinnloses Fensterchen");
        primaryStage.show();
    }
}
