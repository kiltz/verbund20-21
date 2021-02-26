package Fahrkartenautomat;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import Fahrkartenautomat.Ticketautomat;
import javafx.scene.control.Label;

import java.awt.event.ActionEvent;

public class AutomatController {
    public CheckBox cbTicket1;
    public CheckBox cbTicket2;
    public CheckBox cbTicket3;
    public CheckBox cbTicket4;
    public CheckBox cbTicket5;
    public Label lChosenTicket;
    public Button bAuswahl;
    public int checkboxesChecked = 0;

    public void disableCheckboxes(javafx.event.ActionEvent actionEvent) {
        checkboxesChecked = 1;
        int iInput = -1;
        if(cbTicket1.isSelected()) {
            iInput = 0;
        }
        if(cbTicket1.isSelected()) {
            iInput = 1;
        }
        if(cbTicket1.isSelected()) {
            iInput = 2;
        }
        if(cbTicket1.isSelected()) {
            iInput = 3;
        }
        if(cbTicket1.isSelected()) {
            iInput = 4;
        }
        if(checkboxesChecked == 1) {
            cbTicket1.setDisable(true);
            cbTicket2.setDisable(true);
            cbTicket3.setDisable(true);
            cbTicket4.setDisable(true);
            cbTicket5.setDisable(true);
            lChosenTicket.setText(Ticketautomat.Ticketlist[1] +" Kostet: " + String.valueOf(Ticketautomat.Costlist[1]) + " Euro");
        }
        }

}