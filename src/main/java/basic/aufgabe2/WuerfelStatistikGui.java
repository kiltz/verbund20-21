package basic.aufgabe2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class WuerfelStatistikGui extends Application {

    private TextField tfAnzahl;
    private TextField tfReichweite;
    private Label ausgabe;
    VBox box;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        box = new VBox(10);
        box.setPadding(new Insets(20, 20, 10, 20));

        tfAnzahl = new TextField();
        tfReichweite = new TextField();
        ausgabe = new Label();
        Button bWuerfeln = new Button("Würfeln");
        bWuerfeln.setOnAction(e -> wuerfeln(e));

        box.getChildren().addAll(tfAnzahl, tfReichweite,bWuerfeln, ausgabe);

        Scene scene = new Scene(box, 400, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("WuerfelStatistik");
        primaryStage.show();

    }

    private void wuerfeln(ActionEvent e) {
        int zahl = 1;
        int reichweite = Integer.parseInt(tfReichweite.getText());
        int durchlaeufe = Integer.parseInt(tfAnzahl.getText());
        int[] anzahl = new int [reichweite];
        for (int i = 0; i < durchlaeufe; i++) {
            int min = 1;
            int zufall = (int)(Math.random() * reichweite) + min;
            anzahl[zufall-1] = anzahl[zufall-1]+1;
        }
        for (int j : anzahl) {
            ausgabe = new Label();
            ausgabe.setText("Die Zahl " + zahl + " wurde " + j + " mal gewuerfelt");
            ++zahl;
            box.getChildren().addAll(ausgabe);
        }

    }
}
