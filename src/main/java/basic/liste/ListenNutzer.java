package basic.liste;

public class ListenNutzer {

    public static void main(String[] args) {
        Einkaufsliste2 liste = new Einkaufsliste2();
        liste.add("Käse");
        liste.add("Milch");
        liste.add("Brot");
        liste.add("Chips");

        System.out.println(liste.print());

    }
}