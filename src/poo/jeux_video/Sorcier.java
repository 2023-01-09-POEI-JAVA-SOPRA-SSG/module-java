package poo.jeux_video;

import java.util.InputMismatchException;

public class Sorcier {
    private String nom;
    private String baguetteMagique;

    private String batonMagique;
    private int dureeDeVie;


    public Sorcier(String nom, String baguetteMagique, int dureeDeVie,String batonMagique) {
        this.nom = nom;
        this.baguetteMagique = baguetteMagique;
        this.dureeDeVie = dureeDeVie;
        this.batonMagique=batonMagique;
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

    public String getBaguetteMagique() {
        return baguetteMagique;
    }

    public void setBaguetteMagique(String baguetteMagique) throws InputMismatchException {
        if(baguetteMagique.isEmpty()){
            throw new InputMismatchException("La baguette magique ne doit pas être vide");
        }
        this.baguetteMagique = baguetteMagique;
    }

    public String getBatonMagique() {
        return batonMagique;
    }

    public void setBatonMagique(String batonMagique) throws InputMismatchException {
        if(batonMagique.isEmpty()){
            throw new InputMismatchException("La baton magique ne doit pas être vide");
        }
        this.batonMagique = batonMagique;
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
        System.out.println("Je suis un sorcier");
    }
}
