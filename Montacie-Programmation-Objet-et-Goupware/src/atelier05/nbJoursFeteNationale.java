package atelier05;

/** Calcul du nombre de jours restant avant le 14 juillet 2026 */
 
public class nbJoursFeteNationale {

	public static void main(String[] args) {
		// Instanciation de deux objets de type date
				Date today = new Date(13,11,2025); 
				Date dfin = new Date(14,7,2026);
				int nJours = 0;

				do { today.Incrementer(); nJours++;}
				while (today.CompareTo(dfin));
				
				System.out.print("Le nombre de jours avant la fête nationale est égal à "+ nJours);

			
		

	}

}
