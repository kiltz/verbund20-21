package uebungen.uebung1;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaschenRechnerGui extends Application {

    private TextField tf1;
    private TextField tf2;
    private Label lErgebnis;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        tf1 = new TextField();
        tf2 = new TextField();
        lErgebnis = new Label();
        Label lPlus = new Label("+");

        VBox box = new VBox(10);
        box.setPadding(new Insets(20, 20, 20, 20));

        Button bRechne = new Button("=");
        bRechne.setOnAction(e -> rechne(e));

        box.getChildren().addAll(tf1, lPlus, tf2, bRechne, lErgebnis);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();

    }

    private void rechne(ActionEvent e) {
        try {
            int zahl1 = Integer.parseInt(tf1.getText());
            int zahl2 = Integer.parseInt(tf2.getText());
            int ergebnis = zahl1 + zahl2;
            lErgebnis.setText("Ergebnis: " + ergebnis);
        } catch (NumberFormatException e1) {
            lErgebnis.setText("Die Eingabe war keine Zahl! (" + e1.getMessage() + ")");
        }
    }
}
