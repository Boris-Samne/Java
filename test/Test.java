import java.lang.Math;

public class Test {
    public static void main(String[] args) {
        // Le point d'entrée du programme
        System.out.println("Bonjour, Monde !");
        int nombre = Integer.parseInt(System.console().readLine("Entrer un nombre \t"));
        System.out.println(nombre);

        char tab[] = new char[10];
        int matrice[][] = new int[15][20];

        for (int i = 0; i < tab.length; i++) {
            tab[i] = (char) (i + 65);
            matrice[i][i] = i;
        }

        System.err.println(tab);
        System.out.println(matrice);

        switch (nombre) {
            case 10:
                System.out.println("Egale à 10");
                break;
            case 11:
                System.out.println("supérieure à 10");
                break;
            case 9:
                System.out.println("inférieure à 10");
            default:
                System.out.println("Choisissez entre 9, 10 et 11");
                break;
        }

        String bonjour = "bonjour";
        String Bonjour = "Coucou tout le monde";
        String text = new String();

        String sous_chaine = Bonjour.substring(1, 5);
        System.out.println(sous_chaine);

        boolean verification = bonjour.equals(text);

        System.out.println(verification);

        double racine = Math.sqrt(15);

        System.out.println(racine);

        double power = Math.pow(15, 2);

        System.out.println(power);
    }
}
