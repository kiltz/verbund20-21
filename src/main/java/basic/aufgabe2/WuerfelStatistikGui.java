package basic.aufgabe2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WuerfelStatistikGui extends Application {

    private int zaehler[] = new int[6];
    private Label lAusgabe;
    private int zahl = 1;

    @Override
    public void start(Stage primaryStage){

        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        lAusgabe = new Label("");
        Button bWuerfeln = new Button("Wuerfeln");
        bWuerfeln.setOnAction(e -> wuerfeln(e));


        box.getChildren().addAll(bWuerfeln, lAusgabe);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wuerfelstatistik");
        primaryStage.show();

    }

    private void wuerfeln(ActionEvent e) {
        for(int i = 0; i < 1000; i++){
            int zufall = (int)(Math.random() * 6 + 1);
            zaehler[zufall -1]++;
        }
        String s = "";
        for (int j : zaehler) {
            s += zahl + ": " + j + "\n";
            zahl++;
        }
        lAusgabe.setText(s);

    }
}
