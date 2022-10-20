package Oeuvre.Ouvrage.Livre;
import Oeuvre.ContratInterface;
import Oeuvre.Emplacement.Emplacement;
import Oeuvre.Oeuvre;
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
    //fonction qui retourne les infos du livre
    //param titre, nomAuteur, genre, editeur, nbExemplarie
    //return le titre, nomAuteur, genre, editeur, nbExemplarie du livre
    public String toString() {
        return "\nLivre\nTitre : " + this.titre + ", Auteur : " + this.nomAuteur + ", Genre : " + this.genre + ", Editeur : " + this.editeur + ", Nombre d'exemplaire : " + this.nbExemplaire;
    }

    @Override
    //fonction qui permet de rendre un livre en le rendant disponible
    //params Livre
    //return "Titre est disponible)
    public void rendreLivre(Livre l) {
        this.status = "Disponible";
        System.out.println(titre + " est disponible");
    }


    @Override
    //fonction qui permet d'emprunter un livre en le rendant indisponible et en supprimant son emplacement
    //param Livre
    //return "Titre n'est plus disponible"
    public void emprunterLivre(Livre l) {
        this.status = "Non-Disponible";
        Emplacement e = new Emplacement(null, -1, -1);
        System.out.println(titre + " n'est plus disponible");
    }

    @Override
    // fonction pour ranger le livre à l'emplacement par défaut
    //param Livre, Emplacement
    //return "titre est rangé dans emplacement"
    public void rangerLivre(Livre l, Emplacement e) {
        Emplacement empla = new Emplacement("A",0,0);
        System.out.println(titre + " est maintenant rangé dans " + empla);
    }

    @Override
    // fonction pour créer le livre par défaut
    // retourne l (le livre par défaut)
    public Livre creerLivre(String titre, String auteur, String edition, int nbExemplaire) {
        Livre l = new Livre("Titre","Auteur","Genre","Editeur", 0 );
        System.out.println("Livre créé avec le titre : " + titre + ", auteur : " + auteur + ", editeur : " + edition + ", nb d'exemplaire : " + nbExemplaire);
        return l;
    }

    @Override
    //fonction pour tester si le livre existe avec le titre ou l'auteur
    //param titre et auteur du livre à chercher
    //return bool
    public boolean existeLivre(String titre, String auteur) {
        if (titre != null || auteur != null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    //fonction pour rechercher un livre en rentrant le titre et l'auteur
    //param titre et auteur du livre à chercher
    //return les infos du livre s'il existe sinon return "Le livre n'existe pas !"
    public String[] rechercherLivre(String titre, String nomAuteur) {
        if (titre != null && nomAuteur != null) {
            return new String[]{"Livre existant : " + this.titre + this.nomAuteur + this.genre + this.editeur + this.nbExemplaire};
        } else {
            return new String[]{"Le livre n'existe pas !"};
        }
    }


    @Override
    //fontion permettant d'afficher le livre par défaut
    //params Livre
    //return le livre par défaut
    public Livre afficherLivre(Livre l) {
       Livre livre = new Livre("Titre","Auteur","genre","Editeur", 0 );
       return livre;
    }

    @Override
    //fonction affichant l'emplacement du livre donné
    //param titre du livre
    //return l'emplacement (par défaut)
    public Emplacement recupererEmplacementLivre(Livre l) {
        return null;
    }
}





