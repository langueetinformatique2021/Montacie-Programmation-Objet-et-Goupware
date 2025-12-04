package atelier06;

public class Bronze extends Metal {
	private String instruments;

	/**
	 * création d'une nouvelle instance de la classe Bronze
	 * 
	 */
	public Bronze() {
		super("Bronze", 890, 75);
		this.instruments = "marteau, maillet, clé, statue, vase, bougeoir, encrier, coupe, pendule, lampe, charrue";
	}
	
	/** présentation des caractéristiques du Bronze */
	public void afficher() {
		super.afficher();
		System.out.println("je peux servir les instruments suivants: " + instruments()); 
	}
	
	@Override
	public String instruments() {
		return instruments;
	}

}
