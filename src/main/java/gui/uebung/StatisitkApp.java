package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 *
 */
public class StatisitkApp extends Application {
    public List<Integer> list=new ArrayList<>();
    public TextField tfInput;
    public Insets insets=new Insets(10,10,10,10);
    public Label lDurchschnitt;
    public Label lEintraege;
    public Label lSumme;
    public Label lMin;
    public Label lMax;
    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox root=new VBox();

        HBox boxInput=getLineInput();
        HBox boxLineMinMax=getLineMinMax();
        HBox boxLineDurchschnitt=getLineDurchschnitt();
        HBox boxLineSumme=getLineSumme();
        HBox boxLineEintraege=getLineEintraege();
        HBox boxLineButtons=getLineButtons();

        root.getChildren().add(boxInput);
        root.getChildren().add(boxLineMinMax);
        root.getChildren().add(boxLineDurchschnitt);
        root.getChildren().add(boxLineSumme);
        root.getChildren().add(boxLineEintraege);
        root.getChildren().add(boxLineButtons);
        root.setPadding(insets);
        root.setSpacing(10);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Statistik");
        primaryStage.show();

    }

    public HBox getLineInput(){
        Label lInput=new Label("Geben Sie eine Zahl ein: ");
        tfInput=new TextField();
        Button bInput=new Button("Hinzufügen!");
        bInput.setOnAction(e->hinzufügen(e));

        HBox box=new HBox();
        box.getChildren().add(lInput);
        box.getChildren().add(tfInput);
        box.getChildren().add(bInput);
        box.setPadding(insets);
        box.setSpacing(10);
        return box;
    }

    public HBox getLineMinMax(){
        lMin=new Label("Min: " + 0);
        lMax=new Label("Max: " + 0);
        HBox box=new HBox();
        box.getChildren().add(lMin);
        box.getChildren().add(lMax);
        box.setPadding(insets);
        box.setSpacing(10);
        return box;
    }

    public HBox getLineSumme(){
        lSumme=new Label("Summe: " + 0);
        HBox box=new HBox();
        box.getChildren().add(lSumme);
        box.setPadding(insets);
        return box;
    }

    public HBox getLineEintraege(){
        lEintraege=new Label("Anzahl der Einträge: " + 0);
        HBox box=new HBox();
        box.getChildren().add(lEintraege);
        box.setPadding(insets);
        return box;
    }
    public HBox getLineButtons(){
        Button bListeLeeren=new Button("Liste leeren");
        bListeLeeren.setOnAction((e->listeLeeren(e)));
        HBox box=new HBox();
        box.getChildren().add(bListeLeeren);
        box.setPadding(insets);
        return box;
    }
    public int getSumme(){
        int summe=0;
        for(Integer number:list){
            summe+=number;
        }
        return summe;
    }
    public HBox getLineDurchschnitt(){
        lDurchschnitt=new Label("Durchschnitt: " + 0);
        HBox box=new HBox();
        box.getChildren().add(lDurchschnitt);
        box.setPadding(insets);
        return box;
    }

    public double getDurchschnitt(){
        int totalSum=0;
        for(Integer number: list){
            totalSum+=number;
        }
        double durchschnitt=totalSum/list.size();
        return durchschnitt;
    }

    public void hinzufügen(ActionEvent e){
        try{
            list.add(Integer.parseInt(tfInput.getText()));
            Collections.sort(list);
            lMin.setText("Min: " + list.get(0));
            lMax.setText("Max: " + list.get(list.size()-1));
            lDurchschnitt.setText("Durchschnitt: " + getDurchschnitt());
            lSumme.setText("Summe: " + getSumme());
            lEintraege.setText("Einträge: " + list.size());
            tfInput.setText("");
        }
        catch(NumberFormatException f){
            System.out.println("Falsche Eingabe!");
        }
    }

    public void listeLeeren(ActionEvent e){
        list=new ArrayList<>();
        lMin.setText("Min: 0");
        lMax.setText("Max: 0");
        lDurchschnitt.setText("Durchschnitt: 0.0");
        lSumme.setText("Summe: 0");
        lEintraege.setText("Einträge: " + list.size());
    }
}
