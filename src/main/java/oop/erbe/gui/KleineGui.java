<<<<<<< HEAD

package oop.erbe.gui;

        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.control.Label;
        import javafx.scene.layout.StackPane;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;
=======
package oop.erbe.gui;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
>>>>>>> Friedrich

public class KleineGui extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {

        VBox box = new VBox();

<<<<<<< HEAD
        Label lInfo = new Label("was geht denn heute ab?");
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Was geht denn heute");
        box.getChildren().add(lStatus);
        Label lStatus2 = new Label("Nix");
        box.getChildren().add(lStatus2);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Hans.exe");
=======
        Label lInfo = new Label("Ein kleiner Text");
        Label lStatus = new Label("Ein Status");

        TextField tfEingabe = new TextField("Eingabe");

        box.getChildren().addAll(lInfo, lStatus, tfEingabe);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein kleines sinnloses Fensterchen");
>>>>>>> Friedrich
        primaryStage.show();

        Stage stage = new Stage();
        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle("Neuer Dialog");
        stage.setScene(new Scene(new StackPane(new Label("Nachricht!"))));
        stage.show();
    }
}
