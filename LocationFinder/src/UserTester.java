
public class UserTester {

	public static void main(String[]args) throws Exception
	{
		User vindaloo = new User("cafe", 23, 24, true);
		System.out.println(vindaloo.getGenre());
		System.out.println(vindaloo.getLong());
		System.out.println(vindaloo.getLat());
		System.out.println(vindaloo.getUCon());
		vindaloo.setGenre("doggo");
		vindaloo.setCurrentLong(24.6);
		vindaloo.setCurrentLat(23.4);
		vindaloo.setUserConsent(false);
		System.out.println(vindaloo.getGenre());
		System.out.println(vindaloo.getLong());
		System.out.println(vindaloo.getLat());
		System.out.println(vindaloo.getUCon());
		/* Expected output:
		 * cafe
		 * 23.0
		 * 24.0
		 * true
		 * doggo
		 * 24.6
		 * 23.4
		 * false
		 * 9f5c5f44f9c56d762d0deacf347a6b07
		 */
		
		
		LocationGetter location = new LocationGetter();
		System.out.println(location.getCity());
		System.out.println(location.getState());
		System.out.println(location.getLatitude());
		System.out.println(location.getLongitude());
	}
}
