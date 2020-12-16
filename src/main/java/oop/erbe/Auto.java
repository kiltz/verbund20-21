package oop.erbe;

public class Auto {
    private String marke;
    private int ps;

    public Auto() {

    }

    public Auto(String marke, int ps) {
        this.marke = marke;
        this.ps = ps;
    }

    public String getTyp() {
        return "Auto: "+marke+" PS: "+ps;
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public int getPs() {
        return ps;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }
}
