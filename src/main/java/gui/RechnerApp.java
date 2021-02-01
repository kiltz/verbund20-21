package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Aufgabe:
 * Kopiert diese Datei nach RechnerApp.
 * Zwei Textfelder, zwei Label und einen Button anzeigt.
 * <p>
 * [.5.] + [.2.] (=) 7
 */
public class RechnerApp extends Application {

    private Label label2;
    private TextField textfiel1;
    private TextField textfield2;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label lEins = new Label("+");
        label2 = new Label("7");
        textfiel1 = new TextField("5");
        textfiel1.setMaxWidth(50);
        textfield2 = new TextField("2");
        textfield2.setMaxWidth(50);
        Button bRechne = new Button(" = ");
        bRechne.setDefaultButton(true);
        bRechne.setOnAction(e -> rechne(e));

        HBox root = new HBox();
        root.setSpacing(10.0);
        Insets insets = new Insets(20, 10, 10, 50);
        root.setPadding(insets);
        root.getChildren().addAll(textfiel1, lEins,textfield2, bRechne, label2);
        Scene scene = new Scene(root, 400, 200);
        primaryStage.setTitle("Rechner");
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    private void rechne(ActionEvent e) {
        String eingabe1 = textfiel1.getText();
        String eingabe2 = textfield2.getText();
        int zahl1 = Integer.parseInt(eingabe1);
        int zahl2 = Integer.parseInt(eingabe2);
        int ergebnis = zahl1 + zahl2;
        label2.setText(""+ergebnis);
    }
}
