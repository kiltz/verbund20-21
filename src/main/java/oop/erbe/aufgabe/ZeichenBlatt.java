package oop.erbe.aufgabe;

public class ZeichenBlatt {

    public static void main(String[] args) {

        Form d1 = new Dreieck(10,20,14);
        System.out.println(d1.berechneUmfang());

        Form r1 = new Rechteck(10,20);
        System.out.println(r1.berechneUmfang());

    }
}
