package atelier08;

public class Division3 {

	public static void main(String[] args) {

		try {
			division();

		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
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
