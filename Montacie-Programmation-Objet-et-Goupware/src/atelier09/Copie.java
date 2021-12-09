package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

import util.Keyboard;

public class Copie {

	public static void main(String[] args) {
		byte mem;
		String nomf = "Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom";
		try {
			FileInputStream fis = new FileInputStream(nomf+".txt");
			FileOutputStream fos = new FileOutputStream(nomf+"_copie.txt");
			while ((mem=(byte)fis.read()) != -1) {
				fos.write(mem); 
			}
			fis.close();
			fos.close();
		} 
		catch (IOException e) { e.printStackTrace(); }
		

	}

}
