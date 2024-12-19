package atelier09;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class MonPremierFichierTexte2 {
	static int num[] = { 21402871, 21104591, 21401764, 21408349, 21314076, 21109469, 21202064, 21415136, 21410005,
			21415557, 21200439, 21407911, 21101218, 28607925, 21400908, 21314636 };
	static File f = null;

	/** point d'entrée d'un exécutable */
	public static void main(String[] args) {
		try {
			f = new File("Nom.txt");
			PrintWriter pr = new PrintWriter(f);
			for (int i = 0; i < num.length; i++)
				pr.println(num[i]);
			pr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

		Verifier();

	}

	public static void Verifier() {

		String ligne;
		int numLigne = 0;
		try {
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((ligne = br.readLine()) != null) {
				if ((Integer.parseInt(ligne)!=num[numLigne++]))
					break;
			}
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if (numLigne == num.length)
			System.out.println("contenu vérifié");
	}
}
