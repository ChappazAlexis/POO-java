package Oeuvre.Ouvrage;
import Oeuvre.Oeuvre;

public class Ouvrage extends Oeuvre{

    public String getEditeur() {
        return editeur;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    protected String editeur;

    public Ouvrage () {}

    public Ouvrage (String editeur) {
        this.editeur = editeur;
    }

}
