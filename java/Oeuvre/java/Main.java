import Oeuvre.Emplacement.Emplacement;
import Oeuvre.Media.Film.Film;
import Oeuvre.Ouvrage.Livre.Livre;
import Oeuvre.Media.Jeu.Jeu;
import Oeuvre.Ouvrage.Magazine.Magazine;
import Helper.BiblioHelper;

public class Main {
    public static void main(String[] args) {

        //emplacement par défaut
        Emplacement e = new Emplacement();
        e.setPosition(0);
        e.setEtagere(0);
        e.setRangee("A");

        //livre 1
        Livre l1 = new Livre("Tintin","Hergé","Aventure","Editeur", 5 );
        System.out.println(l1);
        //Surcharge de l'emplacement
        Emplacement eL1 = new Emplacement("A",1,1);
        System.out.println(eL1);

        //livre 2
        Livre l2 = new Livre("Le Seigneur des anneaux","Tolkien","Fantastique","Royal Edition", 2 );
        System.out.println(l2);
        Emplacement eL2 = new Emplacement("A",2,2);
        System.out.println(eL2);

        //livre 3
        Livre l3 = new Livre("Tic","Tac","Toc","Tuc", 1 );
        System.out.println(l3);
        Emplacement eL3 = new Emplacement("A",2,3);
        System.out.println(eL3);

        //livre 4
        Livre l4 = new Livre("Titeuf","Zep","Biographie","BD", 1 );
        System.out.println(l4);
        Emplacement eL4 = new Emplacement("A",2,5);
        System.out.println(eL4);


        System.out.println("\n\n");

        //Tests et méthodes sur les livres

        // Helper -> test si le livre exite
        BiblioHelper bh = new BiblioHelper();
        System.out.println("Le livre exite ? " + bh.existeLivre("Titeuf"));

        //fonction pour emprunter le livre l4
        l4.emprunterLivre(l4);
        //fonction pour rendre le livre
        l4.rendreLivre(l4);
        //Range le livre au même emplacement que le livre 1 (rangée A, étagère 1, position 1)
        l4.rangerLivre(l4, eL1);
        //Créer un livre
        l4.creerLivre("Mon Kampf","Hetlir","le petit nazu",-1);


        System.out.println("\n\n");
        //Jeu 1
        Jeu j = new Jeu("Fifa 2077", 3, "Simulation", "CD", "PC", 1);
        System.out.println(j);
        Emplacement eJ = new Emplacement("B",1,1);
        System.out.println(eJ);

        //jeu 2
        Jeu j2 = new Jeu("Super Sarko Bros", 3, "Jeu de rôle", "CD", "Game cube", 1);
        System.out.println(j2);
        Emplacement eJ2 = new Emplacement("B",1,1);
        System.out.println(eJ2);


        //Magazine
        Magazine m = new Magazine("Picsou Magazine", "Politique", "Papier", "Le figaro", 2);
        System.out.println(m);
        Emplacement eM = new Emplacement("C",2,5);
        System.out.println(eM);

        //magazine 2
        Magazine m2 = new Magazine("Le gorafi", "Satirique", "en ligne", "indépendant", 2);
        System.out.println(m2);
        Emplacement eM2 = new Emplacement("C",2,5);
        System.out.println(eM2);

        //Film1
        Film f = new Film("Indiana Jaune", "Aventure", "Spielberg", "Ford", 10, "VHS", 2);
        System.out.println(f);
        Emplacement eF = new Emplacement("D",1,2);
        System.out.println(eF);

    }
}