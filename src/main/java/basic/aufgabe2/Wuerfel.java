package basic.aufgabe2;

public class Wuerfel {
    public static void main(String[] args) {
        int[] liste = {};
        int würfelzahl = 1001;
        for (int würfelanzahl = 1; würfelanzahl < würfelzahl; würfelanzahl++) {
            double zufall = Math.random();
            if (zufall < 0.7) {
                int zufallint = (int) zufall;
                liste.add(zufallint);
            }
            else {
                würfelzahl += 1;


            }
        }
    }
}
