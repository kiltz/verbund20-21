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


    private TextField tfZahl1;
    private TextField tfZahl2;
    private Label lErgebnis;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        tfZahl1 = new TextField();
        tfZahl2 = new TextField();

        Label lPlus = new Label(" + ");
        lErgebnis = new Label("Ergebnis: ");

        Button btBerechne = new Button(" = ");
        btBerechne.setOnAction(e -> rechne(e));

        box.getChildren().addAll(tfZahl1, lPlus, tfZahl2, btBerechne, lErgebnis);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();
    }

    private void rechne(ActionEvent e) {
        int zahl1 = Integer.parseInt(tfZahl1.getText());
        int zahl2 = Integer.parseInt(tfZahl2.getText());
        lErgebnis.setText("Ergebnis: " + (zahl1 + zahl2));
    }
}
