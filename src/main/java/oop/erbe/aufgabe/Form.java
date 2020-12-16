package oop.erbe.aufgabe;

public class Form {
    private String formart;
    private int umfang;

    public Form() {

    }

    public Form(String formart, int umfang) {
        this.formart = formart;
        this.umfang = umfang;
    }

    public String getTyp() {

        return "Form: "+formart+" Umfang: "+umfang;
    }

    public String getFormart() {

        return formart;
    }

    public void setFormart(String formart) {

        this.formart = formart;
    }

    public int getumfang() {

        return umfang;
    }

    public void setumfang(int umfang) {

        this.umfang = umfang;
    }
}
