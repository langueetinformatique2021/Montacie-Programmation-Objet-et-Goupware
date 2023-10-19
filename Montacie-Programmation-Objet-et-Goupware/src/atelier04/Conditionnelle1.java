package atelier04;

/**
 * Ajout des instructions structurées par des branchements conditionnels
 * permettant d’obtenir le maximum des variables p1, p2, p3 dans la variable p4.
 */

public class Conditionnelle1 {

	public static void main(String[] args) {
		int p1 = 10, p2 = 11, p3 = 12, p4 = 4, p5 = 8;

		if (p1 > p2) {
			if (p1 > p3)
				p4 = p1;
			else
				p4 = p3;
		} else {
			if (p2 > p3)
				p4 = p2;
			else
				p4 = p3;
		}
		
		System.out.println(p4);

	}

}
