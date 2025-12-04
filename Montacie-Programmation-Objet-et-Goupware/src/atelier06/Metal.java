package atelier06;

public abstract class Metal {
	private String alliage;
	private int tempFusion = 0;
	private int mesureVickers = 0;
	
	/**
	 * création d'une nouvelle instance de la classe Metal
	 * 
	 * @param alliage  type de l'alliage
	 * @param tempFusion transition solide liquide
	 * @param mesure Vickers échelle de dureté
	 */
	public Metal(String alliage, int tempFusion, int mesureVickers) {
		this.alliage = alliage;
		this.tempFusion = tempFusion;
		this.mesureVickers = mesureVickers;
	}
	
	/** présentation des caractéristiques du métal */
	public void afficher() {
		System.out.println("je suis un métal fait à partir de l'alliage de " + alliage + " fondant à une température de " + tempFusion + " d'une dureté de " + mesureVickers + " selon l'échelle de Vickers"); 
	}
	
	/** instruments faits à partir du métal */
	public abstract String instruments();
}
