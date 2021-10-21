package atelier04;

public class Boucle1 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytrezb";
		int i1 = 0, i2 = s2.length() - 1;
		char c1, c2;
		boolean flag = false;

		if (s1.length() == s2.length()) {
			int i, n = s1.length();
			for (i = 0; i < n; i++) {
				if (s1.charAt(i) != s2.charAt(n - i - 1))
					break;
			}
			if (i == n)
				flag = true;

		}

		System.out.println(flag);
	}

}
