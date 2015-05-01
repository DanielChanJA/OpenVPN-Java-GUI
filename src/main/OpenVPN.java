package main;

import java.io.*;


public class OpenVPN {

	public static String errorConnecting, userpassIncorrect, tryAgain;
	
	
	public static void main (String[] args) {
		
		
		//Instance the OpenVPNs but don't execute the commands unless told to.
		Runtime OVPN_HK1 = Runtime.getRuntime();
		Runtime OVPN_LAX1 = Runtime.getRuntime();
		Runtime OVPN_LV1 = Runtime.getRuntime();
		Runtime OVPN_NY1 = Runtime.getRuntime();
		
		
		errorConnecting = "Unable to connect to servers at this time. Please try again later.";
		userpassIncorrect = "You have entered an invalid username or password.";
		tryAgain = "Please try again.";
		
		
		
		try {
			Process pr_OVPN = OVPN_HK1.exec("openvpn");
		} catch (IOException e) {
			System.out.println("Unable to find the files.");
			e.printStackTrace();
		}
		
		
		
		
		
	}
	
	
	
}
