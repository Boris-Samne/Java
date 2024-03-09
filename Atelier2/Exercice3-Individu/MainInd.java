package Individu;

public class MainInd {
    public static void main(String[] args){
        // Exercice3
        Individu individu = new Individu("Boris", "Tanger", "0780571128");
        Individu.ajouterIndividus(individu);
        Individu individu1 = new Individu("Brice", "Tanger", "0528617423");
        Individu.ajouterIndividus(individu1);
        System.out.println("Le nombre d'invidus créées :" +Individu.getNbIndividus()+"\nla liste des individus : ");
        for (Individu indi : Individu.getListIndividus()){
            System.out.println(indi.getNom());
        }
        Individu.supprimerListIndividus();
        System.out.println("Le nombre d'invidus créées :" +Individu.getNbIndividus()+"\nla liste des individus : ");
        for (Individu indi : Individu.getListIndividus()){
            System.out.println(indi.getNom());
        }
    }
}
