import java.util.ArrayList;
import java.util.Collections;

public class WholeTester {

	public static void main(String[]args) throws Exception
	{
		LocationGetter location = new LocationGetter();
		User vindaloo = new User("banking", location.getLongitude(), location.getLatitude(), true);
		System.out.println(vindaloo.getLat());
		System.out.println(vindaloo.getLong());
		Database database = new Database();
		ArrayList<Establishment> searched = database.search(vindaloo.getLong(), vindaloo.getLat(), 20, vindaloo.getGenre());
		Collections.sort(searched, new SortByDistance());
		for(Establishment s: searched)
			System.out.println(s);
		//now work out ratings and comments and creating a new file and reading it for them and date and num times
		System.out.println(searched.get(9));
		for(Establishment s: searched)
			s.setENotes("vineeth is a dog");
		database.savesComments();
		Database doggo = new Database();
		ArrayList<Establishment> doggo2 = doggo.search(vindaloo.getLong(), vindaloo.getLat(), 20, vindaloo.getGenre());
		Collections.sort(doggo2, new SortByDistance());
		for(Establishment s: doggo2)
			System.out.println(s);
		
	}
}
