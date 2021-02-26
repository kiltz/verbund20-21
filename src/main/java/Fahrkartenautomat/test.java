package Fahrkartenautomat;

import de.verbund.pwmanager.service.Passwort;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

public class test {
    public static void main(String[] args) throws Exception {
        FileManager filemanager = new FileManager();
        Speicher speicher1 = new Speicher(1,10);
        filemanager.neuSpeicher(speicher1);

        Map<Integer, Speicher> foundlist2=filemanager.leseSpeicher();
        System.out.println(foundlist2.values());
        for(Speicher speicher: foundlist2.values()) {
            System.out.println(speicher.getSpeicherID() + ";" + speicher.getSpeicherValue());
        }

    }
}

