import java.util.Date;

public class Establishment {

	private String eGenre;
	private double eLong;
	private double eLat;
	private String eName;
	private int eRating;
	private String eNotes;
	private int numTimesVisited;
	private Date lastVisitDate;
	private int distanceFrom;
	private String address;
	
	public Establishment(String eGenre, double eLong, double eLat, String eName, int eRating, String eNotes, int numTimesVisited, Date lastVisitDate, String address)
	{
		this.eGenre = eGenre;
		this.eLong = eLong;
		this.eLat = eLat;
		this.eName = eName;
		this.eRating = eRating;
		this.eNotes = eNotes;
		this.numTimesVisited = numTimesVisited;
		this.lastVisitDate = lastVisitDate;
		this.address = address;
	}
	

	
	public String getGenre()
	{
		return eGenre;
	}
	
	public double getLong()
	{
		return eLong;
	}
	
	public double getLat()
	{
		return eLat;
	}
	
	public String getName()
	{
		return eName;
	}
	
	public int getRating()
	{
		return eRating;
	}
	
	public String getNotes()
	{
		return eNotes;
	}
	
	public int getNumTimesVisited()
	{
		return numTimesVisited;
	}
	public Date getLastVisitDate()
	{
		return lastVisitDate;
	}
	public void setERating(int eRating)
	{
		this.eRating = eRating;
	}
	public void setENotes(String eNotes)
	{
		this.eNotes = eNotes;
	}
	
	public void incrementNumTimesVisited()
	{
		numTimesVisited++;
	}
	
	public void setNumTimesVisited(int i)
	{
		numTimesVisited = i;
	}
	
	public void refreshLastVisitDate()
	{
		Date d1 = new Date();
		lastVisitDate = d1;
	}
	
	public void setLastVisitDate(Date d)
	{
		lastVisitDate = d;
	}
	
	public void setDistanceFrom(int distanceFrom)
	{
		this.distanceFrom = distanceFrom;
	}
	
	public int getDistanceFrom()
	{
		return distanceFrom;
	}
	
	public String getAddress()
	{
		return address;
	}
	
	
	
	public String toString()
	{
		return eGenre + " " + eLong + " " + eLat + " " + eName + " " + eRating + " " + eNotes + " " + numTimesVisited + " " + lastVisitDate + " ";
	}
	
	
	
	
}
