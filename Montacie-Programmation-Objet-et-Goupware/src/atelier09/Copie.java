package atelier09;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class Copie {

	public static void main(String[] args) {

		try {
			File fin = new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt");
			FileInputStream fsource = new FileInputStream(fin);	
			byte[] tmp = new byte[(int)fin.length()];
			fsource.read(tmp);
			fsource.close();
			
			FileOutputStream fcible = new FileOutputStream(
					new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/NomC.txt"));
			fcible.write(tmp);
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
