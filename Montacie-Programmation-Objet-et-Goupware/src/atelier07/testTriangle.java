package atelier07;

public class testTriangle {

	public static void main(String[] args) {
		Triangle t1 = new Triangle(1, 1, 1);
		Triangle t2 = new Triangle(1, (float)0.7, (float)1.3);
		
		System.out.println(t1.perimetre() + " " + t1.surface());
		System.out.println(t2.perimetre() + " " + t2.surface());
		
		System.out.println(t1.compareTo(t2));
		System.out.println(t2.compareTo(t1));

	}

}
