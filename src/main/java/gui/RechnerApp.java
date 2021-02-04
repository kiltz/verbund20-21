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

public class RechnerApp extends Application {
        private TextField text1;
        private TextField text2;
        private Label ergebnis;
    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l1 = new Label("+");
        text1=new TextField();
        text2=new TextField();
        Button button=new Button("=");
        button.setOnAction(e->rechne(e));
        ergebnis=new Label("");
        HBox root = new HBox();
        root.setSpacing(10);
        Insets insets= new Insets(10,10,10,10);
        root.setPadding(insets);
        root.getChildren().add(text1);
        root.getChildren().add(l1);
        root.getChildren().add(text2);
        root.getChildren().add(button);
        root.getChildren().add(ergebnis);
        Scene scene = new Scene(root, 500, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void rechne(ActionEvent e){
        String t1=text1.getText();
        String t2=text2.getText();
        try{
            double zahl1=Double.parseDouble(t1);
            double zahl2=Double.parseDouble(t2);
            double endwert=Math.round((zahl1+zahl2)*100)/100.0;
            ergebnis.setText("Ihr Ergebnis ist: " + endwert);
        }
        catch(NumberFormatException f){
            ergebnis.setText("Fehlerhafte Eingabe!");
        }
    }
}
