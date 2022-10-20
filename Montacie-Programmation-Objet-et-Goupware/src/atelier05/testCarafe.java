package atelier05;

public class testCarafe {

	public static void main(String[] args) {
		Carafe c1 = new Carafe (0, 7);
		Carafe c2 = new Carafe (0, 5);
		
		c1.remplir();
		c2.vider();
		
		System.out.println(c1.contenu());
		System.out.println(c2.capacite());
	
	}

}
