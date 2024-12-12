package atelier08;

public class division1 {

	/** point d'entrée d'un exécutable */
	public static void main(String[] args) {
		int i = 1000, j;
		try {
			do {
				i--;
				j = 1 / i;
			} while (true);
		} catch (ArithmeticException e) {
			System.out.println("Exception interceptée " + e.getMessage());
		}
	}

}
