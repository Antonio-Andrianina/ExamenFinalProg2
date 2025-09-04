package principal;

public class Cours {
    private final int id;
    private final String Label;
    private final int credits;
    private final Enseignant enseignant;

    public Cours(int id, String label, int credits, Enseignant enseignant) {
        this.id = id;
        Label = label;
        this.credits = credits;
        this.enseignant = enseignant;
    }

    public int getId() {
        return id;
    }

    public String getLabel() {
        return Label;
    }

    public int getCredits() {
        return credits;
    }

    public Enseignant getEnseignant() {
        return enseignant;
    }
}
