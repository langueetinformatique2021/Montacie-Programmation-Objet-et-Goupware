// Classe Peuplier qui hérite de Arbre
public class Peuplier extends Arbre {
    // Attributs, méthodes, constructeurs, etc., propres à la classe Peuplier

    // Exemple d'attribut
    private boolean tremble;

    // Exemple de constructeur
    public Peuplier(String nom, int hauteur, boolean tremble) {
        super(nom, hauteur); // Appel du constructeur de la classe parente (Arbre)
        this.tremble = tremble;
    }

    // Exemple de méthode
    public void produireFloraison() {
        System.out.println("Le peuplier produit une floraison légère.");
    }
}