package uebungen.uebung1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.geometry.Insets;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

public class TaschenRechnerGui extends javafx.application.Application
{
    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception
    {
        BorderPane box = new BorderPane();
        box.setPadding(new Insets(10,10,10,10));

        box.setTop(new Label("Trage eine Zahl ein: "));

        Label lblAddition = new Label("");
        box.setBottom(lblAddition);

        GridPane center = new GridPane();
        center.setVgap(5);
        center.setHgap(5);
        TextField zahl1 = new TextField("0");
        zahl1.setPrefWidth(150);
        TextField zahl2 = new TextField("0");
        zahl2.setPrefWidth(150);

        center.add(new Label("Zahl1"), 0, 0);
        center.add(new Label("+"), 0, 0);
        Button rechne = new Button("=");
        Label nez = new Label("+");

        center.add(new Label("Zahl2"), 0, 2);
        center.add(zahl1, 1, 0);
        center.add(nez, 1, 1);
        center.add(zahl2, 1, 2);
        center.add(rechne, 1, 3);
        box.setCenter(center);

        rechne.setOnAction(new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event){
            int num1 = Integer.parseInt(zahl1.getText());
            int num2 = Integer.parseInt(zahl2.getText());
            int ergebnis = num1 + num2;
            lblAddition.setText("Das Ergebnis ist: " + ergebnis);
            }
            }
        );

        Scene scene = new Scene(box, 450, 150);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
