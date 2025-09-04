package principal;

public class Cours {
    private int id;
    private String Label;
    private int credits;
    private Enseignant enseignant;

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
