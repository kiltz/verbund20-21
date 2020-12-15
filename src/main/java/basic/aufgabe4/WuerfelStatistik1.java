package basic.aufgabe4;

import java.util.Random;

public class WuerfelStatistik1 {
    private static Random rand = new Random();

    public static void main(String[] args) {
        int num = 0;
        int[] die = new int[7];
        int[] die2 = new int[7];
        for (int i = 1; i <= 1000; i++) {
            for (int n = 1; n < die.length; n++) {
                if (n == num) {
                    die[n] += 1;
                }
            }
        }
        System.out.printf("Zahl" , " Haeufigkeit");
        }


}