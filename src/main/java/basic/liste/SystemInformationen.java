package basic.liste;

import javafx.application.Application;
import java.io.File;



public abstract class SystemInformationen extends Application {

    public static void main(String[] args) {
        System.out.println("Verfügbare Prozessoren (Kerne): " +
                Runtime.getRuntime().availableProcessors());


        System.out.println("Freier Speicher (Bytes): " +
                Runtime.getRuntime().freeMemory());

        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximaler Speicher (Bytes): " +
                (maxMemory == Long.MAX_VALUE ? "Es gibt kein Limit" : maxMemory));

        System.out.println("Gesamtspeicher(Bytes):: " +
                Runtime.getRuntime().totalMemory());

        File[] roots = File.listRoots();


        //für jedes Laufwerk was man hat
        for (File root : roots) {
            System.out.println("Dateisystem-Root: " + root.getAbsolutePath());
            System.out.println("Gesamtspeicherplatz (Bytes): " + root.getTotalSpace());
            System.out.println("Freier Speicherplatz (Bytes): " + root.getFreeSpace());
            System.out.println("Nutzbarer Speicherplatz (Bytes): " + root.getUsableSpace());
        }
    }
}