package atelier08;

public class division2 {
	public static void main(String[] args) {
		int i = 1000, j;
		try {
		do {
			i--;
			j = 1 / i;
		} while (true);
		}
		catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.exit(0);
		}
	}
}