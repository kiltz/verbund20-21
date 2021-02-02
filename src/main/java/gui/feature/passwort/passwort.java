package gui.feature.passwort;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class passwort extends Application {

    private TextField tfLength;
    Label lOutput=new Label("Neues Passwort: ");

    private String Chars = "abcdefghijklmnopqrstuvwxyz0123456789!'§$%&/()=?";
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root=new VBox();

        HBox boxLength=new HBox();
        Label lLength=new Label("Gewünschte Länge: ");
        tfLength=new TextField();
        boxLength.getChildren().add(lLength);
        boxLength.getChildren().add(tfLength);

        Button bCreate=new Button("Passwort generieren");
        bCreate.setOnAction(e->create(e));

        root.getChildren().add(boxLength);
        root.getChildren().add(tfLength);
        root.getChildren().add(bCreate);
        root.getChildren().add(lOutput);



        Scene scene=new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Passwort Generator");
        primaryStage.show();
    }

    public void create(ActionEvent e){
        String password = "";
        int laenge=Integer.parseInt(tfLength.getText());
        for (int i = 0; i < laenge; i++) {
            int pos = (int) (Math.random() * Chars.length());
            password += Chars.charAt(pos);
        }
        lOutput.setText("Ihr neues Passwort: " + password);
    }
}
