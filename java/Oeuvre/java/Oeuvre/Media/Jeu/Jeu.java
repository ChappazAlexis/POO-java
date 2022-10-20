package Oeuvre.Media.Jeu;

import Oeuvre.Media.Media;

public class Jeu extends Media {

    public String getPlateforme() {
        return plateforme;
    }

    public void setPlateforme(String plateforme) {
        this.plateforme = plateforme;
    }

    protected String plateforme;

    public Jeu () {}

    public Jeu (String titre, int ageLimite, String genre, String support, String plateforme, int nbExemplaire) {

        this.titre = titre;
        this.ageLimite = ageLimite;
        this.genre = genre;
        this.support = support;
        this.plateforme = plateforme;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "\nJeu\nTitre : " + this.titre + ", Age limite : " + this.ageLimite + ", Support : " + this.support + ", Plateforme : " + this.plateforme + ", Nombre d'exemplaires : " + this.nbExemplaire;
    }

}
