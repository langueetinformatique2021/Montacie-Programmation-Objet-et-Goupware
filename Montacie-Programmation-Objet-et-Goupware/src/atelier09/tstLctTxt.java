package atelier09;  
import java.io.*;
import util.Keyboard;
public class tstLctTxt {
	public static void main(String[] args) {
		String ligne;

		try {
			File f = new File("Montacie-Programmation-Objet-et-Goupware/src/atelier09/Nom.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((ligne=br.readLine()) != null) {
				System.out.println(ligne); 
			}
			br.close();
		} 
		catch (FileNotFoundException e) { e.printStackTrace(); }
		catch (IOException e) { e.printStackTrace(); }
	} 
}
