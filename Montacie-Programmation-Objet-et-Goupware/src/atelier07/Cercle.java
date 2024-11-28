package atelier07;

import cours04.FigureGeometrique;
import java.lang.Comparable;

public class Cercle extends FigureGeometrique implements Comparable  {
	
	double rayon;
	
	/** Création d'une nouvelle instance de Cercle */
	public Cercle(float x) {
		super("noir");
		rayon = x;
	}

}
