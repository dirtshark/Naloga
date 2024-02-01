package main.database.entities;

public class Kupec {
    private String uuid;
    private String ime;
    private String priimek;
    private String emso;
    private String davcna;

    public Kupec() {
    }

    public Kupec(String uuid, String ime, String priimek, String emso, String davcna) {
        this.uuid = uuid;
        this.ime = ime;
        this.priimek = priimek;
        this.emso = emso;
        this.davcna = davcna;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPriimek() {
        return priimek;
    }

    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    public String getEmso() {
        return emso;
    }

    public void setEmso(String emso) {
        this.emso = emso;
    }

    public String getDavcna() {
        return davcna;
    }

    public void setDavcna(String davcna) {
        this.davcna = davcna;
    }
}
