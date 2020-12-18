package uebungen.uebung1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaschenRechnerGui extends Application {

    private TextField tfZahl1;
    private TextField tfZahl2;
    private Button bRechne;
    private Label ladditionszeichen;

    private Label lErgebnis;

    @Override
    public void start(Stage primaryStage) {
        VBox box = new VBox(10);

        lErgebnis = new Label("=");
        ladditionszeichen = new Label("+");
        bRechne = new Button("=");
        tfZahl1 = new TextField();
        tfZahl2 = new TextField();



        box.getChildren().addAll(lErgebnis, ladditionszeichen, bRechne, tfZahl1, tfZahl2);
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("TaschenRechner");
        primaryStage.show();

        public static void main (String[]args){

        }
    }
}
