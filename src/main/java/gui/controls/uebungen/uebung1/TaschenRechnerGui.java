package uebungen.uebung1;

import javafx.application.Application;
<<<<<<< HEAD
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
=======
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TaschenRechnerGui extends Application {

    private TextField tf1;
    private TextField tf2;
    private Label lErgebnis;

    public static void main(String[] args) {
>>>>>>> origin/FabianLechner
        launch(args);
    }

    @Override
<<<<<<< HEAD
    public void start(Stage primaryStage) throws Exception
    {
        BorderPane box = new BorderPane();
        box.setPadding(new Insets(10,10,10,10));
        Button btnAdd;
        TextField txtNum1, txtNum2;
        Label lblSum;
        box.setTop(new Label("Gib zwei Zahlen ein: "));

        lblSum = new Label("");
        box.setBottom(lblSum);

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
        Label lnez = new Label("Zahl2");

        center.add(new Label("Zahl2"), 1, 0);
        center.add(zahl1, 1, 0);
        center.add(lnez, 1, 1);
        center.add(zahl2, 1, 2);
        center.add(rechne, 1, 3);
        box.setCenter(center);

        rechne.setOnAction(new EventHandler<ActionEvent>() {
                               @Override
                               public void handle(ActionEvent event){
                                   int num1 = Integer.parseInt(zahl1.getText());
                                   int num2 = Integer.parseInt(zahl2.getText());
                                   int sum = num1 + num2;
                                   lblSum.setText("Das Ergebnis ist: " + sum);
                               }
                           }
        );

        Scene scene = new Scene(box, 450, 150);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.setScene(scene);
        primaryStage.show();
=======
    public void start(Stage primaryStage) throws Exception {

        tf1 = new TextField(){
            @Override
            public void replaceText(int start, int end, String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceText(start, end, text);
                }
            }

            @Override
            public void replaceSelection(String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceSelection(text);
                }

            }
        };
        tf2 = new TextField(){
            @Override
            public void replaceText(int start, int end, String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceText(start, end, text);
                }
            }

            @Override
            public void replaceSelection(String text) {
                if (text.matches("[0-9]") || text.equals("")) {
                    super.replaceSelection(text);
                }

            }
        };
        lErgebnis = new Label();
        Label lPlus = new Label("+");

        tf1.setPromptText("1.Zahl eingeben");
        tf2.setPromptText("2.Zahl eingeben");

        VBox box = new VBox(10);
        box.setPadding(new Insets(20, 20, 20, 20));

        Button bRechne = new Button("=");
        bRechne.setOnAction(e -> rechne(e));

        box.getChildren().addAll(tf1, lPlus, tf2, bRechne, lErgebnis);

        Scene scene = new Scene(box, 400, 250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Taschenrechner");
        primaryStage.show();

    }

    private void rechne(ActionEvent e) {
        try {
            int zahl1 = Integer.parseInt(tf1.getText());
            int zahl2 = Integer.parseInt(tf2.getText());
            int ergebnis = zahl1 + zahl2;
            lErgebnis.setText("Ergebnis: " + ergebnis);
        } catch (NumberFormatException e1) {
            lErgebnis.setText("Die Eingabe war keine Zahl! (" + e1.getMessage() + ")");
        }
>>>>>>> origin/FabianLechner
    }
}
