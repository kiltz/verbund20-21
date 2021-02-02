package basic.liste;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.Map;

public class Properties extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    private TextField txtEingabe = new TextField();
    private TextArea txtAusgabe = new TextArea();

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vMain = new VBox();
        Button btnAusgabe = new Button("Ausgabe");
        btnAusgabe.setOnAction(event -> ausgeben(event));
        txtAusgabe.setEditable(true);
        vMain.getChildren().addAll(txtAusgabe);
        Scene scene = new Scene(vMain, 150,150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Prop. Ausgabe!");
        primaryStage.show();

    }

    private void ausgeben(ActionEvent event) {
        java.util.Properties Prps = System.getProperties();
        for (Map.Entry<Object, Object> e : Prps.entrySet()) {
            txtAusgabe.setText(e.getKey() + ":" + e.getValue());
        }
    }
}


