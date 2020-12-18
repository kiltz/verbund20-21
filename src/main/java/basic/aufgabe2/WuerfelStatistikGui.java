package basic.aufgabe2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WuerfelStatistikGui extends Application {

    private Button bWuerfel;
    private Label lErgebnis;

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
        bWuerfel= new Button("Würfeln");
        bWuerfel.setOnAction(e -> Wuerfeln());
        lErgebnis= new Label("Einser: ");

        box.getChildren().addAll(bWuerfel, lErgebnis);
        Scene scene = new Scene(box,  400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wuerfelstatistik");
        primaryStage.show();

    }

    private void Wuerfeln() {

    }
}
