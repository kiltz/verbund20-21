package Fahrkartenautomat;

import de.verbund.pwmanager.service.Passwort;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) throws Exception {
        Ticket Ticket1 = new Ticket(1,"Kurzstrecke",7.45);
        FileManager filemanager = new FileManager();
        filemanager.neu(Ticket1);
        Map<Integer,Ticket> foundList=filemanager.lese();
        for (Ticket ticket : foundList.values()) {
            System.out.println(ticket.getTicketID() + "" + ticket.getTicketname()+ "" + ticket.getTicketCost());
        }
        }

        }

