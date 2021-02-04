package gui.PasswortManager;

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

public class AufagebeManager extends Application {
        private Manager manager;
        private Label lAusgabe=new Label();
        private TextField tfName;
        private PasswordField pfPassword;
        private TextField pfBenutzer;
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
            Label lName=new Label("Name:");
            tfName=new TextField();
            line1.getChildren().add(lName);
            line1.getChildren().add(tfName);
            line1.setSpacing(30);
            line1.setPadding(insets);

            
            HBox line2=new HBox();
            Label lBenutzer=new Label("Benutzer:");
            pfBenutzer=new TextField();
            line2.getChildren().add(lBenutzer);
            line2.getChildren().add(pfBenutzer);
            line2.setSpacing(10);
            line2.setPadding(insets);
            
            
            HBox line3=new HBox();
            Label lPassword=new Label("Passwort:");
            pfPassword=new PasswordField();
            line3.getChildren().add(lPassword);
            line3.getChildren().add(pfPassword);
            line3.setSpacing(10);
            line3.setPadding(insets);


            HBox line4=new HBox();
            tfEingabe=new TextField();
            line4.getChildren().add(tfEingabe);
            Button bSuche=new Button("Suche");
            bSuche.setOnAction(e -> suche());
            bSuche.setDefaultButton(true);
            line4.getChildren().add(bSuche);
            line4.setSpacing(10);
            line4.setPadding(insets);
            tfLeer=new TextField();
            line4.getChildren().add(tfLeer);


            HBox line5=new HBox();
            Button bEintragen=new Button("eintragen");
            bEintragen.setOnAction(e-> {
                try {
                    eintragen(e);
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            });
            line3.getChildren().add(bEintragen);
            bEintragen.setDefaultButton(true);
            line3.setSpacing(10);
            line3.setPadding(insets);


            HBox line6=new HBox();
            line4.getChildren().add(lAusgabe);
            line4.setSpacing(30);
            line4.setPadding(insets);

            completeBox.getChildren().add(line1);
            completeBox.getChildren().add(line2);
            completeBox.getChildren().add(line3);
            completeBox.getChildren().add(line4);
            completeBox.getChildren().add(line5);

            Scene scene=new Scene(completeBox, 800, 400);
            primaryStage.setScene(scene);
            primaryStage.setTitle("PasswdManangerApp");
            primaryStage.show();

        }

        private void suche() {
            String suchBegriff = tfEingabe.getText();
            List<Passwort> ergebnis = manager.suche(suchBegriff);
            // TODO in einer TextArea ausgeben
            System.out.println(ergebnis);
        }

        private void eintragen(ActionEvent e) throws Exception {
            String name = tfName.getText();
            String benutzername = pfBenutzer.getText();
            String passwd = pfPassword.getText();
            manager.neu(new Passwort(name, benutzername, passwd));
            tfName.setText("");
            pfPassword.setText("");
            pfBenutzer.setText("");
            // TODO: in einem Label ausgeben
            System.out.println("Satz eingetragen");
        }


    }

        

