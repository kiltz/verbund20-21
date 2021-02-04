package de.verbund.pwmanager.service;

import de.verbund.pwmanager.utils.DateiCopy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ManagerCopy {
    private final DateiCopy datei;
    private Map<String, PasswortCopy> datensaetze;

    public ManagerCopy() {
        datei =new DateiCopy("passwd.txt");
        datensaetze = lese();

    }

    private Map<String,PasswortCopy> lese() {
        Map<String,PasswortCopy> liste = new HashMap<>();
        try {
            String inhalt = datei.lese();
            String[] saetze = inhalt.split("\n");
            for (String satz : saetze) {
                String[] teile = satz.split(";");
                liste.put(teile[0], new PasswortCopy(teile[0], teile[1], teile[2]));
            }

        } catch (Exception e) {
            // dann ist die halt nicht da!
        }
        return liste;
    }

    public void neu(PasswortCopy p) throws Exception {
        // Validierung
        datensaetze.put(p.getName(), p);
        String satz =p.getName()+";"+p.getBenutzername()+";"+p.getPasswort()+"\n";
        datei.schreibe(satz, true);
    }

    public List<PasswortCopy> suche(String s) {
        List<PasswortCopy> ergebnisListe = new ArrayList<>();
        for (Map.Entry<String, PasswortCopy> entry : datensaetze.entrySet()) {
            if (entry.getValue().getName().contains(s)) {
                ergebnisListe.add(entry.getValue());
            }
        }
        return ergebnisListe;
    }
}
