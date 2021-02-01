package gui;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Login extends Application  {
    private StackPane root = new StackPane();
    private Stage stage;

    @Override
    public void init() {
        Button button = new Button("");

        VBox vBox = new VBox();

        vBox.setSpacing(8);
        vBox.setPadding(new Insets(10,10,10,10));
        vBox.getChildren().addAll(
                new Label("Nutzername"),
                new TextField(),
                new Label("Passwort"),
                new PasswordField(),
                new Button("Einloggen"));
        root.getChildren().addAll(vBox);
        button.setOnAction(actionEvent-> {
            if(stage!=null){
                stage.requestFocus();
                return;
            }
        });
    }

    @Override
    public void start(Stage primaryStage) {
        Scene scene = new Scene(root,400,600);
        primaryStage.setScene(scene);
        primaryStage.show();
        primaryStage.setTitle("Pauls Superlogin");
        primaryStage.setAlwaysOnTop(true);
    }


    public static void main(String[] args) {
        launch(args);
    }

}
