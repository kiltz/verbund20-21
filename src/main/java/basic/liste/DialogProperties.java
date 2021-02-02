package basic.liste;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Map;
import java.util.Properties;


public class DialogProperties extends Application {

    private TextArea taAusgabe=new TextArea();

    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root=new VBox();

        Button bAusgeben=new Button("Ausgeben");
        bAusgeben.setOnAction(e->ausgeben(e));

        taAusgabe.setEditable(false);

        root.getChildren().addAll();
        Scene scene=new Scene(root,200,200);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Properties Ausgabe");
        primaryStage.show();

    }

    public void ausgeben(ActionEvent e){
        Properties props = System.getProperties();
        for (Map.Entry<Object, Object> element : props.entrySet()) {
            taAusgabe.setText(element.getKey()+": "+element.getValue());
        }
    }
}
