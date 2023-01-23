package poo.jeux_video;

import java.util.InputMismatchException;

public class Guerrier {
    private String nom;
    private String arme;
    private int dureeDeVie;

    public Guerrier(String nom, String arme, int dureeDeVie) {
        this.nom = nom;
        this.arme = arme;
        this.dureeDeVie = dureeDeVie;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) throws InputMismatchException {
        if(nom.isEmpty() || nom.contains("\\d")){
            throw new InputMismatchException("Le nom ne peut pas être vide ou contain " +
                    "des chiffres");
        }
        this.nom = nom;
    }

    public String getArme() {
        return arme;
    }

    public void setArme(String arme) throws InputMismatchException {
        if(arme.isEmpty()){
            throw new InputMismatchException("L'arme ne doit pas être vide");
        }
        this.arme = arme;
    }

    public int getDureeDeVie() {
        return dureeDeVie;
    }

    public void setDureeDeVie(int dureeDeVie) throws InputMismatchException {
        if(dureeDeVie<0 || dureeDeVie>100){
            throw new InputMismatchException("La durée de vie doit être >=0 et <=100");
        }
        this.dureeDeVie = dureeDeVie;
    }

    public void rencontrer(){
        System.out.println("Je suis un guerrier");
    }
}
