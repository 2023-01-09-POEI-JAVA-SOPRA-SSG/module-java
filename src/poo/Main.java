package poo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Avion airbus=new Avion();
        airbus.marque="Airbus";
        airbus.modele="A320";
        airbus.nombreSieges=-150;

        System.out.printf("Marque : %s\nModèle : %s\nNombre sièges : %d",airbus.marque,
                airbus.modele,airbus.nombreSieges);
    }
}
