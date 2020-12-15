package basic.Aufgabe2;

public class CaffeAutomat {
        public static void main(String[] args) {
                int preis = 45;
                int gegeben = 100;

                int rest = gegeben - preis;
                System.out.println("Rückgeld "+rest);

                int anzahl = rest / 100;
                rest = rest % 100;
                System.out.println(anzahl + " 1-Euro-Münzen (Rest: " + rest + ")");

                anzahl = rest / 50;
                rest = rest % 50;
                System.out.println(anzahl + " 50-Cent-Münzen (Rest: " + rest + ")");

                anzahl = rest / 20;
                rest = rest % 20;
                System.out.println(anzahl + " 20-Cent-Münzen (Rest: " + rest + ")");

                anzahl = rest / 10;
                rest = rest % 10;
                System.out.println(anzahl + " 10-Cent-Münzen (Rest: " + rest + ")");

                anzahl = rest / 5;
                rest = rest % 5;
                System.out.println(anzahl + " 5-Cent-Münzen (Rest: " + rest + ")");

                anzahl = rest / 2;
                rest = rest % 2;
                System.out.println(anzahl + " 5-Cent-Münzen (Rest: " + rest + ")");

                anzahl = rest / 1;
                rest = rest % 1;
                System.out.println(anzahl + " 5-Cent-Münzen (Rest: " + rest + ")");

        }
    }


