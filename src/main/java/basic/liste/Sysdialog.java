package basic.liste;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Map;
import java.util.Properties;

public class Sysdialog extends Application {

    private Label Info1;
    private Label Info2;
    private Label Info3;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Info1 = new Label("Info1");
        Info2 = new Label("Info2");
        Info3 = new Label("Info3");

        HBox HB1 = new HBox(Info1);
        HBox HB2 = new HBox(Info2);
        HBox HB3 = new HBox(Info3);
        VBox root = new VBox(Info1, Info2, Info3);

        root.setSpacing(10.0);
        Insets insets = new Insets(10, 10, 20, 10);
        root.setPadding(insets);

        Scene scene = new Scene(root, 200, 400);
        primaryStage.setScene(scene);
        primaryStage.show();

        getInfo1();

    }

    public void getInfo1() {

        Properties props = System.getProperties();
        for (Map.Entry<Object, Object> e : props.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());

        }
    }
}