package atelier02;
/** B contient la méthode divise retournant la valeur n/2 si un entier n passé en paramètre est
divisible par 13 ( n + 2 dans le cas contraire)
 * 
 */
public class B {
	
	/** méthode divise retournant la valeur n/2 si un entier n passé en paramètre est
divisible par 13 ( n + 2 dans le cas contraire)
	 * 
	 * @param n entier
	 * @return n/2 si n est divisible par 13 ( n + 2 dans le cas contraire)
	 */

	public static int divise(int n) {

		if (A.treize(n) == true)
			return n / 2;
		else
			return n + 2;

	}

}
