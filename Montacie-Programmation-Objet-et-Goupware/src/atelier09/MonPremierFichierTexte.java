package atelier09;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;

public class MonPremierFichierTexte {

	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt"));
			pr.println("Victoria Eyrabide");
			pr.println("Claude Montacié");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
