package atelier07;

import cours04.FigureGeometrique;

public class Cercle extends FigureGeometrique implements Comparable {
	
	protected float rayon = 0;
	
	public Cercle(float r) {
		super("noir");
		rayon = r;
	}

	@Override
	public int compareTo(Object arg0) {
		Cercle c = (Cercle)arg0;
		if (c.rayon < rayon) return 1;
		if (c.rayon > rayon) return -1;
		return 0;
	}

	@Override
	public float perimetre() {
		return (float)(2*Math.PI*rayon);
	}

	@Override
	public float surface() {
		return (float)(Math.PI*rayon*rayon);
	}

}
