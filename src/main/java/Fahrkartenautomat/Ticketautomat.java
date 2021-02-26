package Fahrkartenautomat;

import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Ticketautomat {
    private static HashMap<Integer,Ticket> availableTickets = new HashMap<>();
    public static String[] MoneyInput = {"1 Cent", "2 Cent", "5 Cent", "10 Cent", "20 Cent", "50 Cent", "1 Euro", "2 Euro", "5 Euro", "10 Euro", "20 Euro", "50 Euro"};
    public static Double[] multiplikatoren = {0.01,0.02,0.05,0.10,0.20,0.50,1.0,2.0,5.0,10.0,20.0,50.0};
    public static int[] Cash = new int[12];
    public static int[] iCashBack = new int[12];
    public static int iInput;

    public static Ticket result;
    static DecimalFormat df = new DecimalFormat("####0.00");

    public static int counter1 = 0;
    public static double total = 0;
    public static double cashback = 0;
    public static String playAgain = "j";

    public static int printableTickets = 10;
    public static int fiftyEuroInTank = 10;
    public static int twentyEuroInTank = 10;
    public static int tenEuroInTank = 10;
    public static int fiveEuroInTank = 10;
    public static int twoEuroInTank = 10;
    public static int oneEuroInTank = 10;
    public static int fiftyCentInTank = 10;
    public static int twentyCentInTank = 10;
    public static int tenCentInTank = 10;
    public static int fiveCentInTank = 10;
    public static int twoCentInTank = 10;
    public static int oneCentInTank = 10;

    public static void main(String[] args) throws Exception {
        if(printableTickets > 0) {
            while(playAgain.equals("j")) {
                ticketChoice();
                moneyInput();
                moneyCompare();
            }
        }
        else {
            System.out.println("Auser Betrieb");
        }
    }

    public static void ticketChoice() throws Exception {
        FileManager fileManager = new FileManager();
        Map<Integer, Ticket> availableTickets=fileManager.leseTickets();
        for (Ticket ticket : availableTickets.values()) {
            System.out.println(ticket.getTicketID()+". "+ticket.getTicketname()+ "\n" +"> Kostet: "+ticket.getTicketCost()+" Euro");
        }
        Scanner scannerVariable = new Scanner(System.in);
        iInput = Integer.valueOf(scannerVariable.nextLine());
        if (availableTickets.containsKey(iInput)) {
            result = availableTickets.get(iInput);
            System.out.println("Sie haben " + result.getTicketname() + " Gewaehlt, dieses Ticket Kostet " +result.getTicketCost()+" Euro \n " +
                    "Bitte Werfen sie Geld ein");
            counter1 = 1;
        }
        else {
            System.out.println("Ticket existiert nicht!");
        }
    }


    public static void moneyInput() {
        if (counter1 == 1) {
            System.out.println("Geben sie an Welche Münzen/Scheine sie einwerfen:");
            for(int i = 0; i <=11; i++)
            {
                System.out.println(MoneyInput[i]);
                Scanner scannerVariable = new Scanner(System.in);
                Cash[i] = Integer.valueOf(scannerVariable.nextLine());
                total += (multiplikatoren[i]*Cash[i]);
                System.out.println("Aktueller Stand: " + df.format(total) + " Euro");
        }
        }
    }

    public static void moneyCompare() {
        if(result.getTicketCost() > total) {
            System.out.println("Es wurde noch nicht genuegend Geld eingeworfen");
            moneyInput();
        }
        else if(result.getTicketCost() == total) {
            System.out.println("Das Ticket ist bezahlt und wird gedruckt!");
            printableTickets -= 1;
        }
        else {
            cashback = total - result.getTicketCost();
            System.out.println("Das Ticket ist bezahlt und wird gedruckt!");
            System.out.println("Rückgeld: " + df.format(cashback) + " Euro");
            printableTickets -= 1;
            cashPayoutOutput();
        }
    }

     public static void cashPayout() {
        int cashBackInCent;
        cashBackInCent = (int) Math.round(cashback * 100);
        if(fiftyEuroInTank > 0) {
            iCashBack[0] = cashBackInCent / 5000;
            fiftyEuroInTank -= cashBackInCent / 5000;
            cashBackInCent = cashBackInCent % 5000;
         }
         if(twentyEuroInTank > 0) {
             iCashBack[1] = cashBackInCent / 2000;
             twentyEuroInTank -= cashBackInCent / 2000;
             cashBackInCent = cashBackInCent % 2000;
         }
         if(tenEuroInTank > 0) {
             iCashBack[2] = cashBackInCent / 1000;
             tenEuroInTank -= cashBackInCent / 1000;
             cashBackInCent = cashBackInCent % 1000;
         }
         if(fiveEuroInTank > 0) {
             iCashBack[3] = cashBackInCent / 500;
             fiveEuroInTank -= cashBackInCent / 500;
             cashBackInCent = cashBackInCent % 500;
         }
         if(twoEuroInTank > 0) {
             iCashBack[4] = cashBackInCent / 200;
             twoEuroInTank -= cashBackInCent / 200;
             cashBackInCent = cashBackInCent % 200;
         }
         if(oneEuroInTank > 0) {
             iCashBack[5] = cashBackInCent / 100;
             oneEuroInTank -= cashBackInCent / 100;
             cashBackInCent = cashBackInCent % 100;
         }
         if(fiftyCentInTank > 0) {
             iCashBack[6] = cashBackInCent / 50;
             fiftyCentInTank -= cashBackInCent / 50;
             cashBackInCent = cashBackInCent % 50;
         }
         if(twentyCentInTank > 0) {
             iCashBack[7] = cashBackInCent / 20;
             twentyCentInTank -= cashBackInCent / 20;
             cashBackInCent = cashBackInCent % 20;
         }
         if(tenCentInTank > 0) {
             iCashBack[8] = cashBackInCent / 10;
             tenCentInTank -= cashBackInCent / 10;
             cashBackInCent = cashBackInCent % 10;
         }
         if(fiveCentInTank > 0) {
             iCashBack[9] = cashBackInCent / 5;
             fiveCentInTank -= cashBackInCent / 5;
             cashBackInCent = cashBackInCent % 5;
         }
         if(twoCentInTank > 0) {
             iCashBack[10] = cashBackInCent / 2;
             twoCentInTank -= cashBackInCent / 2;
             cashBackInCent = cashBackInCent % 2;
         }
         if(oneCentInTank > 0) {
             iCashBack[11] = cashBackInCent / 1;
             oneCentInTank -= cashBackInCent / 1;
             cashBackInCent = cashBackInCent % 1;
         }
     }

     public static void cashPayoutOutput() {
        cashPayout();
        for(int i=0, e = 11; i < 12; i++, e--){
            System.out.println(MoneyInput[e] + ": " + iCashBack[i]);
        }
        cashback = 0;
        total = 0;
        System.out.println("Weiteres Ticket kaufen? (j/n)");
        Scanner scannerVariable = new Scanner(System.in);
        playAgain = scannerVariable.nextLine();
     }
}
