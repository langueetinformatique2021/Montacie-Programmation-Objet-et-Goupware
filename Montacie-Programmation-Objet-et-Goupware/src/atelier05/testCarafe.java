package atelier05;

public class testCarafe {

	public static void main(String[] args) {
		Carafe caraf1 = new Carafe(5);
		System.out.println(caraf1.Capacite() + " " + caraf1.Contenu());
		Carafe caraf2 = new Carafe(7, 0);
		System.out.println(caraf2.Capacite() + " " + caraf2.Contenu());
		
		caraf1.Remplir();
		System.out.println(caraf1.Capacite() + " " + caraf1.Contenu());
		caraf1.Vider();
		System.out.println(caraf1.Capacite() + " " + caraf1.Contenu());
		
		caraf1.Remplir();
		caraf1.Transvaser(caraf2);
		System.out.println(caraf1.Capacite() + " " + caraf1.Contenu());
		System.out.println(caraf2.Capacite() + " " + caraf2.Contenu());
		
		caraf2.Remplir();
		caraf2.Transvaser(caraf1);
		System.out.println(caraf1.Capacite() + " " + caraf1.Contenu());
		System.out.println(caraf2.Capacite() + " " + caraf2.Contenu());
		
		
	

	}

}
