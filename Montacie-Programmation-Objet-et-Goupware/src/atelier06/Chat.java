package atelier06;

public class Chat extends Felin implements Domesticable {

	/**
	 * le constructeur de Chat fait appel au constructeur de la sur-classe Felin
	 */
	public Chat(String type) { // les chats ont 4 pattes
		super(type);
	}

	/**
	 * Domestiquer un animal et lui donner un nom
	 * 
	 * @param nom nom de l'animal
	 */
	public void domestiquer(String nom) {
	}

	/**
	 * Rend le nom de l'animal
	 * 
	 * @return nom de l'animal
	 */
	public String nom() {
		return null;
	}

}
