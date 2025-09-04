package principal;

import java.util.Date;

public class Etudiant extends Utilisateur{
    private final String groupe;

    public Etudiant(int id, String nom, String prenom, Date dateDeNaissance, String email, String telephone, String groupe) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.groupe = groupe;
    }

    public String getGroupe() {
        return groupe;
    }
}




