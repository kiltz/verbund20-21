package gui.layout;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import static javafx.application.Application.launch;
import javafx.application.Application;
import javafx.scene.paint.Color;
import javafx.scene.image.Image;
import javafx.scene.Node;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;


public class Layoutaufgabe extends Application {
    public static void main(String[] args) { launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label linfotext1 = new Label("Herzlich Willkommen auf der NewsPage!");
        Label linfotext2 = new Label("Auf dieser Seite finden Sie Informationen über Corona.");



        TabPane tabroot = new TabPane();
        HBox boxtab = new HBox();
        Tab tab1 = new Tab("NewsPage!", boxtab);
        tabroot.getTabs().addAll(tab1);



        VBox tabeins = new VBox();
        boxtab.getChildren().add(tabeins);

        HBox zeile1 = new HBox();
        zeile1.getChildren().add(linfotext1);

        HBox zeile2 = new HBox();
        zeile2.getChildren().add(linfotext2);


        HBox zeile3 = new HBox();

        AnchorPane root = new AnchorPane();
        Button save = new Button("Artikel Speichern");
        Button help = new Button("Hilfe");
        HBox buttons = new HBox();
        buttons.setSpacing(12);
        buttons.getChildren().addAll(save, help);
        root.getChildren().add(buttons);
        AnchorPane.setRightAnchor(buttons, 10.0);
        AnchorPane.setBottomAnchor(buttons, 20.0);
        zeile3.getChildren().addAll(save,help);


        tabeins.getChildren().add(zeile1);
        tabeins.getChildren().add(zeile2);
        tabeins.getChildren().add(zeile3);







        Insets insets = new Insets(40, 30, 10, 10);
        tabeins.setPadding(insets);
        Scene scene = new Scene(tabroot, 500, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }









}