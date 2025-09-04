package principal;

import java.time.LocalDateTime;

public class Examen {
    private int id;
    private String titre;
    private Cours cours;
    private LocalDateTime dateExamen;
    private double coefficient;

    public Examen(int id, String titre, Cours cours, LocalDateTime dateExamen, double coefficient) {
        this.id = id;
        this.titre = titre;
        this.cours = cours;
        this.dateExamen = dateExamen;
        this.coefficient = coefficient;
    }

    public int getId() {
        return id;
    }

    public String getTitre() {
        return titre;
    }

    public Cours getCours() {
        return cours;
    }

    public LocalDateTime getDateExamen() {
        return dateExamen;
    }

    public double getCoefficient() {
        return coefficient;
    }
}