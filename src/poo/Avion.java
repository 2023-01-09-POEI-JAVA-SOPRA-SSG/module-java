package poo;

public class Avion {
    private String marque;
    private String modele;
    private int nombreSieges;


    // Accesseurs
    public String getMarque(){
        return marque;
    }

    public String getModele(){
        return modele;
    }

    public int getNombreSieges(){
        return nombreSieges;
    }
    // Manipulateurs
    public void setMarque(String marque){
        if(marque.length()!=0){
            this.marque=marque;
        }
    }

    public void setModele(String modele){
        if(modele.length()!=0){
            this.modele=modele;
        }
    }

    public void setNombreSieges(int nombreSieges){
        if(nombreSieges>0){
            this.nombreSieges=nombreSieges;
        }
    }
}
