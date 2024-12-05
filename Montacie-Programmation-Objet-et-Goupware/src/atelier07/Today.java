package atelier07;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class Today {
	
	/** point d'entrée d'un exécutable */
	public static void main(String[] args) { 
		
		// get the supported TimeZone tz for (Europe/Paris Time)
		TimeZone tz = TimeZone.getTimeZone("Europe/Paris");
		
		 // create a GregorianCalendar with the Europe/Paris time zone
		 // and the current date and time
		 Calendar calendar = new GregorianCalendar(tz);
		 Date trialTime = new Date();
		 calendar.setTime(trialTime);
		
		 // Afficher la date courante
		 System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
		 System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
		 System.out.println("DAY_OF_MONTH: " + calendar.get(Calendar.DAY_OF_MONTH));
		 System.out.println("HOUR_OF_DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
		 System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
		 System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
		 System.out.println("MILLISECOND: " + calendar.get(Calendar.MILLISECOND));
	
	}

}
