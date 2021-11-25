package atelier07;

public class testCercle {

	public static void main(String[] args) {
		Cercle c1 = new Cercle((float)1.0);
		Cercle c2 = new Cercle((float)2.0);
		
		System.out.println(c1.perimetre() +  " " + c1.surface());
		System.out.println(c2.perimetre() +  " " + c2.surface());
		System.out.println(c1.compareTo(c2));
		
	}

}
