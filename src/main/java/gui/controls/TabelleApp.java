package gui.controls;

import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.List;

public class TabelleApp extends Application {

    private TableView<Passwort> tabelle;
    private Manager manager;

    public static void main(String[] args) {
        launch(null);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        manager = new Manager();

        HBox root = new HBox();
        root.getChildren().add(getTabelle());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getTabelle() {
        tabelle = new TableView<>();
        ScrollPane scrolli = new ScrollPane();
        scrolli.setContent(tabelle);
        fuelleTabelle();

        TableColumn<Passwort, String> nameCol = new TableColumn<>();
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setText("Name");
        TableColumn<Passwort, String> benutzerCol = new TableColumn<>();
        benutzerCol.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        benutzerCol.setText("Benutzer");
        tabelle.getColumns().addAll(nameCol, benutzerCol);
        return scrolli;
    }

    private void fuelleTabelle() {
        List<Passwort> liste = manager.suche("");
        ObservableList<Passwort> pw = FXCollections
                .observableArrayList(liste);
        tabelle.setItems(pw);    }
}
