package atelier05;

public class testFete {

	/** calcul du nombre de jours entre aujourd'hui et le 14 juillet 2022 */
	public static void main(String[] args) {
		Date today = new Date(28, 10, 2021);
		Date fete = new Date(14, 7, 2022);

		// on incrémente today tant que cette date n'est pas égale à fete

		int nbJours = 0;
		while (today.CompareTo(fete) == true) {
			today.Incrementer();
			nbJours++;
		}

		System.out.println("Le nombre de jours est égal à " + nbJours);

	}

}
