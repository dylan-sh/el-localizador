
public class User {

	private String locationGenreDesired;
	private double currentLong;
	private double currentLat;
	private boolean userConsent;
	
	
	public User(String locationGenreDesired, double currentLong, double currentLat, boolean userConsent)
	{
		this.locationGenreDesired = locationGenreDesired;
		this.currentLong = currentLong;
		this.currentLat = currentLat;
		this.userConsent = userConsent;
	}
	public String getGenre()
	{
		return locationGenreDesired;
	}
	
	public double getLong()
	{
		return currentLong;
	}
	
	public double getLat()
	{
		return currentLat;
	}
	
	public boolean getUCon()
	{
		return userConsent;
	}
	public void setGenre(String locationGenreDesired)
	{
		this.locationGenreDesired = locationGenreDesired;
	}
	public void setCurrentLong(double currentLong)
	{
		this.currentLong = currentLong;
	}
	public void setCurrentLat(double currentLat)
	{
		this.currentLat = currentLat;
	}
	public void setUserConsent(boolean userConsent)
	{
		this.userConsent = userConsent;
	}
}
