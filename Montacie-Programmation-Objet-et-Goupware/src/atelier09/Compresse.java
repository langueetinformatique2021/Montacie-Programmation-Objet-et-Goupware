package atelier09;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;
import java.io.FileInputStream;

public class Compresse {

	public static void main(String[] args) {

		try {
			File fin = new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt");
			FileInputStream fsource = new FileInputStream(fin);	
			byte[] tmp = new byte[(int)fin.length()];
			fsource.read(tmp);
			fsource.close();
			
	
			FileOutputStream fout = new FileOutputStream(
					new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt.zip"));
			DataOutputStream fcible = new DataOutputStream(new DeflaterOutputStream(fout));
			
			fcible.write(tmp);
			fcible.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
