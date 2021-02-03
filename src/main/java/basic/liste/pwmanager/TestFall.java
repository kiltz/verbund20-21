package basic.liste.pwmanager;

import java.util.List;

public class TestFall {
    public static void main(String[] args) throws Exception {
        Manager manager = new Manager();
        Passwort p = new Passwort("Facebook", "schnubselbrumm", "ganzGeheim", "abc");
        manager.neu(p);
        manager.neu(new Passwort("amazon", "nobody", "keins", "sadf"));
        manager.neu(new Passwort("amazon", "nobody", "keins", "sadf"));
        manager.neu(new Passwort("amazon", "nobody", "keins", "sadf"));

        List<Passwort> liste = manager.suche("m");
        for (Passwort passwort : liste ) {
            System.out.println(passwort);
        }

    }
}
