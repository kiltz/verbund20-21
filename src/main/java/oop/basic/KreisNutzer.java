package oop.basic;

public class KreisNutzer {

    public static void main(String[] args) {
        // erzeuge ein Objekt der Klasse Kreis
        Kreis k1 = new Kreis();
        // weise einer Eigenschaft (radius) einen Wert zu
        try {
            k1.setRadius(10);
        } catch (Exception e) {
            System.out.println("Fehler aufgetreten: "+e.getMessage());
        }
        // Nutze eine Methode des Objektes
        double umfang = k1.berechneUmfang();
        System.out.println(umfang);


        Kreis k2 = k1;
        try {
            k2.setRadius(-15);
        } catch (Exception e) {
            System.out.println("Habe Execption bekommen, was richtig ist!");
        }
        // immer noch 10 ist!
        System.out.println(k2.getRadius());

        Kreis k3 = null;
//        k3.berechneUmfang();

        int zahl = 5;
        Kreis k4 = new Kreis(zahl);
        System.out.println(k4.berechneUmfang());



    }
}