package atelier01;

public class SimpleProgramme1 {

	public static void main(String[] args) {
		
		String nom = "Vous pouvez lui envoyer vos questions en mentionnant « TCHAT » au début, afin que nous puissions les repérer dans le fil de vos contributions. Merci d’avance à tous et à toutes pour votre participation !";
		System.out.println(nom);
		
		String mots[] = nom.split(" ");
		for (int i = 0;i < mots.length;i++)
			System.out.println(mots[i]);
		
	}

}
