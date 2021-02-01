package gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RechnerApp extends Application {

    private TextField tf1;
    private TextField tf2;
    private Label lErgebnis;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        tf1 = new TextField(){
            @Override
            public void replaceText(int start, int end, String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceText(start, end, text);
                }
            }

            @Override
            public void replaceSelection(String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceSelection(text);
                }

            }
        };
        tf2 = new TextField(){
            @Override
            public void replaceText(int start, int end, String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceText(start, end, text);
                }
            }

            @Override
            public void replaceSelection(String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceSelection(text);
                }

            }
        };

        tf1.setPromptText("1.Zahl eingeben");
        tf2.setPromptText("2.Zahl eingeben");
        lErgebnis = new Label();

        Label lModifikator = new Label(" + ");
        Button brechne = new Button(" = ");
        brechne.setOnAction(e -> rechne(e));
        HBox root = new HBox();
        root.setSpacing(10.0);
        root.getChildren().addAll(tf1,lModifikator,tf2,brechne,lErgebnis);
        Scene scene = new Scene(root, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void rechne(javafx.event.ActionEvent e) {
        double zahl1 = Double.parseDouble(tf1.getText());
        double zahl2 = Double.parseDouble(tf2.getText());
        double ergebnis = zahl1 + zahl2;
        lErgebnis.setText(String.valueOf(ergebnis));

    }
}