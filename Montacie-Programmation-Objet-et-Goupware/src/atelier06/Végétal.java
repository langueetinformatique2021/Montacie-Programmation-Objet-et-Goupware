package atelier06;

/**
Correction obtenue par CharGPT
Soit l'arborescence de classe en Java Végétal Arbre Peuplier. 
La classe Java Végétal représente un végétal. 
La classe Arbre représente un arbre et dérive de la classe Végétal. 
La classe Peuplier représente un peuplier et dérive de la classe Arbre. 
Ecrire le code des trois classes.
*/

//Classe Végétal
public class Végétal {
 // Attributs, méthodes, constructeurs, etc., propres à la classe Végétal

 // Exemple d'attribut
 private String nom;

 // Exemple de constructeur
 public Végétal(String nom) {
     this.nom = nom;
 }

 // Exemple de méthode
 public void croître() {
     System.out.println("Le végétal croît.");
 }
}
