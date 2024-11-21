package TD05;

public class Carafe {
	//Atributs privés de la class
	private int contenu_;
	private int capacité_;
	/**
	 * Constructeur
	 * @param Carafe initialment vide
	 */
	public Carafe(int capacité) {
		this.capacité_ = capacité;
		this.contenu_ = 0;
	}
	//@return le contenu
	public int Contenu() {
		return this.contenu_;
	}
	//@return la capacité
	public int Capacité() {
		return this.capacité_;
	}
	//Méthode pour remplir
	public void Remplir() {
		contenu_ = capacité_;
	}
	//Méthode pour vider
	public void Vider() {
		contenu_ = 0;
	}
	/**
	 * 
	 * @param autreCarafe la carafe qui recoit l'action de transverser
	 */
	public void Transvaser(Carafe autreCarafe) {
		int Transversable = Math.min(this.contenu_, autreCarafe.capacité_ - autreCarafe.contenu_);
		this.contenu_ -= Transversable;
		autreCarafe.contenu_ += Transversable;
	}
		
}
