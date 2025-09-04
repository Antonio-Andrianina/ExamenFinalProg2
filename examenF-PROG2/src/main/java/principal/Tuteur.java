package principal;

import java.util.Date;

public class Tuteur extends Utilisateur {

    private final String lien;

    public Tuteur(int id, String nom, String prenom, Date dateDeNaissance, String email, String telephone, String lien) {
        super(id, nom, prenom, dateDeNaissance, email, telephone);
        this.lien = lien;
    }

    public String getLien() {
        return lien;
    }
}
