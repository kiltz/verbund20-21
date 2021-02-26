package oop.erbe;

public class Kombi extends oop.erbe.Auto {

    public Kombi() {
    }

    public Kombi(String marke, int ps) {
        super(marke, ps);
    }

    @Override
    public String getTyp() {
        return super.getTyp() + " ist ein Kombi";
    }
}
