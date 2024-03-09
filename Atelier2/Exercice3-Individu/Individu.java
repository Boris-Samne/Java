package Individu;

import java.util.ArrayList;
import java.util.List;

public class Individu {
    private String nom;
    private String adresse;
    private String telephone;
    static int nbIndividus = 0;
    static List<Individu> listIndividus= new ArrayList<>();

    public Individu(String nom, String adresse, String telephone ){
        this.nom = nom;
        this.adresse = adresse;
        this.telephone = telephone;
        nbIndividus++;
    }

    public String getNom() {
        return nom;
    }
    public String getAdresse() {
        return adresse;
    }
    public String getTelephone() {
        return telephone;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
    public static int getNbIndividus() {
        return nbIndividus;
    }

    public static void ajouterIndividus(Individu Ind){
        listIndividus.add(Ind);
    }

    public static List<Individu> getListIndividus() {
        return listIndividus;
    }

    public static void setListIndividus(List<Individu> listIndividus) {
        Individu.listIndividus = listIndividus;
    }

    public static void supprimerListIndividus(){
        listIndividus.clear();
        nbIndividus=0;
    }

}