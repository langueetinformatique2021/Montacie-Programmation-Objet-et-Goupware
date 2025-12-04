package atelier07;

import cours04.FigureGeometrique;

public class Triangle extends FigureGeometrique implements Comparable {

	private float côté1, côté2, côté3;

	/** Création d'une nouvelle instance de Triangle */
	public Triangle(float côté1, float côté2, float côté3) {
		super("noir");
		this.côté1 = côté1;
		this.côté2 = côté2;
		this.côté3 = côté3;
	}

	/** implémentation de la méthode périmètre */
	public float perimetre() {
		return côté1 + côté2 + côté3;
	}

	/** implémentation de la méthode surface en utilisant la formule de Héron */
	public float surface() {
		float p = perimetre()/2;
		double s = Math.sqrt(p * (p - côté1) * (p - côté2) * (p - côté3));
		return ((float)s);
	}
	
	

	/** implémentation de la méthode compareTo de l'interface Comparable */
	public int compareTo(Object o) {
		Triangle c = (Triangle) o;

		if (this.surface() > c.surface())
			return 1;
		if (this.surface() < c.surface())
			return -1;
		return 0;
	}

}
