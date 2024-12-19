package atelier09;  
import java.io.*;
import util.Keyboard;
public class tstLctTxt {
	public static void main(String[] args) {
		int num[] = { 21402871, 21104591, 21401764, 21408349, 21314076, 21109469, 21202064, 21415136, 21410005,
				21415557, 21200439, 21407911, 21101218, 28607925, 21400908, 21314636 };

		String ligne;
		int numLigne = 0;
		try {
			File f = new File("Nom.txt");
			FileReader fr = new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			while ((ligne=br.readLine()) != null) {
				System.out.println(ligne + " " + num[numLigne++]); 
			}
			br.close();
		} 
		catch (IOException e) { e.printStackTrace(); }
	} 
}
