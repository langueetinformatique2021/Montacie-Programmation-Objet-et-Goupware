package atelier05;

public class testCarafe {

	public static void main(String[] args) {
		Carafe c1, c2;
		
		c1 = new Carafe(5);
		System.out.println(c1.Capacité());
		System.out.println(c1.Contenu());
		
		c2 = new Carafe(7);
		System.out.println(c2.Capacité());
		System.out.println(c2.Contenu());
		
		c1.Remplir();
		System.out.println(c1.Contenu());
		
		c2.Remplir();
		System.out.println(c2.Contenu());
		c2.Vider();
		System.out.println(c2.Contenu());
		
		
		

	}

}
