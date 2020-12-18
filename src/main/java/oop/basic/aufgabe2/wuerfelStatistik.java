package oop.basic.aufgabe2;

public class wuerfelStatistik {
    public static void main(String[] args) {
        int max = 6;
        int min = 1;
        int range = max - min +1;
        int anz1 = 0;
        int anz2 = 0;
        int anz3 = 0;
        int anz4 = 0;
        int anz5 = 0;
        int anz6 = 0;

        double timeNeeded = 0;
        int[] alleZahlen = new int[10000];
        for(int i = 0; i < 10000; i++){
            int zufall = (int) (Math.random() *range) +min;
            alleZahlen[i] = zufall;
            if(zufall == 1){
                anz1++;
            }
            else if(zufall == 2){
                anz2++;
            }
            else if(zufall == 3){
                anz3++;
            }
            else if(zufall == 4){
                anz4++;
            }
            else if(zufall == 5){
                anz5++;
            }
            else{
                anz6++;
            }
        }
        timeNeeded=System.currentTimeMillis();


        System.out.println("Anzahl 1: " + anz1 +
                           " Anzahl2: " + anz2 +
                           " Anzahl3: " + anz3 +
                           " Anzahl4: " + anz4 +
                           " Anzahl5: " + anz5 +
                           " Anzahl6: " + anz6);
        System.out.println(timeNeeded);
    }
}
