package atelier09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

import util.Keyboard;

public class MonPremierFichierTexte {

	public static void main(String[] args) {
		
		String noms[] = {"Claude Montacié"};
		String nomf = "Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt";
		try {
			File f = new File(nomf);
			PrintWriter pr = new PrintWriter(f);
			for (int i = 0;i < noms.length;i++)
				pr.println(noms[i]);
			pr.close();
		} 
		catch (IOException e) { e.printStackTrace(); }
		
		System.out.println(Verifier(nomf, noms));

	}
	
	public static boolean Verifier(String nomf, String[] noms) {
		String ligne;
		int i = 0;
		try {
			File f = new File(nomf);
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((ligne=br.readLine()) != null) {
				System.out.println(ligne); 
				if (ligne.equals(noms[i++]) == false)
					return false;
			}
			br.close();
		} 
		catch (IOException e) { e.printStackTrace(); }
		
		return true;
	}
	

}
