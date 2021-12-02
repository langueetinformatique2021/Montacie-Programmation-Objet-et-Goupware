package atelier08;

public class PileouFace {

	public static void main(String[] args) {
		Aleat pf = new Aleat(2);
		int pile = 0,face = 0;
		
		for (int i = 0;i < 1000;i++) {
			if (pf.get() == 1) {
				System.out.println("pile");
				pile++;
			}
			else {
				System.out.println("face");
				face++;
			}
		}
		System.out.println(pile + " pile  et " + face + " face");

	}

}
