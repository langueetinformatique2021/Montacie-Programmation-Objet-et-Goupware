package atelier09;

import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.DeflaterOutputStream;

public class Compresse {

	public static void main(String[] args) {
		byte mem;
		String nomf = "Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom";
		try {
			FileInputStream fis = new FileInputStream(nomf+".txt");
			FileOutputStream fos = new FileOutputStream(nomf+"_zip.txt");
			DeflaterOutputStream dos = new DeflaterOutputStream(fos);
			DataOutputStream fdos = new DataOutputStream(dos);
			
			while ((mem=(byte)fis.read()) != -1) {
				fdos.write(mem); 
			}
			fis.close();
			fdos.close();
		} 
		catch (IOException e) { e.printStackTrace(); }

	}

}
