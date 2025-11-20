package atelier05;

/** Gestion des caractéristiques d'un étudiant */

public class Etudiant {
	private String nom, prenom, INE;
	private long num;
	private Date naissance;
	private Promotion promo;
	
	/** contructeur non vide */
	public Etudiant(String nom, String prenom, String INE, long num, Date naissance, Promotion promo) {
		this.nom = nom;
		this.prenom = prenom;
		this.INE = INE;
		this.num = num;
		this.naissance = naissance; // pour un objet utiliser une méthode de recopie
		this.promo = promo; // pour un objet utiliser une méthode de recopie
	}
	
	/** Affichage des caractéristiques de l'étudiant */
	public void Afficher() {
	}
	
	/** Accesseur en lecture */
	public String getNom() {
		return nom;
	}
	
	
		
	

}
