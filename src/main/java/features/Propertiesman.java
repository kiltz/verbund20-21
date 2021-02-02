package features;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import java.util.Enumeration;
import java.util.Properties;

public class Propertiesman extends Application {

    private Properties props;
    private Enumeration<?> names;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label l = new Label();
        HBox root = new HBox();
        root.getChildren().add(l);
        Button b1 = new Button("Login");
        b1.setOnAction(e -> lel(e));




            Scene scene = new Scene(b1, 300, 400);
            primaryStage.setScene(scene);
            primaryStage.show();

        }


    private void lel(ActionEvent e) {
       // System.out.println( System.getProperty("os.name") );
        props = System.getProperties();
        names = props.propertyNames();
        while (names.hasMoreElements()) {
            String name = (String) names.nextElement();
            System.out.println(name + "=" + System.getProperty(name));
    }
}
}