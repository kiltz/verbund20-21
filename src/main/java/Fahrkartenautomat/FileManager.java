package Fahrkartenautomat;

import de.verbund.pwmanager.utils.Datei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FileManager {
    private final Datei datei;
    private final Datei datei2;
    private Map<Integer, Ticket> tickets;
    private Map<Integer, Speicher> speicher;

    public FileManager() {
        datei2 = new Datei("speicher.csv");
        datei = new Datei("tickets.csv");
        tickets = leseTickets();
        speicher= leseSpeicher();

    }

    public Map<Integer, Ticket> leseTickets() {
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

    public void neuTicket(Ticket t) throws Exception {
        // Validierung
        tickets.put(t.getTicketID(), t);
        String satz = t.getTicketID() + ";" + t.getTicketname() + ";" + String.valueOf(t.getTicketCost()) + "\n";
        datei.schreibe(satz, true);
    }

    public void neuSpeicher(Speicher s) throws Exception {
        // Validierung
        speicher.put(s.getSpeicherID(), s);
        String satz = s.getSpeicherID() + ";" + s.getSpeicherValue() + "\n";
        datei2.schreibe(satz, true);

    }

    public List<Ticket> suche(String s) {
        tickets = leseTickets();
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

    public Map<Integer, Speicher> leseSpeicher() {
        Map<Integer, Speicher> liste = new HashMap<>();
        try {
            String inhalt = datei2.lese();
            String[] saetze = inhalt.split("\n");
            for (String satz : saetze) {
                String[] teile = satz.split(";");
                if (teile.length == 2) {
                    liste.put(Integer.valueOf(teile[0]), new Speicher(Integer.valueOf(teile[0]), Integer.valueOf(teile[1])));
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return liste;
    }
}

