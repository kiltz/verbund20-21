package basic;

public class Anweisungen {
    public static void main(String[] args) {
        int stunde = 15;

        boolean norddeutsch = true;
        if (stunde < 12 && !norddeutsch) {
            System.out.println("Guten Morgen");
        } else if(stunde == 12) {
            System.out.println("Mahlzeit!");
        } else {
            System.out.println("Tach!");
        }

        if (!(stunde == 15) && stunde < 21) {

        }

        // < <= == >= > !=
        // && und
        // || oder
        // ! nicht

        int zahl = 2;
        if (zahl < 2 && ++zahl != 3) {
            System.out.println("tu was");
        }
        System.out.println(zahl);

<<<<<<<<< Temporary merge branch 1
        int monat = 6;
        switch (monat) {
            case 1:
=========
        int monat = 1;
        switch (monat) {
            case 1:
                System.out.println("Januar");
>>>>>>>>> Temporary merge branch 2
            case 2:
                System.out.println("Winter");
                break;
            case 3:
                System.out.println("Frühling");
                break;
            case 6:
                System.out.println("Sommer");
                break;
            default:
                System.out.println("Keine Ahnung");
        }

        for (int i = 1; i <= 10; i++) {
<<<<<<<<< Temporary merge branch 1
            System.out.println(i +": "+ (i*i));
=========
            int q = i * i;
            System.out.println(i +": "+ q);
>>>>>>>>> Temporary merge branch 2
        }
        System.out.println("nun mit while");
        int i = 1;
        while ( i <= 10) {
            System.out.println(i +": "+ (i*i));
            i++;
        }

        do {
            System.out.println(i +": "+ (i*i));
            i++;

        } while (i <= 10);

        int[] zahlen = new int[5];
        zahlen[0] = 100;
        zahlen[1] = 50;
        zahlen[2] = 20;
        zahlen[3] = 10;
        zahlen[4] = 5;

        int [] zahlen2 = {100,50,20,10,5};

        for (int j : zahlen2) {
            System.out.println(j );
        }


    }
}
