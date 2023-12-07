package atelier08;

public class division3 {

	public static void main(String[] args) {
		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.exit(0);
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
