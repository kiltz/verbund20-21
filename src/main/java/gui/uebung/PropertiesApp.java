package gui.uebung;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import java.util.Properties;

public class PropertiesApp extends Application {

    private Properties pros = System.getProperties();

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(15));
        Label lTitel = new Label("Wichtige Properties");
        lTitel.setTextFill(Color.BLUE);
        Label lProps = new Label("JavaHome: " + pros.get("java.home"));
        Label lBenutzer = new Label("Benutzer: " + pros.getProperty("user.name"));
        Label lSystem = new Label("System: " + pros.getProperty("os.name"));
        root.getChildren().addAll(lTitel, lBenutzer, lProps, lSystem);

        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PropertiesApp");
        primaryStage.show();
    }

}
