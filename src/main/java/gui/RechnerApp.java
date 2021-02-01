package gui;
import javafx.application.Application;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class RechnerApp extends Application {
    private Label lErgebnis;
    private TextField tfEins;
    private TextField tfZwei;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lEins = new Label("+");
        lErgebnis = new Label("7");
        tfEins = new TextField("5");
        tfEins.setMaxWidth(50);
        tfZwei = new TextField("2");
        tfZwei.setMaxWidth(50);
        Button bRechne = new Button(" = ");
        bRechne.setDefaultButton(true);
        bRechne.setOnAction(e -> rechne(e));

        HBox root = new HBox();
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 10, 50);
        root.setPadding(insets);

        root.getChildren().addAll(tfEins, lEins,tfZwei, bRechne, lErgebnis);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("RechnerApp");
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    private void rechne(ActionEvent e) {
        String eing1 = tfEins.getText();
        String eing2 = tfZwei.getText();
        int zahl1 = Integer.parseInt(eing1);
        int zahl2 = Integer.parseInt(eing2);
        int ergebnis = zahl1 + zahl2;
        lErgebnis.setText(""+ergebnis);
    }
}
