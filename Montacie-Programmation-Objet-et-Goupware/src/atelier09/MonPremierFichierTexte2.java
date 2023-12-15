package atelier09;

import java.io.PrintWriter;
import java.io.File;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class MonPremierFichierTexte2 {
	public static void main(String[] args) {
		try {
			PrintWriter pr = new PrintWriter(new File("Noms.txt"));
			pr.println("Claude Montacié");
			pr.println("Laurence Devillers");
			pr.close();
			System.out.println("Fin d'écriture fichier");
		} catch (IOException e) {
			e.printStackTrace();
		}
		Verif();
	}

	public static void Verif() {
		String ligne;
		try {
			BufferedReader br = new BufferedReader(new FileReader(new File("Noms.txt")));
			while ((ligne = br.readLine()) != null) {
				System.out.println(ligne);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
