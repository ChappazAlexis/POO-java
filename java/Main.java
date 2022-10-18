import Oeuvre.Emplacement.Emplacement;
import Oeuvre.Oeuvre;
import Oeuvre.Ouvrage.Livre.Livre;

public class Main {
    public static void main(String[] args) {

        Livre l = new Livre();
        l.setTitre("Tintin");
        l.setNomAuteur("Herge");
        l.setEditeur("ledition");
        l.setNbExemplaire(4);

        Livre ll = new Livre("Tinto","Herge", "ledition", 8);
        System.out.println(ll.toString());


        Emplacement e = new Emplacement();
        e.setPosition(2);
        e.setEtagere(3);
        e.setRangee("A");

        Emplacement ee = new Emplacement("A",4,48);
        System.out.println(ee.toString());
    }
}