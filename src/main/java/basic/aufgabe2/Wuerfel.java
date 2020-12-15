package basic.aufgabe2;

public class Wuerfel {
    public static void main(String[] args) {
        int[] liste = {0, 0, 0, 0, 0, 0};
        int würfelzahl = 1001;
        for (int würfelanzahl = 1; würfelanzahl < würfelzahl; würfelanzahl++) {
            double zufall = Math.random();
            if (zufall < 0.7) {
                double zufallint = zufall * 10;
                int zufallintganz = (int) zufall;
                System.out.println(zufallintganz);
            }
            else {
                würfelzahl += 1;


            }
        }
    }
}
