package atelier04;

public class Condition3 {

	public static int mediane(int p1, int p2, int p3) {
		int med;

		if (p1 < p2) {
			if (p2 < p3)
				med = p2;
			else {
				if (p3 > p1)
					med = p3;
				else
					med = p1;
			}
		} else {
			if (p1 < p3)
				med = p1;
			else
				med = p3;
		}
		return med;
	}

	public static void main(String[] args) {

		System.out.println(mediane(3, 2, 1));
		System.out.println(mediane(3, 1, 2));
		System.out.println(mediane(1, 3, 2));
		System.out.println(mediane(2, 3, 1));
		System.out.println(mediane(1, 2, 3));
		System.out.println(mediane(2, 1, 3));

		/**
		 * à tester avec les six cas possibles p1 > p2 > p3 p1 > p3 > p2 p2 > p3 > p1 p2
		 * > p1 > p3 p3 > p2 > p1 p3 > p1 > p2
		 */

	}

}
