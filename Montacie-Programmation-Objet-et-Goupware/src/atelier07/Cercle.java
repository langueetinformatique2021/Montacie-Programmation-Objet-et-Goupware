package atelier07;

import cours04.FigureGeometrique;

public class Cercle extends FigureGeometrique implements Comparable {
	float rayon;

	public Cercle(float x) {
		super("noir");
		rayon = x;
	}
	
	@Override
	public int compareTo(Object o) {
		Cercle co = (Cercle)o;
		if (rayon > co.rayon) return 1;
		if (rayon < co.rayon) return -1;
		return 0;
	}

	@Override
	public float perimetre() {
		return (float)(2* Math.PI * rayon);
	}

	@Override
	public float surface() {
		return (float)(Math.PI * rayon*rayon);
		
	}

}
