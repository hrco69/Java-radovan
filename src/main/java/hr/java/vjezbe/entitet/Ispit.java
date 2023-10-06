package hr.java.vjezbe.entitet;

import java.time.LocalDate;

public class Ispit {

    private Predmet predmet;
    private Student student;
    private Integer ocjena;
    private LocalDate datumIVrijeme;

    public Ispit(Predmet predmet, Student student, Integer ocjena, LocalDate datumIVrijeme) {
        this.predmet = predmet;
        this.student = student;
        this.ocjena = ocjena;
        this.datumIVrijeme = datumIVrijeme;
    }

    public Predmet getPredmet() {
        return predmet;
    }

    public void setPredmet(Predmet predmet) {
        this.predmet = predmet;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Integer getOcjena() {
        return ocjena;
    }

    public void setOcjena(Integer ocjena) {
        this.ocjena = ocjena;
    }

    public LocalDate getDatumIVrijeme() {
        return datumIVrijeme;
    }

    public void setDatumIVrijeme(LocalDate datumIVrijeme) {
        this.datumIVrijeme = datumIVrijeme;
    }



}
