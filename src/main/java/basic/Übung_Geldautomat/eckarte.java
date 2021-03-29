package basic.Übung_Geldautomat;

public class eckarte {
    private int kartennummer;
    private int bankleitzahl;
    private int kontonummer;
    private String gültigkeitsdatum;

    public eckarte(int kartennummer, int bankleitzahl, int kontonummer, String gültigkeitsdatum) {
        this.kartennummer = kartennummer;
        this.bankleitzahl = bankleitzahl;
        this.kontonummer = kontonummer;
        this.gültigkeitsdatum = gültigkeitsdatum;
    }

    public int getKartennummer() {
        return kartennummer;
    }

    public void setKartennummer(int kartennummer) {
        this.kartennummer = kartennummer;
    }

    public int getBankleitzahl() {
        return bankleitzahl;
    }

    public void setBankleitzahl(int bankleitzahl) {
        this.bankleitzahl = bankleitzahl;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer) {
        this.kontonummer = kontonummer;
    }

    public String getGültigkeitsdatum() {
        return gültigkeitsdatum;
    }

    public void setGültigkeitsdatum(String gültigkeitsdatum) {
        this.gültigkeitsdatum = gültigkeitsdatum;
    }
}
