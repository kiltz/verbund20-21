package gui.feature.passwort;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class PasswdApp extends Application {

    private TextField tfLaenge;
    Label lAusgabe=new Label("Ihr neues Passwort: ");

    private String erlaubteZeichen = "abcdefghijklmnopqrstuvwxyz";
    private String großBuchstaben="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private String zahlen="0123456789";
    private String sonderZeichen="!@§$%&/()=?`{[]}#+-*";

    private CheckBox cbGroßBuchstaben=new CheckBox();
    private CheckBox cbZahlen=new CheckBox();
    private CheckBox cbSonderzeichen=new CheckBox();
    private CheckBox cbEinsvonAllen=new CheckBox();
    public static void main(String[] args) {
        launch(args);
    }

    public void start(Stage primaryStage){
        VBox root=new VBox();

        HBox boxLaenge=new HBox();
        Label lLaenge=new Label("Geben Sie Ihre gewünschte Länge an: ");
        tfLaenge=new TextField();
        boxLaenge.getChildren().add(lLaenge);
        boxLaenge.getChildren().add(tfLaenge);

        HBox boxCheckBoxen=getCheckBoxen();
        Button bErzeugen=new Button("Erzeuge Passwort");
        bErzeugen.setOnAction(e->erzeugen(e));



        root.getChildren().add(boxLaenge);
        root.getChildren().add(boxCheckBoxen);
        root.getChildren().add(bErzeugen);
        root.getChildren().add(lAusgabe);

        Scene scene=new Scene(root,400,400);
        primaryStage.setScene(scene);
        primaryStage.setTitle("PasswdApp");
        primaryStage.show();
    }

    public HBox getCheckBoxen(){

        Label lGroßbuchstaben=new Label("Großbuchstaben");
        Label lZahlen=new Label("Zahlen");
        Label lSonderzeichen=new Label("Sonderzeichen");
        Label lEinsvonAllem=new Label("Eins von Allem");
        HBox box=new HBox();
        box.getChildren().add(lGroßbuchstaben);
        box.getChildren().add(cbGroßBuchstaben);
        box.getChildren().add(lZahlen);
        box.getChildren().add(cbZahlen);
        box.getChildren().add(lSonderzeichen);
        box.getChildren().add(cbSonderzeichen);
        box.getChildren().add(lEinsvonAllem);
        box.getChildren().add(cbEinsvonAllen);
        return box;
    }

    public void erzeugen(ActionEvent e){
        seterlaubteZeichen();
        String password = "";
        int laenge=Integer.parseInt(tfLaenge.getText());
        for (int i = 0; i < laenge; i++) {
            int pos = (int) (Math.random() * erlaubteZeichen.length());
            password += erlaubteZeichen.charAt(pos);
        }
        if(cbEinsvonAllen.isSelected()){
            int posGroß=(int) (Math.random()*großBuchstaben.length());
            password.replace(password.charAt(0), großBuchstaben.charAt(posGroß));
            int posZahl=(int) (Math.random()*zahlen.length());
            password.replace(password.charAt(1), zahlen.charAt(posZahl));
            int posSonder=(int) (Math.random()*sonderZeichen.length());
            password.replace(password.charAt(2), sonderZeichen.charAt(posSonder));

        }
        lAusgabe.setText("Ihr neues Passwort: " + password);

    }
    public void seterlaubteZeichen(){
        if(cbGroßBuchstaben.isSelected()){
            erlaubteZeichen+=großBuchstaben;
        }
        if(cbZahlen.isSelected()){
            erlaubteZeichen+=zahlen;
        }
        if(cbSonderzeichen.isSelected()){
            erlaubteZeichen+=sonderZeichen;
        }
    }
}
