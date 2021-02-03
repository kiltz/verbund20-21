package basic.liste.pwmanager;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private List<Passwort> datensaetze;

    public Manager() {
        datensaetze = new ArrayList<>();
    }

    public void neu(Passwort p) {
        // Validierung
        datensaetze.add(p);
    }

    public List<Passwort> suche(String s) {
        List<Passwort> ergebnisListe = new ArrayList<>();
        for (Passwort p : datensaetze) {
            if (p.getName().contains(s)) {
                ergebnisListe.add(p);
            }
        }
        return ergebnisListe;
    }
}
