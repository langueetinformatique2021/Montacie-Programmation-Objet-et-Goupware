package atelier09;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichierTexte {

	public static void main(String[] args) {
		try {
			File f = new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt");
			PrintWriter pr = new PrintWriter(f);
			pr.println("Claude Montacié");
			pr.close();
		} 
		catch (IOException e) { e.printStackTrace(); }

	}

}
