package atelier05;

public class testCarafe {
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		Carafe c1 = new Carafe(4);
		Carafe c2 = new Carafe(7);
		
		System.out.println("capacité de la carafe 1 : " + c1.Capacité());
		System.out.println("capacité de la carafe 2 : " + c2.Capacité());
		
		System.out.println("contenu de la carafe 1 : " + c1.Contenu());
		System.out.println("contenu de la carafe 2 : " + c2.Contenu());
		
		c2.Remplir();
		System.out.println("contenu de la carafe 2 : " + c2.Contenu());
		c1.Transvaser(c2);
		System.out.println("contenu de la carafe 1 : " + c1.Contenu());
		System.out.println("contenu de la carafe 2 : " + c2.Contenu());
	}

}
