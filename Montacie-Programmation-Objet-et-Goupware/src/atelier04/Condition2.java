package atelier04;

public class Condition2 {

	public static int minimum(int p1, int p2, int p3) {
		int min;

		if (p1 < p2) {
			if (p1 < p3)
				min = p1;
			else
				min = p3;
		} else {
			if (p2 < p3)
				min = p2;
			else
				min = p3;
		}
		return min;
	}

	public static void main(String[] args) {

		System.out.println(minimum(3, 2, 1));
		System.out.println(minimum(3, 1, 2));
		System.out.println(minimum(1, 3, 2));
		System.out.println(minimum(2, 3, 1));
		System.out.println(minimum(1, 2, 3));
		System.out.println(minimum(2, 1, 3));

		/**
		 * à tester avec les six cas possibles p1 > p2 > p3 p1 > p3 > p2 p2 > p3 > p1 p2
		 * > p1 > p3 p3 > p2 > p1 p3 > p1 > p2
		 */

	}

}
