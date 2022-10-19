package Oeuvre;

import java.sql.Timestamp;

public abstract class Oeuvre {

    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }


    public int getNbExemplaire() {
        return nbExemplaire;
    }
    public void setNbExemplaire(int nbExemplaire) {
        this.nbExemplaire = nbExemplaire;
    }

    public String getGenre() {

        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }


    public String getSupport() {
        return support;
    }

    public void setSupport(String support) {
        this.support = support;
    }

    public static String titre;
    protected int nbExemplaire;
    protected String genre;
    protected String support;
    protected String status;
    protected Timestamp datePublication;


    public Oeuvre () {}

    public Oeuvre (String titre, int nbExemplaire, String genre, String support, String status, Timestamp datePublication) {
        this.titre = titre;
        this.nbExemplaire = nbExemplaire;
        this.genre = genre;
        this.support = support;
        this.status = status;
        this.datePublication = datePublication;

    }
}
