import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Database {

	private ArrayList<Establishment> establishments = new ArrayList<Establishment>();
	
	//unknown if necessary at all
	/*
	public Database(ArrayList<Establishment> establishments)
	{
		this.establishments =  establishments;
	}
	*/
	
	public Database()
	{
		File file = new File("locations.txt");
		File commentsRatings = new File("commentsratings.txt");
		ArrayList<Establishment> dog = new ArrayList<Establishment>();
		
		
		try {
			Scanner scan = new Scanner(file);
			
			while(scan.hasNextLine()) {
				String line = scan.nextLine();
				String[] data = line.split("\\\t");
				Date d = new Date(2323223232L);
				Establishment item = new Establishment(data[2], Double.parseDouble(data[3]), Double.parseDouble(data[4]), data[0], 0, "null", 0, d, data[1]);
				dog.add(item);
			}
			scan.close();
			
			try {
				Scanner scan2 = new Scanner(commentsRatings);
				String line2 = scan2.nextLine();
				String[] data2 = line2.split("\\\t");
				while(scan.hasNextLine()) {
					for(Establishment s: establishments)
					{
						if(data2[0] == s.getAddress()){
							//0 is addy, 1 is rating, 2 is notes, 3 is last, 4 is num times visited
							s.setERating((int)Double.parseDouble(data2[1]));
							s.setENotes(data2[2]);
							Date d3 = convertStringtoDate(data2[3]);
							s.setLastVisitDate(d3);
							s.setNumTimesVisited((int)Double.parseDouble(data2[4]));	
							
						}
					}
					
				}
				scan2.close();
				
				
			} 
			
			catch(FileNotFoundException d) {
				System.out.print("oof");
				//File locations2 = new File("locations.txt");
				//File commentsRatings = new File("commentsratings.txt");
				try {
				BufferedWriter fileWrite = new BufferedWriter(new FileWriter("commentsratings.txt", true));
				for(Establishment l: dog)
					fileWrite.write(l.getAddress() + "\t" + l.getRating() + "\t" + l.getNotes() + "\t" + convertDateToString(l.getLastVisitDate()) + "\t" + l.getNumTimesVisited() + "\t");
				
				d.printStackTrace();
				fileWrite.close();
				}
				
				catch(IOException f) {
					System.out.print("oof");
					f.printStackTrace();
				}
			
			}
			
			
		}
		
		catch(FileNotFoundException e) {
			System.out.print("oof");
			e.printStackTrace();
		}
		
		establishments = dog;
		
		
	}
	
	
	public ArrayList<Establishment> search(double longitude, double latitude, int radius, String genre)
	{
		ArrayList<Establishment> results = new ArrayList<Establishment>();
		for(Establishment s: establishments)
			if((s.getGenre().equals(genre)) && (findDistance(longitude, latitude, s.getLong(), s.getLat()) < radius))
				results.add(s);
		for(Establishment r: results)
		{
			r.setDistanceFrom(findDistance(longitude,latitude, r.getLong(), r.getLat()));
		}
		return results;
	}
	
	public int findDistance(double longitude, double latitude, double eLongitude, double eLatitude)
	{
		
		
		double distance;
		final int R = 6371; // Radius of the earth

		double latDistance = Math.toRadians(eLatitude - latitude);
		double lonDistance = Math.toRadians(eLongitude - longitude);
		double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
		            + Math.cos(Math.toRadians(latitude)) * Math.cos(Math.toRadians(eLatitude))
		            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
		double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
		distance = R * c * 0.621371; // convert to miles


		    

		return (int) distance;
	}
	
	public void savesComments()
	{
		System.out.print("oof");
		//File locations2 = new File("locations.txt");
		//File commentsRatings = new File("commentsratings.txt");
		try {
		BufferedWriter fileWrite = new BufferedWriter(new FileWriter("commentsratings.txt", true));
		for(Establishment l: establishments)
			fileWrite.write(l.getAddress() + "\t" + l.getRating() + "\t" + l.getNotes() + "\t" + convertDateToString(l.getLastVisitDate()) + "\t" + l.getNumTimesVisited() + "\t");
		fileWrite.close();
		}
		
		catch(IOException f) {
			System.out.print("oof");
			f.printStackTrace();
		}
	
	}
	
	
	
	
	
	public Date convertStringtoDate(String s)
	{
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		LocalDate date = LocalDate.parse(s, formatter);
		java.util.Date date2 = java.sql.Date.valueOf(date);
		return date2;
	}
	
	public String convertDateToString(Date d){
		
	       // Date date2 = new Date();
	 
	        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
	 
	        //to convert Date to String, use format method of SimpleDateFormat class.
	        String strDate = dateFormat.format(d);
	 
	        return strDate;
	}
	
	
	
	public String toString()
	{
		String st = "";
		for(Establishment s: establishments)
			st += s.toString();
		return st + "\t\t\t\t\t\t";
	}
	
	
	
	
}