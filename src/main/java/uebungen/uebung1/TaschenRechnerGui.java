package uebungen.uebung1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaschenRechnerGui extends Application {

    private TextField tfZahl1;
    private TextField tfZahl2;
    private Label lErgebnis;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        HBox box2 = new HBox(10);
        tfZahl1= new TextField();
        tfZahl2= new TextField();
        Label lPlus = new Label("+");

        lErgebnis= new Label(""+rechne());
        Button bRechne= new Button("=");
        bRechne.setOnAction(e -> rechne());
        Scene scene = new Scene(box,  400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();
    }

    private void rechne() {
        System.out.println("Funktioniert");
        int zahl1 = Integer.parseInt(tfZahl1.getText());
        int zahl2 = Integer.parseInt(tfZahl2.getText());
        int Ergebnis = zahl1 + zahl2;
        String text = ""+Ergebnis;
        lErgebnis.setText(text);

    }

    public static void main(String[] args) {

    }
}
