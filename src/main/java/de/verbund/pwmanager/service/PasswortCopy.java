package de.verbund.pwmanager.service;

public class PasswortCopy {
    private String name;
    private String benutzername;
    private String passwort;

    public PasswortCopy() {
    }

    public PasswortCopy(String name, String benutzername, String passwort) {
        this.name = name;
        this.benutzername = benutzername;
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

    @Override
    public String toString() {
        return "Passwort{" +
                "name='" + name + '\'' +
                ", benutzername='" + benutzername + '\'' +
                ", passwort='" + passwort + '\'' +
                '}';
    }
}
