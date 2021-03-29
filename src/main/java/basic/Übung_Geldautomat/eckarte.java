package basic.Übung_Geldautomat;

public class eckarte {
    private int kartennummer;
    private int bankleitzahl;
    private int kontonummer;
    private int geheimzahl;
    private int dailyLimit;
    private int gotToday;
    private int kontostand;
    private String gültigkeitsdatum;

    public eckarte(int kartennummer, int bankleitzahl, int kontonummer, String gültigkeitsdatum, int geheimzahl, int dailyLimit, int kontostand, int gotToday) {
        this.kartennummer = kartennummer;
        this.bankleitzahl = bankleitzahl;
        this.kontonummer = kontonummer;
        this.geheimzahl = geheimzahl;
        this.dailyLimit = dailyLimit;
        this.kontostand = kontostand;
        this.gotToday = gotToday;
        this.gültigkeitsdatum = gültigkeitsdatum;
    }

    public int getKontostand() {
        return kontostand;
    }

    public void setKontostand(int kontostand) {
        this.kontostand = kontostand;
    }

    public int getGotToday() {
        return gotToday;
    }

    public void setGotToday(int gotToday) {
        this.gotToday = gotToday;
    }

    public int getDailyLimit() {
        return dailyLimit;
    }

    public void setDailyLimit(int dailyLimit) {
        this.dailyLimit = dailyLimit;
    }

    public int getGeheimzahl() {
        return geheimzahl;
    }

    public void setGeheimzahl(int geheimzahl) {
        this.geheimzahl = geheimzahl;
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
