package uebungen.uebung1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

public class TaschenRechnerGui extends Application {

    private TextField tZahl1;
    private TextField tZahl2;
    private Label lErgebnis;

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage) {
        VBox box = new VBox();

        HBox hbox = new HBox();
        tZahl1 = new TextField();
        Label lPlus = new Label("+");
        tZahl2 = new TextField();
        hbox.getChildren().addAll(tZahl1, lPlus, tZahl2);

        Button bGleich = new Button("=");
        bGleich.setOnAction(e->rechne(e));

        lErgebnis = new Label();

        box.getChildren().addAll(hbox, bGleich, lErgebnis);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();

    }

    private void rechne(ActionEvent e) {
        String text1=tZahl1.getText();
        String text2=tZahl2.getText();
        int zahl1=Integer.parseInt(text1);
        int zahl2=Integer.parseInt(text2);
        int ergebnis=zahl1+zahl2;
        lErgebnis.setText("Ihr Ergebnis ist: " + ergebnis);
        lErgebnis.setTextFill(Paint.valueOf("#00ff00"));
    }
}
