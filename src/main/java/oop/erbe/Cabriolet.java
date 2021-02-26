package oop.erbe;

public class Cabriolet extends oop.erbe.Auto {

    private boolean verdeckOffen = false;
    public Cabriolet(String marke, int ps) {
        super(marke, ps);
    }

    public Cabriolet(String marke, int ps, boolean verdeckOffen) {
        super(marke, ps);
        this.verdeckOffen = verdeckOffen;
    }

    public void oeffneVerdeck() {
        verdeckOffen = true;
        System.out.println("Öffne das Verdeck");
    }

    @Override
    public String getTyp() {
        return super.getTyp()+ " Verdeck offen: "+verdeckOffen;
    }
}
