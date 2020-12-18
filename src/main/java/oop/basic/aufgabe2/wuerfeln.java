package oop.basic.aufgabe2;

public class wuerfeln {
    public static void main(String[] args) {

        int max = 6;
        int min = 1;
        int range = max - min + 1;
        int durchlaeufe = 10000;
        long timeStart = System.currentTimeMillis();

        int[] anzahlZahlen = {0,0,0,0,0,0};
        for (int i = 0; i < durchlaeufe; i++) {
            int zufall = (int) (Math.random() * range) + min;
            anzahlZahlen[zufall-1]++;
        }
        long timeEnd = System.currentTimeMillis();
        long timeNeeded = timeEnd - timeStart;


        for(int i = 0; i < 6; i++){
            System.out.println(anzahlZahlen[i]);
        }
        System.out.println(timeNeeded);

    }
}
