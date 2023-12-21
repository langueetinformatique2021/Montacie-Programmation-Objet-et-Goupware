package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Copie {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1 = new FileInputStream(new File("Noms.txt"));
			long taille = f1.available();
			FileOutputStream f2 = new FileOutputStream(new File("Nomscopie.txt"));
			
			for (long i = 0;i < taille;i++) {
				int tmp = f1.read();
				f2.write(tmp);
			}

			f1.close();
			f2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
