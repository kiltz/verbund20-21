package gui;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class RechnerApp extends Application {

    private Label lErgebnis;

    private TextField eingabe1;
    private TextField eingabe2;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        lErgebnis = new Label(" ");
        eingabe1 = new TextField();
        Label p = new Label("+");
        eingabe2 = new TextField();
        Button bRechne = new Button(" = ");
        bRechne.setDefaultButton(true);
        bRechne.setOnAction(e -> rechne(e));


        HBox root = new HBox();
        root.getChildren().add(eingabe1);
        root.getChildren().add(p);
        root.getChildren().add(eingabe2);
        root.getChildren().add(bRechne);
        root.getChildren().add(lErgebnis);



        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    private void rechne(ActionEvent e) {



        String e1 = eingabe1.getText();
        String e2 = eingabe2.getText();




        int eingabe1=Integer.parseInt(e1);
        int eingabe2=Integer.parseInt(e2);
        int endwert= eingabe1 + eingabe2;
        lErgebnis.setText(String.valueOf(endwert));



    }
}

