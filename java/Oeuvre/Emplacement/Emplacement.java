package Oeuvre.Emplacement;

import Oeuvre.Oeuvre;

public class Emplacement extends Oeuvre {

    private String rangee;
    public String getRangee() {
        return rangee;
    }
    public void setRangee(String rangee) {
        this.rangee = rangee;
    }


    private int etagere;
    public int getEtagere() {
        return etagere;
    }
    public void setEtagere(int etagere) {
        this.etagere = etagere;
    }

    private int position;
    public int getPosition() {
        return position;
    }
    public void setPosition(int position) {
        this.position = position;
    }

    public Emplacement () {}

    public Emplacement (String rangee, int etagere, int position){
        this.rangee = rangee;
        this.etagere = etagere;
        this.position = position;
    }

    @Override
    public String toString() {
        return "Emplacement\nRangée : " + this.rangee + ", Etagère : " + this.etagere + ", Position " + this.position;
    }
}
