package Fahrkartenautomat;

import de.verbund.pwmanager.utils.Datei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileManager {
    private final Datei datei;
    private Map<Integer, Ticket> tickets;

    public FileManager() {
        datei = new Datei("tickets.csv");
        tickets = lese();
    }

    private Map<Integer, Ticket> lese() {
        Map<Integer, Ticket> liste = new HashMap<>();
        try {
            String inhalt = datei.lese();
            String[] saetze = inhalt.split("\n");
            for (String satz : saetze) {
                String[] teile = satz.split(";");
                if (teile.length == 3) {
                    liste.put(Integer.valueOf(teile[0]), new Ticket(Integer.valueOf(teile[0]), teile[1], Double.valueOf(teile[2])));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }

    public void neu(Ticket t) throws Exception {
        // Validierung
        tickets.put(t.getTicketID(), t);
        String satz = t.getTicketname() + ";" + String.valueOf(t.getTicketCost()) +  "\n";
        datei.schreibe(satz, true);

    }

    public List<Ticket> suche(String s) {
        tickets = lese();
        List<Ticket> ergebnisListe = new ArrayList<>();
        for (Map.Entry<Integer, Ticket> entry : tickets.entrySet()) {
            if (entry.getValue().getTicketname().contains(s)) {
                ergebnisListe.add(entry.getValue());
            }
        }
        return ergebnisListe;
    }
    public void loeschen() {
        datei.schreibe("");
    }
}
