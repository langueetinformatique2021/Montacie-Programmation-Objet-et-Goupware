package atelier05;

/** gestion du problème des carafes */
public class Carafe {
	private int contenu_, capacite_;

	/**
	 * Contructeur non vide
	 * 
	 * @param contenu  contenu en litres de la carafe
	 * @param capacite capacite en litres de la carafe
	 */
	public Carafe(int contenu, int capacite) {
		contenu_ = contenu;
		capacite_ = capacite;
	}

	/**
	 * vider la carafe accesseur en écriture
	 */
	public void vider() {
		contenu_ = 0;
	}

	/**
	 * remplir la carafe accesseur en écriture
	 */
	public void remplir() {
		contenu_ = capacite_;
	}

	/**
	 * accesseur en lecture
	 * 
	 * @return le contenu de la carafe
	 */
	public int contenu() {
		return contenu_;
	}

	/**
	 * accesseur en lecture
	 * 
	 * @return la capacite de la carafe
	 */
	public int capacite() {
		return capacite_;
	}

}
