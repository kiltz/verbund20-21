package gui.uebung;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */

public class StatisitkApp extends Application {

    TextField tf;
    List<Integer> list = new ArrayList<>();
    Label su;
    Label du;
    Label mi;
    Label ma;
    Label an;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root = new VBox(10);
        root.setPadding(new Insets(10,20,20,10));
        root.getChildren().addAll(getInput(),getMinMax(),getDurchschnitt(),getSumme(),getAnzahl(), getListeLeeren());
        Scene scene = new Scene(root, 450, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getListeLeeren() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        Button bDelete = new Button("Liste leeren");
        bDelete.setDefaultButton(true);
        bDelete.setOnAction(e -> list.clear());
        box.getChildren().add(bDelete);
        return box;
    }

    private Node getSumme() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        Label summe = new Label("Summe: ");
        su.setText(String.valueOf(summieren()));
        box.getChildren().addAll(summe, su);
        return box;
    }

    private Node getAnzahl() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        Label anzahl = new Label("Anzahl :");
        an.setText(String.valueOf(list.size()));
        box.getChildren().addAll(anzahl,an);
        return box;
    }

    private Node getDurchschnitt() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        Label durchschnitt = new Label("Durchschnitt: ");
        du.setText(String.valueOf(berechneDurchschnitt()));
        box.getChildren().addAll(durchschnitt, du);
        return box;
    }

    private Node getMinMax() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        Label min = new Label("Min: ");
        Label max = new Label("Max: ");
        box.getChildren().addAll(min,max);
        return box;
    }

    private Node getInput() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        tf = new TextField();
        Button bAdd = new Button("Hinzufuegen");
        bAdd.setDefaultButton(true);
        bAdd.setOnAction(e -> add());
        box.getChildren().addAll(new Label("Eingabe"), tf,bAdd);
        return box;
    }

    public void add() {
        list.add(Integer.parseInt(tf.getText()));
        Collections.sort(list);
    }
    public int summieren(){
        int summe = 0;
        if (list.size()>=1){
            for(int i:list) {
                summe = summe + i;
            }
        }
        return summe;
    }
    public float berechneDurchschnitt(){
        float  durchschnitt=0;
        if (list.size() >= 1) {
           durchschnitt =  (float) summieren() / (float) list.size();
        }
        return durchschnitt;
    }
}
