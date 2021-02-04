package gui.controls;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class test2 extends Application {
    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {
        TabPane root = new TabPane();
        CheckBox box1 = new CheckBox();
        CheckBox box2 = new CheckBox();
        CheckBox box3 = new CheckBox();
        CheckBox box4 = new CheckBox();
        CheckBox box5 = new CheckBox();
        CheckBox box6 = new CheckBox();
        CheckBox box7 = new CheckBox();
        CheckBox box8 = new CheckBox();
        CheckBox box9 = new CheckBox();


        CheckBox box11 = new CheckBox();
        CheckBox box12 = new CheckBox();
        CheckBox box13 = new CheckBox();
        CheckBox box14 = new CheckBox();
        CheckBox box15 = new CheckBox();
        CheckBox box16 = new CheckBox();
        CheckBox box17 = new CheckBox();
        CheckBox box18 = new CheckBox();
        CheckBox box19 = new CheckBox();

        CheckBox box21 = new CheckBox();
        CheckBox box22 = new CheckBox();
        CheckBox box23 = new CheckBox();
        CheckBox box24 = new CheckBox();
        CheckBox box25 = new CheckBox();
        CheckBox box26 = new CheckBox();
        CheckBox box27 = new CheckBox();
        CheckBox box28 = new CheckBox();
        CheckBox box29 = new CheckBox();


        box11.setAllowIndeterminate(true);
        box12.setAllowIndeterminate(true);
        box13.setAllowIndeterminate(true);
        box14.setAllowIndeterminate(true);
        box15.setAllowIndeterminate(true);
        box16.setAllowIndeterminate(true);
        box17.setAllowIndeterminate(true);
        box18.setAllowIndeterminate(true);
        box19.setAllowIndeterminate(true);


        box1.setAllowIndeterminate(true);
        box2.setAllowIndeterminate(true);
        box3.setAllowIndeterminate(true);
        box4.setAllowIndeterminate(true);
        box5.setAllowIndeterminate(true);
        box6.setAllowIndeterminate(true);
        box7.setAllowIndeterminate(true);
        box8.setAllowIndeterminate(true);
        box9.setAllowIndeterminate(true);


        box21.setAllowIndeterminate(true);
        box22.setAllowIndeterminate(true);
        box23.setAllowIndeterminate(true);
        box24.setAllowIndeterminate(true);
        box25.setAllowIndeterminate(true);
        box26.setAllowIndeterminate(true);
        box27.setAllowIndeterminate(true);
        box28.setAllowIndeterminate(true);
        box29.setAllowIndeterminate(true);

        VBox VB1 = new VBox(box1, box2, box3);
        VBox VB2 = new VBox(box4, box5, box6);
        VBox VB3 = new VBox(box7, box8, box9);

        VBox VB4 = new VBox(box11, box12, box13);
        VBox VB5 = new VBox(box14, box15, box16);
        VBox VB6 = new VBox(box17, box18, box19);

        VBox VB7 = new VBox(box21, box22, box23);
        VBox VB8 = new VBox(box24, box25, box26);
        VBox VB9 = new VBox(box27, box28, box29);

        HBox HB1 = new HBox(VB1, VB2, VB3);
        HBox HB2 = new HBox(VB4, VB5, VB6);
        HBox HB3 = new HBox(VB7, VB8, VB9);

        Tab tab1 = new Tab("Runde1", HB1);
        Tab tab2 = new Tab("Runde2", HB2);
        Tab tab3 = new Tab("Runde3", HB3);

        root.getTabs().addAll(tab1, tab2, tab3);


        HB1.setSpacing(5.0);
        HB2.setSpacing(5.0);
        HB3.setSpacing(5.0);

        Insets insets = new Insets(40, 20, 40, 100);
        HB1.setPadding(insets);
        HB2.setPadding(insets);
        HB3.setPadding(insets);

        Scene scene = new Scene(root,300, 250);
        primaryStage.setTitle("Tic Tac Toe");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

