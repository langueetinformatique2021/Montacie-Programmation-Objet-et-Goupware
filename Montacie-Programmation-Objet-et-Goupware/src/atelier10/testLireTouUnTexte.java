package atelier10;

import java.io.File;

public class testLireTouUnTexte {


	public static void main(String[] args) {
		
		LireToutUnTexte lt = new LireToutUnTexte(new File("adelaide.txt"));
		lt.afficher();
		System.out.println(lt.Chercher("Rothbanner"));
		
	}

}
