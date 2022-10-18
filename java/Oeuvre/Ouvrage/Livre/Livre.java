package Oeuvre.Ouvrage.Livre;
import Oeuvre.Ouvrage.Ouvrage;

public class Livre extends Ouvrage {

    protected String nomAuteur;

    public String getNomAuteur() {
        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public Livre () {

    }
    public Livre(String titre, String auteur, String edition, int nbExemplaire) {
        this.titre = titre;
        this.nomAuteur = auteur;
        this.editeur = edition;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "Livre\nTitre : " + this.titre + ", Auteur : " + this.nomAuteur + ", Edition : " + this.editeur + ", Nombre d'exemplaire : " + this.nbExemplaire;
    }

}



