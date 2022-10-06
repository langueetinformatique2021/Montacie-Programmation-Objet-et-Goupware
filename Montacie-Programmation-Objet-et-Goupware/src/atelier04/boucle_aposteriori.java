package atelier04;

public class boucle_aposteriori {

	public static void main(String[] args) {

		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length() - 1;
		
		char c1, c2;

		
		if (s1.length() == s2.length()) {
			do {
				c1 = s1.charAt(i1);
				c2 = s2.charAt(i2);
				i1++;
				i2--;
			}
			while ((i2 >= 0) && (c1 == c2)); 
			
			if (i2 == -1)
				System.out.println("mot miroir");
		}
		

	}

}
