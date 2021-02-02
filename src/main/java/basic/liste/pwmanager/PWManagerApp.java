package basic.liste.pwmanager;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class PWManagerApp extends Application{
    public static void main(String[] args) {
        launch(null);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        VBox vMain = new VBox(20);
        vMain.setPadding(new Insets(10));
        vMain.getChildren().add(getNameRow());
        vMain.getChildren().add(getPrintRow());
        vMain.getChildren().add(getUserRow());
        vMain.getChildren().add(getPwdRow());
        vMain.getChildren().add(getEnterRow());
        vMain.getChildren().add(getSearchRow());

        Scene scene = new Scene(vMain, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private Node getSearchRow() {
        HBox box = new HBox(15);
        TextArea textArea = new TextArea();
        textArea.setPrefRowCount(4);
        textArea.setPrefColumnCount(20);
        textArea.setWrapText(true);
        box.getChildren().add(textArea);
        return box;
    }

    private Node getEnterRow() {
        HBox box = new HBox(15);
        TextField tSuche = new TextField();
        Button btnSuche = new Button("Search");
        btnSuche.setAlignment(Pos.CENTER_RIGHT);
        btnSuche.setDefaultButton(true);
        btnSuche.setOnAction(e -> search());
        box.getChildren().addAll(tSuche,btnSuche);
        return box;
    }

    private void search() {
    }

    private Node getPwdRow() {
        HBox box = new HBox(15);
        Label lPassword = new Label("Password");
        lPassword.setPrefSize(50,10);
        TextField tPassword = new TextField();
        box.getChildren().addAll(lPassword,tPassword);
        return box;
    }

    private Node getUserRow() {
        HBox box = new HBox(15);
        Label lUser = new Label("Username");
        lUser.setPrefSize(50,10);
        TextField tUser = new TextField();
        box.getChildren().addAll(lUser,tUser);
        return box;
    }

    private Node getPrintRow() {
        HBox box = new HBox(15);
        Button btnPrint = new Button("Print");
        btnPrint.setAlignment(Pos.CENTER);
        btnPrint.setDefaultButton(true);
        btnPrint.setOnAction(e -> print());
        box.getChildren().add(btnPrint);
        return box;
    }

    private void print() {
    }

    private Node getNameRow() {
        HBox box = new HBox(15);
        Label lName = new Label("Name");
        lName.setPrefSize(50,10);
        TextField tName = new TextField();
        box.getChildren().addAll(lName,tName);
        return box;
    }
}
