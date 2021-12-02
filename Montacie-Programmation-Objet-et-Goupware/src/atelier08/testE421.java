package atelier08;

public class testE421 {

	public static void main(String[] args) {
		Des d1 = new Des();
		Des d2 = new Des();
		Des d3 = new Des();
		int n = 0;
		try {
			while (true) {
				lancerDes421(d1, d2, d3);
				n++;
			}
		}

		catch (E421 e) {
			System.out.println(e.getMessage() + " " + n);
		}
	}

	public static void lancerDes421(Des d1, Des d2, Des d3) throws E421 {
		if ((d1.lancer() == 4) && (d2.lancer() == 2) && (d3.lancer() == 1))
			throw new E421("gagnant");

	}

}
