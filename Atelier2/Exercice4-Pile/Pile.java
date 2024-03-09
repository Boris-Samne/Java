public class Pile {

    private ElementPile sommet;

    // Constructeur pour créer une pile vide
    public Pile() {
        this.sommet = null;
    }

    // Méthode pour tester si la pile est vide
    public boolean estVide() {
        return sommet == null;
    }

    // Méthode pour empiler un élément au sommet de la pile
    public void empile(int valeur) {
        ElementPile nouvelElement = new ElementPile(valeur);
        nouvelElement.setSuivant(sommet);
        sommet = nouvelElement;
    }

    // Méthode pour dépiler et retourner l'élément du sommet
    public int depile() {
        if (!estVide()) {
            int valeurDepilee = sommet.getValeur();
            sommet = sommet.getSuivant();
            return valeurDepilee;
        } else {
            System.out.println("La pile est vide. Impossible de dépiler.");
            return -1; // Valeur arbitraire pour indiquer une pile vide
        }
    }

    // Méthode pour retourner le sommet de la pile sans le retirer
    public int sommet() {
        if (!estVide()) {
            return sommet.getValeur();
        } else {
            System.out.println("La pile est vide. Aucun élément au sommet.");
            return -1; // Valeur arbitraire pour indiquer une pile vide
        }
    }

    // Méthode pour afficher le contenu de la pile
    public void affiche() {
        ElementPile current = sommet;
        System.out.print("Contenu de la pile : ");
        while (current != null) {
            System.out.print(current.getValeur() + " ");
            current = current.getSuivant();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Tester la création d'une pile et sa manipulation
        Pile maPile = new Pile();

        maPile.empile(1);
        maPile.empile(2);
        maPile.empile(3);

        maPile.affiche();

        System.out.println("Sommet de la pile : " + maPile.sommet());

        System.out.println("Élément dépilé : " + maPile.depile());
        System.out.println("Élément dépilé : " + maPile.depile());

        maPile.affiche();

        System.out.println("La pile est vide : " + maPile.estVide());
    }
}