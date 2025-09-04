package principal;

import java.util.Date;

public class Enseignant extends Utilisateur{
    private final String specialite;

    public Enseignant(int id, String nom, String prenom, Date dateDeNaissance, String email, String telephone, String specialite) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.specialite = specialite;
    }

    public String getSpecialite() {
        return specialite;
    }
}
