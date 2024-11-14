package atelier05;

public class Carafe {
	private int  contenu_, capacite_;
	
	/** Création d'une carafe vide
	 * @param capacite capacité en litres de la carafe */
	public Carafe(int capacite) {
		this.capacite_ = capacite;
		Vider();
	}
	
	public void Remplir() {
		this.contenu_ = capacite_;
	}
	
	public void Vider() {
		this.contenu_ = 0;
	}
	
	public void Contenu() {}
	
	public void Capacité() {}
	
	public void Transvaser() {}
		
}
