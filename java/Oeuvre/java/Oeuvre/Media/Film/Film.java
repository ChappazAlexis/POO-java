package Oeuvre.Media.Film;

import Oeuvre.Media.Media;

public class Film extends Media {

    public String getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(String realisateur) {
        this.realisateur = realisateur;
    }



    public String getActeur() {
        return acteur;
    }

    public void setActeur(String acteur) {
        this.acteur = acteur;
    }

    protected String realisateur;
    protected String acteur;


    public Film () {}

    public Film (String titre, String genre, String realisateur, String acteur, int ageLimite, String support, int nbExemplaire) {

        this.titre = titre;
        this.genre = genre;
        this.realisateur = realisateur;
        this.acteur = acteur;
        this.ageLimite = ageLimite;
        this.support = support;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "\nFilm\nTitre : " + this.titre + ", Genre : " + this.genre + ", Realisateur : " + this.realisateur + ", Acteur : " + this.acteur + ", Age limite : " + this.ageLimite + ", Support : " +  this.support + ", Nombre d'exemplaire : " + this.nbExemplaire;
    }
}
