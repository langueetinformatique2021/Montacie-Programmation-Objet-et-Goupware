package atelier05;

public class ProblemeCarafe {
	public static void main (String[] args) {
		Carafe carafe7 = new Carafe(7);
		Carafe carafe4 = new Carafe(4);
		
		carafe7.Remplir();
		carafe7.Transvaser(carafe4);
		carafe4.Vider();
		carafe7.Transvaser(carafe4);
		carafe7.Transvaser(carafe4);
		carafe4.Vider();
		carafe7.Transvaser(carafe4);
		carafe7.Remplir();
		carafe7.Transvaser(carafe4);
		
		System.out.println(carafe4.Contenu());
		System.out.println(carafe7.Contenu());
		
	}
}