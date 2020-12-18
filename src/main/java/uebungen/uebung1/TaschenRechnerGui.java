package uebungen.uebung1;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.awt.*;

public class TaschenRechnerGui extends Application{
    private TextField tfZahl1;
    private TextField tfZahl2;
    private Label lPlus;
    private Label lErgebnis;
    private Button bEqual;

    public void start(Stage primaryStage) {
        VBox box = new VBox(10);
        box.setPadding(new Insets(30, 25, 50, 25));

        tfZahl1 = new TextField("");
        lPlus = new Label("+");
        tfZahl2 = new TextField("");
        lErgebnis = new Label("Ergebnis: ");
        bEqual = new Button("=");

        bEqual.setOnAction(e -> rechne(e));

        box.getChildren().addAll(tfZahl1, lPlus, tfZahl2, bEqual, lErgebnis);
        Scene scene = new Scene(box,  400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();
    }

    private void rechne(ActionEvent e) {

    }
}
