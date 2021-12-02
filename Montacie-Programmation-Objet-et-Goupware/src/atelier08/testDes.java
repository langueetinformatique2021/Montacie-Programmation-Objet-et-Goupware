package atelier08;

public class testDes {

	public static void main(String[] args) {
		Des d1 = new Des();
		Des d2 = new Des();
		Des d3 = new Des();
		lancerDes(d1, d2, d3);
	}

	public static void lancerDes(Des d1, Des d2, Des d3) {
		System.out.println(d1.lancer() + " " + d2.lancer() + " " + d3.lancer());

	}

}
