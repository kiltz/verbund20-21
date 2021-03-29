package basic.Übung_Geldautomat;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;


public class Geldautomat {
    public static eckarte ECKarte1 = new eckarte(1, 1, 100, "2021-12-23", 1234, 1500, 5000, 0);
    public static eckarte ECKarte2 = new eckarte(2, 1, 200, "2021-12-23", 1234, 1500, 5000, 1300);
    public static eckarte ECKarte3 = new eckarte(3, 1, 300, "2021-12-23", 1234, 1500, 5000, 1500);
    public static eckarte ECKarte4 = new eckarte(4, 1, 400, "2021-12-23", 1234, 1500, 400, 0);
    public static eckarte ECKarte5 = new eckarte(5, 1, 500, "2020-12-23", 1234, 1500, 5000, 0);
    public static int kontonummer;
    public static int konto;
    public static int geheimzahl;
    public static int gewuenschterBetrag;
    public static int geldSpeicher = 10000;
    public static List<eckarte> eckarten = new ArrayList<eckarte>();
    public static boolean keepGoing = true;
    public static int zaehler = 0;


    public static void main(String[] args) {
        do {
            eckarten.add(ECKarte1);
            eckarten.add(ECKarte2);
            eckarten.add(ECKarte3);
            eckarten.add(ECKarte4);
            eckarten.add(ECKarte5);
            Karteeinlesen();
            for (int i = 0; i < eckarten.size(); i++) {
                if (eckarten.get(i).getKontonummer() == kontonummer) {
                    Gueltigkeitsdatum_prüfen();
                    konto = i;
                }
            }
        } while(keepGoing == true);

    }

    public static void Karteeinlesen() {
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("                     Bitte Karte einführen                        ");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Kontonummer:");
        Scanner scannerVariable = new Scanner(System.in);
        kontonummer = Integer.valueOf(scannerVariable.nextLine());
    }

    public static void Gueltigkeitsdatum_prüfen() {

        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter df;
        df = DateTimeFormatter.ISO_LOCAL_DATE;
        if(DateCompare.isBefore(now.format(df), eckarten.get(konto).getGültigkeitsdatum()) == true) {
            geheimzahl();
        }
        else {
            System.out.println("Die Karte ist nicht mehr gültig");
            System.out.println("--Die Karte wird ausgegeben--");
        }
    }

    public static void geheimzahl() {
        while(zaehler <= 3) {
            System.out.println("Bitte Geheimzahl(XXXX) eingeben ");
            Scanner scannerVariable = new Scanner(System.in);
            geheimzahl = Integer.valueOf(scannerVariable.nextLine());
            if (geheimzahl == eckarten.get(konto).getGeheimzahl()) {
                dailyLimitChecker();
                break;
            }
            else {
                System.out.println("Geheimzahl ist falsch!");
                zaehler +=1;
            }
            if(zaehler == 3) {
                System.out.println("Sie haben die Geheimzahl dreimal falsch eingegen!");
                System.out.println("Die Karte wird eingezogen");
                System.out.println("--Karte einbehalten--");
                zaehler = 4;
                keepGoing = false;
                break;
            }
        }
    }

    public static void dailyLimitChecker() {
        if(eckarten.get(konto).getGotToday() < eckarten.get(konto).getDailyLimit()) {
            betragWaehlenUndAusgeben();
        }
        else {
            System.out.println("Ihr Tageslimit von 1.500 Euro ist erreicht");
            System.out.println("--Karte ausgeben--");
        }

    }

    public static void betragWaehlenUndAusgeben() {
        String again;
        System.out.println("Bitte Betrag waehlen ");
        Scanner scannerVariable = new Scanner(System.in);
        gewuenschterBetrag = Integer.valueOf(scannerVariable.nextLine());
        if(gewuenschterBetrag + eckarten.get(konto).getGotToday() <= eckarten.get(konto).getDailyLimit()) {
            if(gewuenschterBetrag <= eckarten.get(konto).getKontostand()) {
                if(gewuenschterBetrag <= geldSpeicher) {
                    System.out.println("--Gewuenschter Betrag von " + gewuenschterBetrag + " Euro wird ausgegeben--");
                    eckarten.get(konto).setKontostand(eckarten.get(konto).getKontostand()-gewuenschterBetrag);
                    eckarten.get(konto).setGotToday(eckarten.get(konto).getGotToday()+gewuenschterBetrag);
                    System.out.println("Noch etwas abheben? (J/N)");
                    Scanner scannerVariable2 = new Scanner(System.in);
                    again = scannerVariable2.nextLine();
                    if(again.equals("j") || again.equals("J")) {
                        keepGoing = true;
                    }
                    else {
                        System.out.println("--Karte ausgeben--");
                        zaehler = 4;
                        keepGoing = false;
                    }
                }
                else{
                    System.out.println("-----------------AUSER BETRIEB-----------------");
                }
            }
            else {
                System.out.println("Der Gewaehlte Betrag uebersteigt Ihren Kontostand");
                System.out.println("--Karte ausgeben--");
            }
        }
        else {
            System.out.println("Der Betrag ist zu hoch, ihr Tageslimit waere ueberzogen");
            System.out.println("--Karte ausgeben--");
        }
    }
}




