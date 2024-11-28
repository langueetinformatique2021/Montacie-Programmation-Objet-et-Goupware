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
	
	/** calcul du périmètre d'un cercle rouge
	* @return périmètre  */
	public float perimetre() { return (float)(2.0*Math.PI*rayon); }
	
	/** calcul de la surface d'un cercle
	 * @return surface */
	public float surface() { return (float)(Math.PI*rayon*rayon); }
	
	/** implémentation de la méthode compareTo de l'interface Comparable */
	public int compareTo(Object o) {
		Cercle c = (Cercle)o;
		if (this.rayon == c.rayon) return 0;
		if (this.rayon < c.rayon) return -1;
		else return 1;
	}
	


}
