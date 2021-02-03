package gui.controls;

import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.List;

/**
 * Minimal-Version einer Tabelle.
 */
public class TabelleApp extends Application {

    private TableView<Passwort> tabelle;
    private Manager manager;
    private TextField tfSuche;

    public static void main(String[] args) {
        launch(null);
    }


    @Override
    public void start(Stage primaryStage) throws Exception {
        manager = new Manager();
        BorderPane root = new BorderPane();
        root.setTop(getSuchLeiste());
        root.setCenter(getTabelle());
        Scene scene = new Scene(root, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Node getSuchLeiste() {
        HBox box = new HBox(15);
        box.setPadding(new Insets(10));
        box.setAlignment(Pos.CENTER);
        tfSuche = new TextField();
        Button bSuche = new Button("Suche");
        bSuche.setOnAction(e -> suche());
        bSuche.setDefaultButton(true);
        box.getChildren().addAll(tfSuche, bSuche);
        return box;
    }

    private void suche() {
        List<Passwort> liste = manager.suche(tfSuche.getText());
        ObservableList<Passwort> pw = FXCollections
                .observableArrayList(liste);
        tabelle.setItems(pw);
    }


    private Node getTabelle() {
        tabelle = new TableView<>();
        ScrollPane scrolli = new ScrollPane();
        scrolli.setContent(tabelle);

        TableColumn<Passwort, String> nameCol = new TableColumn<>();
        nameCol.setCellValueFactory(new PropertyValueFactory<>("name"));
        nameCol.setText("Name");
        nameCol.setPrefWidth(120);
        TableColumn<Passwort, String> benutzerCol = new TableColumn<>();
        benutzerCol.setCellValueFactory(new PropertyValueFactory<>("benutzername"));
        benutzerCol.setText("Benutzer");
        benutzerCol.setPrefWidth(150);
        tabelle.getColumns().addAll(nameCol, benutzerCol);
        return scrolli;
    }

}
