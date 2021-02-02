package basic.liste;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class SystemEigenschaftenGUI extends Application {

    private TextField tfEingabe;
    private TextArea taAusgabe;

    public static void main(String[] args) {
        launch(args);
    }

    Map<Integer, String> systemProperties = new HashMap<>();

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10, 20, 20, 10));
        root.getChildren().addAll(getEingabeZeile(), getAusgabeZeile());
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

        Properties props = System.getProperties();
        for (Map.Entry<Object, Object> e : props.entrySet()) {
            System.out.println(e.getKey() + ": " + e.getValue());
        }
    }

    private Node getEingabeZeile() {
        HBox box = new HBox();
        tfEingabe = new TextField();
        Button bEingabe = new Button("Suche");
        bEingabe.setDefaultButton(true);
        bEingabe.setOnAction(e -> suche(e));
        box.getChildren().addAll(tfEingabe,bEingabe);
        return box;
    }

    private Node getAusgabeZeile() {
        HBox box = new HBox();
        taAusgabe = new TextArea();
        taAusgabe.setPrefColumnCount(10);
        taAusgabe.setPrefRowCount(4);
        box.getChildren().add(taAusgabe);
        return box;
    }

    private void suche(ActionEvent e) {
        Properties props = System.getProperties();
        for (Map.Entry<Object, Object> f : props.entrySet()) {
            System.out.println(f.getKey()+": "+f.getValue());
        }
        taAusgabe.setText(""+props);

    }
}

