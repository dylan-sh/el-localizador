import java.util.Date;

public class EstablishmentTester {

	
	public static void main(String[]args)
	{
		Date d = new Date(2323223232L);
		Establishment vindaloosCafe = new Establishment("cafe", 26, 27, "Vindaloo's Cafe", 4, "Great Place!", 3, d, "123 Fake Street");
		System.out.println(vindaloosCafe.getGenre());
		System.out.println(vindaloosCafe.getLong());
		System.out.println(vindaloosCafe.getLat());
		System.out.println(vindaloosCafe.getName());
		System.out.println(vindaloosCafe.getRating());
		System.out.println(vindaloosCafe.getNotes());
		System.out.println(vindaloosCafe.getNumTimesVisited());
		System.out.println(vindaloosCafe.getLastVisitDate());
		vindaloosCafe.setERating(2);
		vindaloosCafe.setENotes("Terrible Place");
		vindaloosCafe.incrementNumTimesVisited();
		vindaloosCafe.refreshLastVisitDate();
		System.out.println(vindaloosCafe.getRating());
		System.out.println(vindaloosCafe.getNotes());
		System.out.println(vindaloosCafe.getNumTimesVisited());
		System.out.println(vindaloosCafe.getLastVisitDate());
		/* Expected output:
		 * cafe
		 * 26.0
		 * 27.0
		 * Vindaloo's Cafe
		 * 4
		 * Great Place!
		 * 3
		 * Tue Jan 27 15:20:23 CST 1970
		 * 2
		 * Terrible Place
		 * 4
		 * Tue Oct 02 09:47:49 CDT 2018
		 */
		
		
		
		
		
		
	}
}
