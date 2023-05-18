import java.util.*;


public class SortByDistance implements Comparator<Establishment>{

	public int compare(Establishment a, Establishment b)
	{
		return a.getDistanceFrom() - b.getDistanceFrom();
	}
	
}
