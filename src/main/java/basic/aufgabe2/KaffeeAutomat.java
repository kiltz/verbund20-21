package basic.aufgabe2;

public class KaffeeAutomat {

    public static void main(String[] args) {
        // Angenommen: Ein Kaffee kostet 30 Cent,
        int preis = 80;
        // wir werfen eine 2-Euro Münze in den Automat
        int gegeben = 500;
        // Welche Münzen bekommen wir als Rückgeld?
        int rueckgeld = gegeben - preis;
        // 1. definiere den Preis und das gezahlte Geld am Anfang der Methode

        // 2. Ermittle mit Hilfe von Modulo die Anzahl der einzelnen
        // 		Münzen und arbeite mit dem Rest weiter.
        int countEuro = 0;
        int countFuenfzig = 0;
        int countZwanzig = 0;
        int countZehn = 0;
        int countFuenf = 0;

        if (rueckgeld / 100 >= 1) {
            countEuro += Math.floor(rueckgeld / 100);
            rueckgeld %= 100;
        }
        if (rueckgeld / 50 >= 1) {
            countFuenfzig += Math.floor(rueckgeld / 50);
            rueckgeld %= 50;
        }
        if (rueckgeld / 20 >= 1) {
            countZwanzig += Math.floor(rueckgeld / 20);
            rueckgeld %= 20;
        }
        if (rueckgeld / 10 >= 1) {
            countZehn += Math.floor(rueckgeld / 10);
            rueckgeld %= 10;
        }
        if (rueckgeld / 5 >= 1) {
            countFuenf += Math.floor(rueckgeld / 5);
            rueckgeld %= 5;
        }

        System.out.println("Euro: " + countEuro + ", 50ct: " + countFuenfzig + ", 20ct: " + countZwanzig + ", 10ct: " + countZehn + ", 5ct: " + countFuenf);
        // 3. Vereinfache die Lösung mit Schleifen
        countEuro = 0;
        countFuenfzig = 0;
        countZwanzig = 0;
        countZehn = 0;
        countFuenf = 0;
        rueckgeld = gegeben - preis;

        while (rueckgeld > 0) {
            if (rueckgeld / 100 >= 1) {
                countEuro += Math.floor(rueckgeld / 100);
                rueckgeld %= 100;
            } else if (rueckgeld / 50 >= 1) {
                countFuenfzig += Math.floor(rueckgeld / 50);
                rueckgeld %= 50;
            } else if (rueckgeld / 20 >= 1) {
                countZwanzig += Math.floor(rueckgeld / 20);
                rueckgeld %= 20;
            } else if (rueckgeld / 10 >= 1) {
                countZehn += Math.floor(rueckgeld / 10);
                rueckgeld %= 10;
            } else if (rueckgeld / 5 >= 1) {
                countFuenf += Math.floor(rueckgeld / 5);
                rueckgeld %= 5;
            }

        }
        System.out.println("Euro: " + countEuro + ", 50ct: " + countFuenfzig + ", 20ct: " + countZwanzig + ", 10ct: " + countZehn + ", 5ct: " + countFuenf);

    }

}