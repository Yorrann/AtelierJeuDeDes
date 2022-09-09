package manu;

import java.util.Random;

public class De {

    //attributs
    private int num; //numéro du dé
    private int nbFaces; //le nombre de faces d'un dé
    private int valeur; // la valeur d'un dé
    private boolean estPipe;

    public De() {
        this(0, 6);
    }

    public De(int nbFaces) {
        this(0, nbFaces);
    }

    public De(int num, int nbFaces) {
        this.num = num;
        this.nbFaces = nbFaces;
        this.valeur = 0;
        this.estPipe = false;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNbFaces() {
        return nbFaces;
    }

    public void setNbFaces(int nbFaces) {
        this.nbFaces = nbFaces;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public boolean isPipe() {
        return estPipe;
    }

    public void setPipe(boolean estPipe) {
        this.estPipe = estPipe;
    }

    //Méthodes
    public void lancer() {
        Random lance = new Random();
        int l = lance.nextInt(nbFaces) + 1;
        valeur = l;
        System.out.println("le résultat du lancer est: " + valeur);
        if (estPipe == true) {
            valeur = switch (valeur) {
                case 1 ->
                    1;
                case 2 ->
                    2;
                case 3 ->
                    2;
                case 4 ->
                    4;
                case 5 ->
                    4;
                default ->
                    1;
            };
        }
        num += 1;
    }

    public void piper() {
        estPipe = true;
    }

    @Override
    public String toString() {
        return "Dé " + num + " : " + valeur;
    }

}
