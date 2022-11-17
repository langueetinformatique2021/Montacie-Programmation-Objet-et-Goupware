package atelier07;

import java.util.Date;
import java.util.GregorianCalendar;

/** dérivée de Calendar implémentant un nouvel attribut cours 
 * et trois nouvelles méthodes creation() afficher() et duree() */
public class Calendar2 extends GregorianCalendar {
	
	private boolean cours;
	
	public Calendar2() {
		Date date = new Date();
		this.setTime(date);	
	}
	
	/** affiche la date et l’heure de la création de l’objet */
	public void creation() {
		System.out.println("TIME: " + this.getTime());
	}
	
	/** affiche la date et l’heure courante */
	public void afficher() {
		Date date = new Date();
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(date);	
		System.out.println("TIME: " + calendar.getTime());
	}
	
	/** affiche le nombre de secondes depuis la création de l’objet */
	public void duree() {}
	
	

}
