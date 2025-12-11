package atelier09;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;


public class MonPremierFichierTexte {
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) {
		String nom = "Montacié";
		try {
			PrintWriter pr = new PrintWriter(new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt"));
			pr.println(nom);
			pr.close();
		}
		catch (FileNotFoundException e) {}
	}

}
