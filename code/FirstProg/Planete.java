package code.FirstProg;

public class Planete {
    String nom;
    long diametre;
    String matiere;
    int nb_humains;
    int totalVisiteur;
    Atmosphere atmosphereU;
    Vaisseau vaisseauActuellementaccostÃ©;
    
    void accueillirVaisseau(Vaisseau vaisseau) {
        totalVisiteur = totalVisiteur + vaisseau.nb_Passagers;
        if (vaisseauActuellementaccostÃ© == null) {
            System.out.println("Aucun vaisseau ne s'en vas");
 
        } else {
            System.out.println("Un vaisseau de type " + vaisseauActuellementaccostÃ©.Type + " s'en va");
        }
    }


}
