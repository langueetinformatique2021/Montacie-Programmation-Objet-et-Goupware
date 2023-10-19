package atelier02;

/** testB permet de tester les méthodes de la classe B
 * 
 */

public class testB {
	
	/** test de la méthode divise de la classe B
	 * 
	 * @param args non utilisé
	 */

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			System.out.println(i + " " + B.divise(i));
		}

	}

}
