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
	
	/** Accesseur en lecture  
	 * @return capacité de la carafe en litres */
	public int Capacité() {
		return this.capacite_;
	}
	
	public void Transvaser() {}
		
}
