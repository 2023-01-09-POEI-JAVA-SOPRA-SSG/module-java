package poo;

import poo.vendredi_20_janvier.Tp1_Rectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Constructeur par défaut par défaut
        Avion airbus=new Avion("Airbus","A320",150);

        System.out.println("Affichage avant l'appel des setters");
        System.out.println("===================================");
        System.out.printf("Marque : %s\nModèle : %s\nNombre sièges : %d",airbus.getMarque(),
                airbus.getModele(),airbus.getNombreSieges());

        airbus.setMarque("Air bus");
        airbus.setModele("");
        airbus.setNombreSieges(-45);

        System.out.println("\nAffichage après l'appel des setters");
        System.out.println("===================================");
        System.out.printf("Marque : %s\nModèle : %s\nNombre sièges : %d",airbus.getMarque(),
                airbus.getModele(),airbus.getNombreSieges());
//        airbus.setMarque("Airbus");
//        airbus.setModele("A320");
//        airbus.setNombreSieges(150);
//
//        System.out.printf("Marque : %s\nModèle : %s\nNombre sièges : %d",airbus.getMarque(),
//                airbus.getModele(),airbus.getNombreSieges());

//        var rectangle=new Tp1_Rectangle();
//        rectangle.setLongueur(500);
//        rectangle.setLargeur(250);
//        System.out.printf("Aire : %.2f\nPerimetre : %.2f",rectangle.calculAire(),
//                rectangle.calculPerimetre());
    }
}
