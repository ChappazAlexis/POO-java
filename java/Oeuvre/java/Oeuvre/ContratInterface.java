package Oeuvre;

import Oeuvre.Emplacement.Emplacement;
import Oeuvre.Ouvrage.Livre.Livre;

public interface ContratInterface {

    void rendreLivre(Livre l);
    void emprunterLivre(Livre l);
    void rangerLivre(Livre l, Emplacement e);
    Livre creerLivre(String titre, String auteur, String edition, int nbExemplaire);
    boolean existeLivre(String titre, String auteur);
    String[] rechercherLivre(String titre, String auteur);
    Livre afficherLivre(Livre l);
    Emplacement recupererEmplacementLivre(Livre l);
}


