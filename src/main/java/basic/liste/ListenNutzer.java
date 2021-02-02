package basic.liste;

public class ListenNutzer {
    public static void main(String[] args) {
        Einkaufsliste liste = new Einkaufsliste();
        liste.add("Milch");
        liste.add("Käse");
        liste.add("Brot");
        liste.add("Chips");

        System.out.println(liste.print());
    }
}
