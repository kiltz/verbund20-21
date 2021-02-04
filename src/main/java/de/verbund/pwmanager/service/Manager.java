package de.verbund.pwmanager.service;

import basic.liste.pwmanager.Passwort;
import utils.Datei;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Manager {
    private final Datei datei;
    private Map<String, Passwort> datensaetze;

    public Manager() {
        datei =new Datei("passwd.txt");
        datensaetze = lese();

    }

    private Map<String,Passwort> lese() {
        Map<String,Passwort> liste = new HashMap<>();
        try {
            String inhalt = datei.lese();
            String[] saetze = inhalt.split("\n");
            for (String satz : saetze) {
                String[] teile = satz.split(";");
                liste.put(teile[0], new Passwort(teile[0], teile[1], teile[2]));
            }

        } catch (Exception e) {
            // dann ist die halt nicht da!
        }
        return liste;
    }

    public void neu(Passwort p) throws Exception {
        // Validierung
        datensaetze.put(p.getName(), p);
        String satz =p.getName()+";"+p.getBenutzername()+";"+p.getPasswort()+"\n";
        datei.schreibe(satz, true);
    }

    public List<Passwort> suche(String s) {
        List<Passwort> ergebnisListe = new ArrayList<>();
        for (Map.Entry<String, Passwort> entry : datensaetze.entrySet()) {
            if (entry.getValue().getName().contains(s)) {
                ergebnisListe.add(entry.getValue());
            }
        }
        return ergebnisListe;
    }
}
