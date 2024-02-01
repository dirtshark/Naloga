package main.database.entities;

public class Naslov {
    private String naziv;
    private String ustanova;
    private String ime;
    private String priimek;
    private String ulica;
    private int hisna_st;
    private int postna_st;
    private String posta;
    private String kraj;
    private String drzava;
    private boolean privzet;
    private int id_kupec;

    public Naslov() {
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getUstanova() {
        return ustanova;
    }

    public void setUstanova(String ustanova) {
        this.ustanova = ustanova;
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

    public String getUlica() {
        return ulica;
    }

    public void setUlica(String ulica) {
        this.ulica = ulica;
    }

    public int getHisna_st() {
        return hisna_st;
    }

    public void setHisna_st(int hisna_st) {
        this.hisna_st = hisna_st;
    }

    public int getPostna_st() {
        return postna_st;
    }

    public void setPostna_st(int postna_st) {
        this.postna_st = postna_st;
    }

    public String getPosta() {
        return posta;
    }

    public void setPosta(String posta) {
        this.posta = posta;
    }

    public String getKraj() {
        return kraj;
    }

    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    public boolean isPrivzet() {
        return privzet;
    }

    public void setPrivzet(boolean privzet) {
        this.privzet = privzet;
    }

    public int getId_kupec() {
        return id_kupec;
    }

    public void setId_kupec(int id_kupec) {
        this.id_kupec = id_kupec;
    }
}
