package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class RechnerApp extends Application {

    private int zahl1;
    private int zahl2;
    private TextField tfEingabe;
    private TextField tfEingabe2;
    private Label lErgebnis;


    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        HBox root = new HBox(10);
        root.setPadding(new Insets(10));

        tfEingabe = new TextField("3");
        tfEingabe2 = new TextField("4");
        tfEingabe.setPrefWidth(50);
        tfEingabe2.setPrefWidth(50);

        Label plus = new Label("+");
        lErgebnis = new Label("7");

        Button gleich = new Button("=");
        gleich.setOnAction(e -> rechnen());


        root.getChildren().addAll(tfEingabe, plus, tfEingabe2, gleich, lErgebnis);

        Scene scene = new Scene(root, 400, 300);
        primaryStage.setTitle("Rechnerapp");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void rechnen() {
        zahl1 = Integer.parseInt(tfEingabe.getText());
        zahl2 = Integer.parseInt(tfEingabe2.getText());
        lErgebnis.setText("" + (zahl1 + zahl2));
    }
}
