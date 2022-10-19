package Oeuvre.Ouvrage.Livre;
import Oeuvre.ContratInterface;
import Oeuvre.Emplacement.Emplacement;
import Oeuvre.Ouvrage.Ouvrage;

public class Livre extends Ouvrage implements ContratInterface {
    protected String nomAuteur;

    public String getNomAuteur() {

        return nomAuteur;
    }

    public void setNomAuteur(String nomAuteur) {

        this.nomAuteur = nomAuteur;
    }

    public Livre () {

    }
    public Livre(String titre, String auteur, String genre, String editeur, int nbExemplaire) {
        this.titre = titre;
        this.nomAuteur = auteur;
        this.genre = genre;
        this.editeur = editeur;
        this.nbExemplaire = nbExemplaire;
    }

    @Override
    public String toString() {
        return "\nLivre\nTitre : " + this.titre + ", Auteur : " + this.nomAuteur + ", Genre : " + this.genre + ", Editeur : " + this.editeur + ", Nombre d'exemplaire : " + this.nbExemplaire;
    }


    @Override
    public void rendreLivre(Livre l) {
        this.status = "Disponible";
    }

    @Override
    public void emprunterLivre(Livre l) {
        this.status = "Non-Disponible";
    }

    @Override
    public void rangerLivre(Livre l, Emplacement e) {
        Emplacement ee = new Emplacement();
    }

    @Override
    public Livre creerLivre(String titre, String auteur, String edition, int nbExemplaire) {
        return null;
    }

    @Override
    public boolean existeLivre(String titre, String auteur) {
        if (titre != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String[] rechercherLivre(String titre, String auteur) {

        if (titre != null && auteur != null) {
            return new String[]{"Livre existant" + this.titre};
        } else {
            return new String[]{"n'existe pas"};
        }
    }


    @Override
    public Livre afficherLivre(Livre l) {
       Livre livre = new Livre("Tintin","Hergé","Aventure","Editeur", 5 );
       return livre;
    }

    @Override
    public Emplacement recupererEmplacementLivre(Livre l) {
        return null;
    }
}



