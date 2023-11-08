package atelier04;

/**
 * Ajout des instructions structurées par des branchements conditionnels
 * permettant d’obtenir le minimum des variables p1, p2, p3 dans la variable p4.
 */

public class Conditionnelle3 {

	public static void main(String[] args) {

		int p1, p2, p3, p4;
		p1 = 10;
		p2 = 11;
		p3 = 12;
		mediane(p1, p2, p3);
		p1 = 10;
		p2 = 12;
		p3 = 11;
		mediane(p1, p2, p3);
		p1 = 11;
		p2 = 10;
		p3 = 12;
		mediane(p1, p2, p3);
		p1 = 11;
		p2 = 12;
		p3 = 10;
		mediane(p1, p2, p3);
		p1 = 12;
		p2 = 10;
		p3 = 11;
		mediane(p1, p2, p3);
		p1 = 12;
		p2 = 11;
		p3 = 10;
		mediane(p1, p2, p3);

	}

	public static int mediane(int p1, int p2, int p3) {

		int p4;

		if (p1 < p2) {
			if (p3 > p2)
				p4 = p2;
			// p2 > p3
			else {
				if (p1 < p3)
					p4 = p3;
				else
					p4 = p1;
			}
		}
		// p1 > p2
		else {
			if (p2 > p3)
				p4 = p2;
			// p3 > p2 et p1 > p2
			else {
				if (p1 < p3)
					p4 = p1;
				else
					p4 = p3;
			}
		}

		System.out.println(p4);

		return p4;
	}
}