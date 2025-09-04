package principal;

import java.util.Date;

public class Utilisateur {
    protected int id;
    protected String nom;
    protected String prenom;
    protected Date dateDeNaissance;
    protected String email;
    protected String telephone;



    public Utilisateur(int id, String nom, String prenom, Date dateDeNaissance, String email, String telephone) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.email = email;
        this.telephone = telephone;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public Date getDateDeNaissance() {
        return dateDeNaissance;
    }

    public String getEmail() {
        return email;
    }

    public String getTelephone() {
        return telephone;
    }


}
