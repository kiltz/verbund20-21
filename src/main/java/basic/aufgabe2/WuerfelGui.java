
package basic.aufgabe2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WuerfelGui extends Application {

    private TextField tfWurfzahl;
    private Button bRechne;
    private Label lErgebnis;


    @Override
    public void start(Stage primaryStage) {


        VBox box = new VBox(10);
        tfWurfzahl = new TextField("Hier die Anzahl an Würfen eingeben");
        bRechne = new Button("=");
        lErgebnis = new Label();

        box.getChildren().addAll(tfWurfzahl, bRechne, lErgebnis);
        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Würfelstatistik");
        primaryStage.show();
        bRechne.setOnAction(e -> wuerfeln());

    }

    private void wuerfeln() {
        basic.aufgabe2.WuerfelStatistik wuerfel = new WuerfelStatistik();
        lErgebnis.setText(wuerfel.wuerfeln(Integer.parseInt(tfWurfzahl.getText())));
    }
}
