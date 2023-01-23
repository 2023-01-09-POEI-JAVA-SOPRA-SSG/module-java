package poo;

public class Avion {
    private String marque;
    private String modele;
    private int nombreSieges;

    public Avion(String marque,String modele,int nombreSieges){
//        Approche sans setters
//       if(marque.length()!=0){
//           this.marque=marque;
//       }
//
//       if(modele.length()!=0){
//           this.modele=modele;
//       }
//
//
//        if(nombreSieges>0){
//            this.nombreSieges=nombreSieges;
//        }
//

//        Utilisation des setters
        this.setMarque(marque);
        this.setModele(modele);
        this.setNombreSieges(nombreSieges);
    }

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
