package atelier05;

/**
 * On propose de considérer la carafe comme un objet ayant deux attributs privés
 * (contenu_ et capacité_) et l’interface publique suivante reprenant les
 * opérations ci dessus (Remplir, Vider, Contenu, Capacité et Transvaser)
 */

public class Carafe {
	private int contenu_, capacité_;
	
	public Carafe(int capacité) {
		capacité_ = capacité;
		contenu_ = 0;
	}

	public void Remplir() {
		contenu_ = capacité_;

	}

	public void Vider() {
		contenu_ = 0;

	}

	public int Contenu() {
		return contenu_;

	}

	public int Capacité() {
		return capacité_;

	}

	public void Transvaser(Carafe c2) {

	}

}
