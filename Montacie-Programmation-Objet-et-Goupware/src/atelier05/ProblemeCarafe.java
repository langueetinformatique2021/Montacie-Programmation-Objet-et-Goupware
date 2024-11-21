public class ProblemeCarafe {
	public static void main (String[] args) {
		Carafe carafe7 = new carafe(7);
		Carafe carafe4 = new Carafe(4);
		
		carafe7.rempl();
		carafe7.transvaserDans(carafe4);
		carafe4.vide();
		carafe7.transvaserDans(carafe4);
		carafe7.transvaserDans(carafe4);
		carafe4.vide();
		carafe7.transvaserDans(carafe4);
		carafe7.rempl();
		carafe7.transvaserDans(carafe4);
		
	}
}