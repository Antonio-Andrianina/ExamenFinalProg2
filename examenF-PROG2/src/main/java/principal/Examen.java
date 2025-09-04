package principal;

import java.time.Instant;
import java.time.LocalDateTime;

public class Examen {
    private final int id;
    private final String titre;
    private final Cours cours;
    private final Instant dateExamen;
    private final double coefficient;

    public Examen(int id, String titre, Cours cours, Instant dateExamen, double coefficient) {
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

    public Instant getDateExamen() {
        return dateExamen;
    }

    public double getCoefficient() {
        return coefficient;
    }

    double getExamGrade(Examen exam, Etudiant etudiant, Instant t){
        return
    }
}