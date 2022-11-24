package atelier08;

public class PileFace {
	public static void main(String[] args) {
		Aleat pileface = new Aleat(2);

		int pile = 0, face = 0;
		for (int i = 0; i < 1000; i++) {
			int tire = pileface.get();
			System.out.print(tire);
			if (tire == 1)
				pile++;
			else
				face++;
		}
		System.out.println();
		System.out.println(pile + " piles et " + face + " faces");

	}
}