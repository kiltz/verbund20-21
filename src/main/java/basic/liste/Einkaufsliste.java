package basic.liste;

public class Einkaufsliste {

    private String[] liste;
    private int index = 0;

    public Einkaufsliste() {
        liste = new String[3];
    }

    public void add(String element) {
        if ( index == liste.length) {
            String[] neueListe = new String[liste.length + 3];
            for (int i = 0; i < liste.length; ++i ){
                neueListe[i] = liste[i];
            }
            liste = neueListe;
        }
        liste[index] = element;
        index++;
    }

    public String print() {
        String ret = "";
        for (String s : liste) {
            if (s != null) {
                ret += s + "\n";
            }
        }
        return ret;
    }
}