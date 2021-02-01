package gui.uebung;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Aufgabe:
 * Zahleneingabe
 * Min, Max, Summe, Durchschnitt, anzahl Zahlen ausgeben
 *
 * [.5.] + [.2.] (=) 7
 */
public class StatisitkApp extends Application {
    public List<Integer> list=new ArrayList<>();
    public TextField tfInput;

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
        root.getChildren().add(boxLineButtons); //Stand: Add all überall ersetzen, button aktualisieren schon bei hinzufügen
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
        return box;
    }

    public HBox getLineMinMax(){
        lMin=new Label("Min: " + 0);
        lMax=new Label("Max: " + 0);
        HBox box=new HBox();
        box.getChildren().addAll();
        return box;
    }

    public HBox getLineSumme(){
        lSumme=new Label("Summe: " + 0);
        HBox box=new HBox();
        box.getChildren().addAll();
        return box;
    }

    public HBox getLineEintraege(){
        lEintraege=new Label("Anzahl der Einträge: " + 0);
        HBox box=new HBox();
        box.getChildren().addAll();
        return box;
    }
    public HBox getLineButtons(){
        Button bNeueZahlen=new Button("Aktualisieren");
        bNeueZahlen.setOnAction(e->aktualisieren(e));
        Button bListeLeeren=new Button("Liste leeren");
        bListeLeeren.setOnAction((e->listeLeeren(e)));

        HBox box=new HBox();
        box.getChildren().addAll();
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
        box.getChildren().addAll();
        return box;
    }

    public double getDurchSchnitt(){
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
        }
        catch(NumberFormatException f){
            System.out.println("Falsche Eingabe!");
        }
    }

    public void aktualisieren(ActionEvent e){
        launch();
    }
    public void listeLeeren(ActionEvent e){
        list=new ArrayList<>();
    }
}
