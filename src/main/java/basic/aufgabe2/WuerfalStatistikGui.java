package basic.aufgabe2;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WuerfalStatistikGui extends Application {

    private TextField tfAnzahlRolls;
    private Label lResultate;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));

        Label lTitel = new Label("Wie oft willst du wuerfeln?");
        tfAnzahlRolls = new TextField();
        Button btnWuerfeln = new Button("Wuerfeln!");

        lResultate = new Label("");

        box.getChildren().addAll(lTitel, tfAnzahlRolls, btnWuerfeln, lResultate);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Wuerfeln");
        primaryStage.show();

    }



}
