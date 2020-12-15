package basic.aufgabe2;

public class Wuerfelstatistik {
    public static void main(String[] args) {
        int[] arrayOfNumbers = new int [100000000];
        int EinsGewuerfelt = 0;
        int ZweiGewuerfelt = 0;
        int DreiGewuerfelt = 0;
        int VierGewuerfelt = 0;
        int FünfGewuerfelt = 0;
        int SechsGewuerfelt = 0;


        for(int i = 0; i < 10000; i++) {
                int zufall = (int)(Math.random()*6+1);
                if (zufall == 1){
                    EinsGewuerfelt += 1;
                }
                else if (zufall == 2){
                    ZweiGewuerfelt += 1;
                }
                else if (zufall == 3){
                    DreiGewuerfelt += 1;
                }
                else if (zufall == 4){
                    VierGewuerfelt += 1;
                }
                else if (zufall == 5){
                    FünfGewuerfelt += 1;
                }
                else if (zufall == 6){
                    SechsGewuerfelt += 1;
                }
                arrayOfNumbers[i] = zufall;

        }
        System.out.println("1: " + EinsGewuerfelt);
        System.out.println("2: " + ZweiGewuerfelt);
        System.out.println("3: " + DreiGewuerfelt);
        System.out.println("4: " + VierGewuerfelt);
        System.out.println("5: " + FünfGewuerfelt);
        System.out.println("6: " + SechsGewuerfelt);
    }
}
