package atelier05;

public class Carafe {
	private int contenu_, capacite_;
	
	/** creation d'une carafe vide d'une capacite donnee
	 * 
	 * @param capacite capacite de la carafe en litres
	 */
	public Carafe(int capacite) {
		capacite_ = capacite;
		contenu_ = 0;
	}
	
	/** creation d'une carafe d'une capacite donnee et contenant une quantite d'eau
	 * 
	 * @param capacite capacite de la carafe en litres
	 * @param contenu quantite d'eau en litres conenue dans la carafe
	 */
	public Carafe(int capacite, int contenu) {
		capacite_ = capacite;
		if (contenu > capacite)
			contenu_ = capacite;
		else contenu_ = contenu;
	}
	
	/** remplir completement une carafe */
	public void Remplir() {
		contenu_ = capacite_;
	}
	
	/** vider completement une carafe */
	public void Vider() {
		contenu_ = 0;
	}
	

}
