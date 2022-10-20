package atelier05;

public class Carafe {
	private int contenu_, capacite_;
	
	public Carafe(int contenu, int capacite) {
		contenu_ = contenu;
		capacite_ = capacite;
	}
	
	public void vider() {
		contenu_ = 0;
	}
	
	public void remplir() {
		contenu_ = capacite_;
	}

}
