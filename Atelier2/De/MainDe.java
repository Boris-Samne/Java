public class MainDe {
    public static void main(String[] args) {
        De D=new De();
        De D1=new De();

        D1.lancerDe();
        D.lancerDe();
        System.out.println("Resultats: "+ D.getValeurActuelle() +" "+D1.getValeurActuelle());

        plusieursLancer(D);
        plusieursLancer2D(D1, D);
    }
    
    // fonction pour lancer un Dé plusieurs fois
    public static void plusieursLancer( De D ) { 
        System.out.println("Plusieurs lancée d'un Dé\n");
        int nbLancer = Integer.parseInt(System.console().readLine("Entrer le nombre de lancer\n"));
        for (int i = 1; i <= nbLancer; i++) {
            D.lancerDe();
            System.out.println("Resultats n°"+i+ ": "+ D.getValeurActuelle()+"\n");
        }
    }

    // fonction pour lancer deux Dé plusieurs fois et verifier si le joueur par gagné
    public static void plusieursLancer2D( De D1, De D2) {
        System.out.println("Plusieurs lancée de deux Dé\n");
        int nbLancer = Integer.parseInt(System.console().readLine("Entrer le nombre de lancer\n"));
        for (int i = 1; i <= nbLancer; i++) {
            D1.lancerDe();
            D2.lancerDe();
            System.out.println("Resultats n°"+i+ " : " + D1.getValeurActuelle()+ ","+ D2.getValeurActuelle()+"\n");
            if (D1.getValeurActuelle()==D2.getValeurActuelle()){
                System.out.println("Gagné!!!");
            }
        }
    }
}
