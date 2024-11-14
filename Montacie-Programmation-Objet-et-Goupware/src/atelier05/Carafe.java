package atelier05;

public class Carafe {
	private int  contenu_, capacite_;
	
	/** Création d'une carafe vide
	 * @param capacite capacité en litres de la carafe */
	public Carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
	}
	
	/** Remplir une carafe complétement */
	public void Remplir() {
		this.contenu_ = capacite_;
	}
	
	/** Vider une carafe complétement */
	public void Vider() {
		this.contenu_ = 0;
	}
	
	/** Accesseur en lecture  
	 * @return contenu de la carafe en litres */
	public int Contenu() {
		return this.contenu_;
	}
	
	/** Accesseur en écriture
	 * @param contenu à modifier */
	private void Contenu(int contenu) {
		this.contenu_ = contenu;
	}
	
	/** Accesseur en lecture  
	 * @return capacité de la carafe en litres */
	public int Capacité() {
		return this.capacite_;
	}
	
	/** transvaser la carafe c dans la carafe this
	 * @param c carafe à transvaser */
	public void Transvaser(Carafe c) {
		
		int reste = this.capacite_ - this.contenu_;
		if (c.Contenu() < reste) { // on va pouvoir vider la carafe c
			this.Contenu(Contenu() + c.Contenu());
			c.Vider();
		}
		else {
			c.Contenu(c.Contenu() - reste);
			this.Remplir();
	}
}
		
}
