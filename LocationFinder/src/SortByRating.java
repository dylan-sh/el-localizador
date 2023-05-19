import java.util.*;

public class SortByRating implements Comparator<Establishment>{

	public int compare(Establishment a, Establishment b)
	{
		return a.getRating() - b.getRating();
	}
	
}
