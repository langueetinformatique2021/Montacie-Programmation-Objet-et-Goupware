package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;
import java.util.zip.DeflaterOutputStream;
import java.io.DataOutputStream;

public class Compresse {

	public static void main(String[] args) {
		
		try {
			FileInputStream f1 = new FileInputStream(new File("Adelaide.txt"));
			long taille = f1.available();
			FileOutputStream f2 = new FileOutputStream(new File("Adelaidecompresse.txt"));
			DeflaterOutputStream dos = new DeflaterOutputStream(f2);
			DataOutputStream fdos = new DataOutputStream(dos);
			
			for (long i = 0;i < taille;i++) {
				int tmp = f1.read();
				fdos.write(tmp);
			}

			f1.close();
			fdos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
