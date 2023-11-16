package atelier05;

/**
 * On propose de considérer la carafe comme un objet ayant deux attributs privés
 * (contenu_ et capacité_) et l’interface publique suivante reprenant les
 * opérations ci dessus (Remplir, Vider, Contenu, Capacité et Transvaser)
 */

public class Carafe {
	private int contenu_, capacité_;
	
	// constructeur
	public Carafe(int capacité) {
		capacité_ = capacité;
		contenu_ = 0;
	}
	
	// accesseurs en lecture 
	
	public int Contenu() {
		return contenu_;
	}

	public int Capacité() {
		return capacité_;
	}
	
	// accesseurs en écriture

	public void Remplir() {
		contenu_ = capacité_;
	}

	public void Vider() {
		contenu_ = 0;
	}
	
	private void Contenu(int val) {
		contenu_ = val;
	}
	
	// autres méthodes

	/** deux carafes this et c
	 * transvaser le contenu de this dans c
	 * @param c carafe
	 */
	public void Transvaser(Carafe c) {
		int resteC = c.Capacité() - c.Contenu();
		
		System.out.println( resteC);
		
		if (this.Contenu() > resteC) {
			// this.Contenu() > resteC on ne peut vider pas complétement this mais on remplit complétement c2
			c.Remplir();
			this.Contenu(this.Contenu() - resteC);
		}
		else {
			// this.Contenu() < resteC on vide complétement this mais on ne remplit pas complétement c2
			c.Contenu(c.Contenu() + this.Contenu());
			this.Vider();
		}	

	}
}
