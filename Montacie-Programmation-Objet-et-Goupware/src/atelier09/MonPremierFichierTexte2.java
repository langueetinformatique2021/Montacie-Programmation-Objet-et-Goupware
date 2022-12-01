package atelier09;

import java.io.File;
import java.io.PrintWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedReader;

public class MonPremierFichierTexte2 {

	public static void main(String[] args) {

		try {
			PrintWriter pr = new PrintWriter(
					new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt"));
			pr.println("Victoria Eyhrabide");
			pr.println("Claude Montacié");
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println(Verifier());

	}

	public static boolean Verifier() {
		try {
			BufferedReader br = new BufferedReader(
					new FileReader(new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt")));
			if (br.readLine().equals("Victoria Eyhrabide") == false)
				return false;
			if (br.readLine().equals("Claude Montacié") == false)
				return false;
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
		
	}

}
