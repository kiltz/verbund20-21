package basic.Übung_Geldautomat;

import Fahrkartenautomat.Ticket;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Geldautomat {
    public static eckarte ECKarte1 = new eckarte(1, 1, 100,"2021-23-21");
    public static int kontonummer;
    public static int konto;
    public static List<eckarte> eckarten = new ArrayList<eckarte>();


    public static void main(String[] args) {
        eckarten.add(ECKarte1);
        Karteeinlesen();
        for(int i=0; i<eckarten.size(); i++) {
            if(eckarten.get(i).getKontonummer() == kontonummer-1) {
                Gueltigkeitsdatum_prüfen();
                konto = i;
            }
        }

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

        try {
                    SimpleDateFormat dateFormat = new
                            SimpleDateFormat ("yyyy-MM-dd");
                    Date date1 = dateFormat.parse(eckarten.get(konto).getGültigkeitsdatum());
                    Date date2 = dateFormat.parse("2022-01-01");

                    if(date1.before(date2)){
                        System.out.println(
                                "Date-1 is before Date-2");
                    }
        } catch (ParseException ex) {
                }
            }
}



