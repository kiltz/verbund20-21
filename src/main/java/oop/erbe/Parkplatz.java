package oop.erbe;

/**
 * unser Tester
 */
public class Parkplatz {

    public static void main(String[] args) {
        Auto zoe = new Auto("ZOE", 70);
        System.out.println(zoe.getTyp());

        Cabriolet c = new Cabriolet("Alpha Romeo", 170);
        c.oeffneVerdeck();
        System.out.println(c.getTyp());

        Cabriolet c2 = new Cabriolet("Fiat", 35, true);
        System.out.println(c2.getTyp());

        Kombi k = new Kombi();
        k.setMarke("Opel");
        k.setPs(75);
        System.out.println(k.getTyp());

        Kombi k2 = new Kombi("VW", 120);
        System.out.println(k2);
    }
}
