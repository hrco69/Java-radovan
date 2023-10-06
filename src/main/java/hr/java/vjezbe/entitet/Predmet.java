package hr.java.vjezbe.entitet;

import java.util.Vector;

public class Predmet {

    private String sifra;
    private String naziv;
    private Integer brojEctsBodova;
    private Profesor nositelj;
    private Vector<Student> poljeStudenata;

    public Predmet(String sifra, String naziv, Integer brojEctsBodova, Profesor nositelj, Vector<Student> poljeStudenata) {
        this.sifra = sifra;
        this.naziv = naziv;
        this.brojEctsBodova = brojEctsBodova;
        this.nositelj = nositelj;
        this.poljeStudenata = poljeStudenata;
    }

    public String getSifra() {
        return sifra;
    }

    public void setSifra(String sifra) {
        this.sifra = sifra;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Integer getBrojEctsBodova() {
        return brojEctsBodova;
    }

    public void setBrojEctsBodova(Integer brojEctsBodova) {
        this.brojEctsBodova = brojEctsBodova;
    }

    public Profesor getNositelj() {
        return nositelj;
    }

    public void setNositelj(Profesor nositelj) {
        this.nositelj = nositelj;
    }

    public Vector<Student> getPoljeStudenata() {
        return poljeStudenata;
    }

    public void setPoljeStudenata(Vector<Student> poljeStudenata) {
        this.poljeStudenata = poljeStudenata;
    }
}
