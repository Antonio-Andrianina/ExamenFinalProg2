package principal;

import java.time.Instant;
import java.util.Date;

public class Notes {
    private final Examen examen;
    private final Etudiant etudiant;
    private final double note;
    private final Date dateAttribution;

    public Notes(Etudiant etudiant, Examen examen, double note, Date dateAttribution) {
        this.etudiant = etudiant;
        this.examen = examen;
        this.note = note;
        this.dateAttribution = dateAttribution;
    }

    public Examen getExamen() {
        return examen;
    }

    public Etudiant getEtudiant() {
        return etudiant;
    }

    public double getNote() {
        return note;
    }

    public Date getDateAttribution() {
        return dateAttribution;
    }
}


