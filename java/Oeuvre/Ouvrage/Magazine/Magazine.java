package Oeuvre.Ouvrage.Magazine;

import Oeuvre.Ouvrage.Ouvrage;

public class Magazine extends Ouvrage {

    public Magazine() {}

    public Magazine(String titre, String genre, String support, String editeur, int nbExemplaire) {
        this.titre = titre;
        this.genre = genre;
        this.support = support;
        this.editeur = editeur;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "\nMagazine\nTitre : " + this.titre + ", Genre : " + this.genre + ", Support : " + this.support + ", Editeur : " + this.editeur + ", Nombre d'exemplaires : " + this.nbExemplaire;
    }
}
