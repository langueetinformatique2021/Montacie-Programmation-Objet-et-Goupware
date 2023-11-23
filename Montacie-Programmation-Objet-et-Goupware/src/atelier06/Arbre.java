package atelier06;

//Classe Arbre qui hérite de Végétal
public class Arbre extends Végétal {
 // Attributs, méthodes, constructeurs, etc., propres à la classe Arbre

 // Exemple d'attribut
 private int hauteur;

 // Exemple de constructeur
 public Arbre(String nom, int hauteur) {
     super(nom); // Appel du constructeur de la classe parente (Végétal)
     this.hauteur = hauteur;
 }

 // Exemple de méthode
 public void perdreFeuilles() {
     System.out.println("L'arbre perd ses feuilles en automne.");
 }
}