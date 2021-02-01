package uebungen.uebung1;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;




public class TaschenRechnerGui extends Application {

    private TextField eingabe1;
    private TextField eingabe2;
    private Label lErgebnis;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox box = new VBox(10);
    }

        eingabe1 =new TextField();

        eingabe2 =new TextField();

        Label lPlus = new Label("+");
        lErgebnis =new

        Label("End Ergebnis: ");

        Button btnBerechnen = new Button("=");
        btnBerechnen.setOnAction(e -> rechne(e));
        box.getChildren().addAll(eingabe1, lPlus, eingabe2, btnBerechnen, lErgebnis);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Rechner");
        primaryStage.Show();
    }


}
