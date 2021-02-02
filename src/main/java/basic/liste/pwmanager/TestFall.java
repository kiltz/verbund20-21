package basic.liste.pwmanager;

import java.util.List;

public class TestFall {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Passwort p = new Passwort("Facebook", "schnubselbrumm", "ganzGeheim");
        manager.neu(p);
        manager.neu(new Passwort("amazon", "nobody", "keins"));
        manager.neu(new Passwort("github", "kiltz", "nix"));
        manager.neu(new Passwort("email", "f@kiltz.de", "keins"));

        List<Passwort> liste = manager.suche("m");
        for (Passwort passwort : liste ) {
            System.out.println(passwort);
        }

    }
}
