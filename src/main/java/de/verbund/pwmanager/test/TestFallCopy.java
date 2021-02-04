package de.verbund.pwmanager.test;

import de.verbund.pwmanager.service.ManagerCopy;
import de.verbund.pwmanager.service.PasswortCopy;

import java.util.List;

public class TestFallCopy {
    public static void main(String[] args) throws Exception {
        ManagerCopy manager = new ManagerCopy();
        PasswortCopy p = new PasswortCopy("Facebook", "schnubselbrumm", "ganzGeheim");
        manager.neu(p);
        manager.neu(new PasswortCopy("amazon", "nobody", "keins"));
        manager.neu(new PasswortCopy("github", "kiltz", "nix"));
        manager.neu(new PasswortCopy("email", "f@kiltz.de", "keins"));

        List<PasswortCopy> liste = manager.suche("m");
        for (PasswortCopy PasswortCopy : liste ) {
            System.out.println(PasswortCopy);
        }

    }
}
