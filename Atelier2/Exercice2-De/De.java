public class De {
    private int  nbFaces;
    private int valeurActuelle;

    public De() {
        do { 
            nbFaces = Integer.parseInt(System.console().readLine("Entrer le nombre de faces du Dé\n"+
             "Choisissez une valeur parmi les suivantes : 4, 6, 8, 12 et 20 \n"));
        } while (nbFaces != 4 && nbFaces != 6 && nbFaces != 8 && nbFaces != 12 && nbFaces != 20);
    }
    

    public void lancerDe(){
        this.valeurActuelle = (int) (1 + nbFaces * Math.random());
    }

    public int getValeurActuelle() {
        this.lancerDe();
        return valeurActuelle;
    }
}
