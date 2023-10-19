package atelier02;

/** testA permet de tester les méthodes de la classe A
 * 
 */

public class testAB {
	
	/** test de la méthode divise de la classe B
	 * 
	 * @param args non utilisé
	 */

	public static void main(String[] args) {
		int i = 1;
		int m = 60;

		for (int j = 0; j < m; j++) {
			System.out.println(j + " " + i);
			i = B.divise(i);
			
		}

	}

}
