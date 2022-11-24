package atelier08;
public class Division2 {
	public static void main(String[] args) { division(); }

	public static void division() throws ArithmeticException {
		try {
		int i = 1000, j;
		do {i--; j = 1 / i;} while (true);
		} catch (ArithmeticException e){
			System.out.println(e.getMessage());
		}
	}

}