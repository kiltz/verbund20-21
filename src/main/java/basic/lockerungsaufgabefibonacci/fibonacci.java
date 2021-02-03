package basic.lockerungsaufgabefibonacci;

public class fibonacci {
    public static void main(String[] args) {
        int z1 = 0, z2 = 1, zahl;
        for (int i = 0; i < 100; i++) {
            zahl = z2 + z1;
            if ( zahl <= 100 && zahl >= 0) {
                System.out.println("Nummer: " + i + " - " + zahl);
            }
            z1 = z2;
            z2 = zahl;
        }
    }
}