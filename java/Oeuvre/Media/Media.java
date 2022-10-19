package Oeuvre.Media;
import Oeuvre.Oeuvre;

public class Media extends Oeuvre {

    public int getAgeLimite() {
        return ageLimite;
    }

    public void setAgeLimite(int ageLimite) {
        this.ageLimite = ageLimite;
    }

    protected int ageLimite;

    public Media () {}

    public Media(int ageLimite) {

        this.ageLimite = ageLimite;
    }
}
