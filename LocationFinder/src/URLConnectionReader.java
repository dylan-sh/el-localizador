/*import java.net.*;
import java.io.*;

public class URLConnectionReader {
    public static void main(String[] args) throws Exception {
        URL ipStack = new URL("http://api.ipstack.com/168.69.254.242?access_key=9f5c5f44f9c56d762d0deacf347a6b07&format=1");
        URLConnection yc = ipStack.openConnection();
        BufferedReader in = new BufferedReader(
                                new InputStreamReader(
                                yc.getInputStream()));
        String inputLine;

        while ((inputLine = in.readLine()) != null) 
            System.out.println(inputLine);
        in.close();
    }
}*/