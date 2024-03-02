
public class MethodeRectangles {

    public static void main(String[] args) {
        double a = 0.0;
        double b = Math.PI / 2.0;
        double tolerance = 1e-5;
        double erreurAbsolue;

        int n = 1; // Commencez avec un intervalle
        double resultatPrecedent = methodeRectangles(a, b, n);

        do {
            n *= 2; // Doublez le nombre d'intervalles
            double resultatActuel = methodeRectangles(a, b, n);

            // Calcul de l'erreur absolue
            erreurAbsolue = Math.abs(resultatActuel - resultatPrecedent);

            // Affichage de l'erreur absolue à des fins de débogage
            System.out.println("Nombre d'intervalles : " + n + ", Erreur absolue : " + erreurAbsolue);

            // Mettez à jour le résultat précédent
            resultatPrecedent = resultatActuel;

        } while (erreurAbsolue > tolerance);

        System.out.println("Résultat de l'intégrale (approximation) : " + resultatPrecedent);
        System.out.println("Nombre d'intervalles nécessaire : " + n);
    }

    public static double methodeRectangles(double a, double b, int n) {
        double largeurIntervalle = (b - a) / n;
        double sommeAires = 0.0;

        for (int i = 0; i < n; i++) {
            double x_i = a + i * largeurIntervalle;
            double x_i_plus_un = x_i + largeurIntervalle;

            // Calcul de l'aire du rectangle et ajout à la somme
            double aireRectangle = largeurIntervalle * Math.cos((x_i + x_i_plus_un) / 2.0);
            sommeAires += aireRectangle;
        }

        return sommeAires;
    }
}
