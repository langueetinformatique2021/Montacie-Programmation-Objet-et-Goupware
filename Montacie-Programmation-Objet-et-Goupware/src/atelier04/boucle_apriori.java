package atelier04;

public class boucle_apriori {

	public static void main(String[] args) {

		String s1 = "azerty", s2 = "ytreza";
		int i1 = 0, i2 = s2.length() - 1;

		
		if (s1.length() == s1.length()) {
			while ((i2 >= 0) && (s1.charAt(i1) == s2.charAt(i2))) {
				i1++;
				i2--;
			}
			if (i2 == -1)
				System.out.println("mot miroir");
			
		}
		

	}

}
