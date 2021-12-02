package atelier08;

public class Des {
	private Aleat des;
	
	public Des() {
		des = new Aleat(6);
	}
	
	int lancer() {
		return des.get();
	}

}
