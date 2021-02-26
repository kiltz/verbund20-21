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

        root.getChildren().add(bAusgeben);
        root.getChildren().add(taAusgabe);
        Scene scene=new Scene(root,500,500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Properties Ausgabe");
        primaryStage.show();

    }

    public void ausgeben(ActionEvent e){
        Properties props = System.getProperties();
        taAusgabe.setText("Betriebssystem: " + System.getProperty("os.name")+ "\n Benutzername: " + System.getProperty("user.name"));

    }
}