package atelier04;

public class Boucle2 {

	public static void main(String[] args) {
		String s1 = "azerty", s2 = "ytreza";
		boolean flag = false;

		if (s1.length() == s2.length()) {
			int i = 0, n = s1.length();
			do {
				if (s1.charAt(i) != s2.charAt(n - i - 1))
					break;
				i++;
			}
			while (i < n);
			if (i == n)
				flag = true;

		}

		System.out.println(flag);
	}


}
