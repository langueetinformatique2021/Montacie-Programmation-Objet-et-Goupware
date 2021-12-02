package atelier08;

public class division2 {
	public static void main(String[] args) {
		try {
			int i = 1000, j;
			do {
				i--;
				j = 1 / i;
			} while (true);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());

		}
	}
}