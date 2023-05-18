import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;


public class LocationGetter {
	private double latitude;
	private double longitude;
	private String city = "";
	private String state = "";
	
	
	public LocationGetter() throws Exception
	{
		//find ip address and append to end
		
		
		URL whatismyip = new URL("http://checkip.amazonaws.com");
		BufferedReader ye = new BufferedReader(new InputStreamReader(
		                whatismyip.openStream()));

		String ip = ye.readLine(); //you get the IP as a String
		System.out.println(ip);
		
		
		
		
		URL ipStack = new URL("http://api.ipstack.com/" + ip + "?access_key=9f5c5f44f9c56d762d0deacf347a6b07&format=1");
        URLConnection yc = ipStack.openConnection();
        Scanner in = new Scanner(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;
        
        while (in.hasNextLine()) 
        {
        	inputLine = in.nextLine();
            System.out.println(inputLine);
            if(inputLine.contains("city"))
            	city = inputLine.substring(10, inputLine.length() -2);
            if(inputLine.contains("region_name"))
            	state = inputLine.substring(17, inputLine.length() -2);
            if(inputLine.contains("latitude"))
            	latitude = Double.parseDouble(inputLine.substring(13, inputLine.length() -2));
            if(inputLine.contains("longitude"))
            	longitude = Double.parseDouble(inputLine.substring(14, inputLine.length() -2));
        }
        in.close();
        
       
	}
	
	public String getCity()
	{
		return city;
	}
	
	public String getState()
	{
		return state;
	}
	
	public double getLongitude()
	{
		return longitude;
	}
	
	public double getLatitude()
	{
		return latitude;
	}
}
