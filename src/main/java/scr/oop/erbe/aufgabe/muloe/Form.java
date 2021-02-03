package oop.erbe.aufgabe.muloe;

public abstract class Form {

    /**
     * Berechnet den Umfang entsprechend der Form.
     * @return
     */
    public abstract int berechneUmfang();

    @Override
    public String toString() {
        return "Form";
    }
}
