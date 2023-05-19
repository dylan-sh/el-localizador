import java.util.ArrayList;
import java.util.Collections;
//import java.util.Date;

public class DatabaseTester {

	public static void main(String[]args)
	{
		/*
		System.out.println("dog");
		ArrayList<Establishment> establishments= new ArrayList<Establishment>();
		Date d = new Date(2323223232L);
		Establishment vindalsCafe = new Establishment("cafe", 4, 25, "big number", 5, "Great Place!", 3, d);
		Establishment vindaloosCafe = new Establishment("cafe", 3, 4, "5", 3, "Great Place!", 3, d);
		Establishment vindalosCafe = new Establishment("cafe", 1, 2, "root 5", 4, "Great Place!", 3, d);
		
		establishments.add(vindaloosCafe);
		establishments.add(vindalosCafe);
		establishments.add(vindalsCafe);
		Database database = new Database(establishments);
		System.out.println(database);

		//expected 558 miles or 899 km
		System.out.println(database.findDistance(5, 50, 3, 58));
		
		
		
		
		ArrayList<Establishment> sorted = database.search(0,0, 99999, "cafe");	
		System.out.println(sorted);
		System.out.println("dog");
		System.out.println(sorted.get(0).getName());
		for(Establishment s: sorted)
			System.out.println(s.getDistanceFrom());
		Collections.sort(sorted, new SortByDistance());
		for(Establishment s: sorted)
			System.out.println(s.getDistanceFrom());
		System.out.print(sorted);
		
		
		//rating
		System.out.println("Rating now");
		for(Establishment s: sorted)
			System.out.println(s.getRating());
		Collections.sort(sorted, new SortByRating());
		for(Establishment s: sorted)
			System.out.println(s.getRating());
		System.out.print(sorted);
		*/
		
		Database establishments = new Database();
		
		
		System.out.println(establishments);
		
		ArrayList<Establishment> dog = establishments.search(0, 0, 9999999, "banking");
		for(Establishment s: dog)
		{
			System.out.println(s);
		}
		
		for(Establishment s: dog)
			System.out.println(s.getDistanceFrom());
		Collections.sort(dog, new SortByDistance());
		for(Establishment s: dog)
			System.out.println(s.getDistanceFrom());
		System.out.print(dog);
		
		
		
		
	}
}
