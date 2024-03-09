class ElementPile {
    private int valeur;
    private ElementPile suivant;

    // Constructeur pour créer un élément de pile avec une valeur donnée
    public ElementPile(int valeur) {
        this.valeur = valeur;
        this.suivant = null;
    }

    // Accesseurs
    public int getValeur() {
        return valeur;
    }

    public ElementPile getSuivant() {
        return suivant;
    }

    public void setSuivant(ElementPile suivant) {
        this.suivant = suivant;
    }
}