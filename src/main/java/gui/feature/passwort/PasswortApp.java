package gui.feature.passwort;

import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.stage.Stage;

import java.util.List;

public class PasswortApp extends Application {
    private Manager manager;
    private Label lAusgabe=new Label();
    private TextField tfLeange;
    private TextField tfEingabe;
    private TextField tfLeer;

    public static void main(String[] args) {
        launch(null);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        manager = new Manager();
        VBox completeBox=new VBox();
        Insets insets=new Insets(10,10,10,10);

        HBox line1=new HBox();
        Label lLeange=new Label("Leange:");
        tfLeange=new TextField();
        line1.getChildren().add(lLeange);
        line1.getChildren().add(tfLeange);
        line1.setSpacing(10);
        line1.setPadding(insets);

        tfLeer=new TextField();
        line1.getChildren().add(tfLeer);


        HBox line2=new HBox();
        Button bEintragen=new Button("eintragen");
        tfEingabe=new TextField();
        bEintragen.setOnAction(e->eintragen(e));
        line2.getChildren().add(bEintragen);
        bEintragen.setDefaultButton(true);
        line2.setSpacing(10);
        line2.setPadding(insets);


        completeBox.getChildren().add(line1);
        completeBox.getChildren().add(line2);



        Scene scene=new Scene(completeBox, 800, 400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PasswortApp");
        primaryStage.show();

    }


    private void eintragen(ActionEvent e) {
    }


}



