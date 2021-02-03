package basic;

import javafx.geometry.Insets;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

public class PropertiesExample extends Application {
    public static void main(String[] args) { launch(args);}
    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box;
        box = new VBox(10);
        box.setPadding(new Insets(10, 20, 20, 20));
        Label lzeile1, lzeile2, lzeile3, lzeile4, lzeile5;

        HBox hbox1 = new HBox(10);
        lzeile1 = new Label("Benutzername: " +System.getProperty("user.name"));
        hbox1.getChildren().addAll(lzeile1);

        HBox hbox2 = new HBox(10);
        lzeile2 = new Label("Betriebssystem: "+System.getProperty("os.name"));
        hbox2.getChildren().addAll(lzeile2);

        HBox hbox3 = new HBox(10);
        lzeile3 = new Label("Bitrate: "+System.getProperty("os.arch"));
        hbox3.getChildren().addAll(lzeile3);

        HBox hbox4 = new HBox(10);
        lzeile4 = new Label("Benutzerverzeichnis: " +System.getProperty("user.home"));
        hbox4.getChildren().addAll(lzeile4);

        HBox hbox5 = new HBox(10);
        lzeile5 = new Label("Speicherverzeichnis"+System.getProperty("user.dir"));
        hbox5.getChildren().addAll(lzeile5);

        box.getChildren().addAll(hbox1, hbox2, hbox3, hbox4, hbox5);
        Scene scene = new Scene(box, 400, 150);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Properties");
        primaryStage.show();
    }
}
