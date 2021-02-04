package de.verbund.pwmanager.test;

import basic.liste.pwmanager.Manager;
import basic.liste.pwmanager.Passwort;

import java.util.List;

public class TestFall {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();
        Passwort p = new Passwort("Facebook", "schnubselbrumm", "ganzGeheim");
        manager.neu(p);
        manager.neu(new Passwort("amazon", "nobody", "keins"));
        manager.neu(new Passwort("github", "kiltz", "nix"));
        manager.neu(new Passwort("email", "f@kiltz.de", "keins"));

        List<Passwort> liste = manager.suche("amazon");
        for (Passwort passwort : liste ) {
            System.out.println(passwort);
        }

    }
}
