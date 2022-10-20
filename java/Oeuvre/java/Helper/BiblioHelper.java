package Helper;

import Oeuvre.Oeuvre;

public class BiblioHelper {

    public static boolean existeLivre;

    public static boolean existeLivre(String titre) {
            if (titre == Oeuvre.titre) {
                return true;
            } else {
                return false;
            }
        }


}
