package oop.basic;

import java.util.ArrayList;
import java.util.List;

public class Virus {
    //Instanzvariable
    long nr = 0;
    // Klassenvariable
    static long anzahl = 0;

    static List<Virus> liste = new ArrayList<>();

    // Constructor (Geburtshelfer)
    public Virus() {
        anzahl++;
        nr = anzahl;
    }

    // Destructor (Totengräber, normalerweise uninteressant für uns)
    @Override
    protected void finalize() throws Throwable {
        System.out.print(anzahl+"/"+nr+",");
    }

    public static void main(String[] args) {
        while (true) {
            Virus v = new Virus();
            liste.add(v);
            System.out.println(liste.size());
            System.out.println(v.nr);
            System.out.println(anzahl);
        }
    }
}
