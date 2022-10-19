import Oeuvre.Emplacement.Emplacement;
import Oeuvre.Media.Film.Film;
import Oeuvre.Oeuvre;
import Oeuvre.Ouvrage.Livre.Livre;
import Oeuvre.Media.Jeu.Jeu;
import Oeuvre.Ouvrage.Magazine.Magazine;
import Helper.BiblioHelper;

public class Main {
    public static void main(String[] args) {

        //emplacement
        Emplacement e = new Emplacement();
        e.setPosition(0);
        e.setEtagere(0);
        e.setRangee("A");

        //livre1
        Livre l1 = new Livre("Tintin","Hergé","Aventure","Editeur", 5 );
        System.out.println(l1);
        Emplacement eL1 = new Emplacement("A",4,48);
        System.out.println(eL1);

        //livre 2
        Livre l2 = new Livre("Le Seigneur des anneaux","Tolkien","Fantastique","Royal Edition", 60 );
        System.out.println(l2);
        Emplacement eL2 = new Emplacement("B",5,6);
        System.out.println(eL2);

        //livre 3
        Livre l3 = new Livre("Tic","Tac","Toc","Tuc", 999 );
        System.out.println(l3);
        Emplacement eL3 = new Emplacement("T",0,0);
        System.out.println(eL3);

        //livre 4
        Livre l4 = new Livre("Titeuf","Zep","Biographie","BD", 8 );
        System.out.println(l4);
        Emplacement eL4 = new Emplacement("D",4,48);
        System.out.println(eL4);

        // Helper -> test si le livre exite
        BiblioHelper bh = new BiblioHelper();
        System.out.println("Le livre exite ? " + bh.existeLivre("Titeuf"));


        //Jeu
        Jeu j = new Jeu("Fifa 2077", 3, "Simulation", "En ligne", "PC", 999);

        System.out.println(j);

        Emplacement eJ = new Emplacement("J",2,77);
        System.out.println(eJ);


        //Magazine
        Magazine m = new Magazine("Picsou Magazine", "Politique", "Papier", "Le figaro", 51);
        System.out.println(m);

        Emplacement eM = new Emplacement("M",0,45);
        System.out.println(eM);

        //Film1
        Film f = new Film("Indiana Jaune", "Aventure", "Spielberg", "Ford", 10, "VHS");
        System.out.println(f);

        Emplacement eF = new Emplacement("F",2,5);
        System.out.println(eF);

    }
}