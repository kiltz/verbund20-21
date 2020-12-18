package uebungen.uebung1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class TaschenRechnerGui extends Application {

    private TextField tfZahl1;
    private TextField tfZahl2;
    private Label lErgebnis;
    private int zahl1;
    private int zahl2;
    private Label fehlerAusgabe;

    @Override
    public void start(Stage primaryStage) throws Exception {


        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        lErgebnis = new Label("Ergebnis: ");
        lErgebnis.setTextFill(Color.BLUE);

        Label lPlus = new Label("+");

        fehlerAusgabe = new Label("");
        fehlerAusgabe.setTextFill(Color.RED);

        tfZahl1 = new TextField();
        tfZahl2 = new TextField();

        Button bGleich = new Button("=");
        bGleich.setOnAction(e -> rechne(e));

        box.getChildren().addAll(tfZahl1, lPlus, tfZahl2, bGleich, lErgebnis, fehlerAusgabe);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();

    }


    private void rechne(ActionEvent e) {
        try {
            zahl1 = Integer.parseInt(tfZahl1.getText());
            zahl2 = Integer.parseInt(tfZahl2.getText());
            lErgebnis.setText("Ergebnis: " + (zahl1 + zahl2));
            fehlerAusgabe.setText("");
        } catch (Exception fehler) {
            fehlerAusgabe.setText("Fehler: " + fehler);
            lErgebnis.setText("Ergebnis: ");
        }
    }
}
