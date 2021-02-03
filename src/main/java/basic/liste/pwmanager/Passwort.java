package basic.liste.pwmanager;

public class Passwort {
    private String name;
    private String benutzername;
    private String mail;
    private String passwort;


    public Passwort() {
    }

    public Passwort(String name, String benutzername, String mail, String passwort) {
        this.name = name;
        this.benutzername = benutzername;
        this.mail = mail;
        this.passwort = passwort;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBenutzername() {
        return benutzername;
    }

    public void setBenutzername(String benutzername) {
        this.benutzername = benutzername;
    }

    public String getPasswort() {
        return passwort;
    }

    public void setPasswort(String passwort) {
        this.passwort = passwort;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(){
        this.mail = mail;
    }

    @Override
    public String toString() {
        return "Passwort{" +
                "name='" + name + '\'' +
                ", benutzername='" + benutzername + '\'' +
                ", mail='" + mail + '\'' +
                ", passwort='" + passwort + '\'' +
                '}';
    }

}
