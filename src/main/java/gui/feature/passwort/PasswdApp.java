package gui.feature.passwort;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PasswdApp extends Application {

    private TextField Zahleingabe;
    private Button PwGenerator;
    private TextField PwFeld;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Zahleingabe = new TextField("Zeichenanzahl");
        PwGenerator = new Button("generieren");
        PwGenerator.setOnAction(e -> PwGenerator(e));
        PwFeld = new TextField("Password");


        HBox HB1 = new HBox(Zahleingabe);
        HBox HB2 = new HBox(PwGenerator);
        HBox HB3 = new HBox(PwFeld);
        VBox root = new VBox(HB1, HB2, HB3);

        root.setSpacing(10.0);
        Insets insets = new Insets(10, 10, 20, 10);
        root.setPadding(insets);

        Scene scene = new Scene(root, 200, 400);
        primaryStage.setScene(scene);
        primaryStage.show();


    }



    private void PwGenerator(ActionEvent e) {

            int Zähler = Integer.parseInt(Zahleingabe.getText());

        //                        01234567890123456789
        String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";


        String test = "";
        for (int i = 0; i < Zähler; ++i) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            test += erlaubteZeichen.charAt(pos);
        }
        PwFeld.setText(test);

    }

}