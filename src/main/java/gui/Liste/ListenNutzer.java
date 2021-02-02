package gui.Liste;

import basic.liste.Einkaufsliste2;

public class ListenNutzer {

    public static void main(String[] args) {
        basic.liste.Einkaufsliste2 liste = new Einkaufsliste2();
        liste.add("Käse");
        liste.add("Milch");
        liste.add("Brot");
        liste.add("Chips");

        System.out.println(liste.print());

    }
}

