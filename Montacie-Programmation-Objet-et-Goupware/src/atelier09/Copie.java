package atelier09;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class Copie {

	public static void main(String[] args) {
		File fent = new File("Noms.txt");
		System.out.println(fent.length());
		try {
			FileInputStream f1 = new FileInputStream(fent);
			System.out.println(f1.available());

			FileOutputStream f2 = new FileOutputStream(new File("Nomscopie.txt"));

			f1.close();
			f2.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
