package Fahrkartenautomat;

public class Speicher {
    private int speicherID;
    private int speicherValue;

    public Speicher() {

    }

    public Speicher(int SpeicherID, int SpeicherValue) {
        this.speicherID = SpeicherID;
        this.speicherValue = SpeicherValue;
    }

    public int getSpeicherID() {
        return speicherID;
    }

    public void setSpeicherID(int speicherID) {
        this.speicherID = speicherID;
    }

    public int getSpeicherValue() {
        return speicherValue;
    }

    public void setSpeicherValue(int speicherValue) {
        this.speicherValue = speicherValue;
    }
/*
    @Override
    public String toString() {
        return "Speicher{" + "ID='" + speicherID + '\'' + ", Value='" + speicherValue + '\'' + '}';
    }


 */
}
