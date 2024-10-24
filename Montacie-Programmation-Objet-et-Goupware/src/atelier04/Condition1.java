package atelier04;

public class Condition1 {
	public static void main(String[] args) {
	int p1 = -1, p2 = 9, p3 = 8, p4 = 4, p5 = 8;
	int max;
	
	if (p1 > p2) {
		if (p1 > p3) 
			max = p1;
		else 
			max = p3;
	}
	else {
		if (p2 > p3)
			max = p2;
		else
			max = p3;
	}
	
	System.out.println(max);
	
	
	/** à tester avec les six cas possibles 
	 *  p1 > p2 > p3
	 *  p1 > p3 > p2
	 *  p2 > p3 > p1
	 *  p2 > p1 > p3	 
	 *  p3 > p2 > p1
	 *  p3 > p1 > p2	 
	 */
	
	
	
	}
}

