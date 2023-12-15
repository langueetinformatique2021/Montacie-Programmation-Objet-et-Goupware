package atelier09;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;


public class MonPremierFichierTexte {
	public static void main(String[] args) {
		try {
			PrintWriter pr = new PrintWriter(new File("Noms.txt"));
			pr.println("Claude Montacié");
			pr.println("Laurence Devillers");
			pr.close();
			System.out.println("Fin d'écriture fichier");
		} 
		catch (IOException e) { e.printStackTrace(); }
	} 
}
