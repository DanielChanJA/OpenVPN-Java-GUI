package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.UnknownHostException;

public class IPCheck {

	
	
	URL url;
	
	
	public void ipCheck() {
		
		
		
		
		try {
		
			url = new URL("http://checkip.amazonaws.com/");
			BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
			System.out.println(br.readLine());
			
			
		} catch (UnknownHostException e) {
			
			e.printStackTrace();
			System.out.println("Unable to connect to AWS servers.");
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
			System.out.println("Error reading in information.");
			
		}
		
		
		
		
	}
	
	
}
