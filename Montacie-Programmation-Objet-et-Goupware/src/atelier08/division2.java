package atelier08;

public class division2 {

	/** point d'entrée d'un exécutable */
	public static void main(String[] args) {
		try {
		division();
		} catch (ArithmeticException e) {
			System.out.println("Exception interceptée dans la fonction appelante " + e.getMessage());
		}
	}

	public static void division() throws ArithmeticException {
		int i = 1000, j;

		do {
			i--;
			j = 1 / i;
		} while (true);

	}

}
