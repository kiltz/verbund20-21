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
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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
        box.getChildren().add(lInfo);
        Label lStatus = new Label("Ein Status");
        box.getChildren().add(lStatus);

        Scene scene = new Scene(box, 400,250);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Mein kleines sinnloses Fensterchen");
>>>>>>> Friedrich
        primaryStage.show();
    }
}
