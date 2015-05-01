/*
 * This class contains the methods for the connection. For now this class will contain methods that I will personally use. 
 * But users can adapt it to their settings. 
 * 
 */



package main;

import java.io.*;


public class OpenVPN {
	
	public String errorConnecting, userpassIncorrect, tryAgain, openvpn_path;
	
	
	//Instance the OpenVPNs but don't execute the commands unless told to.
	Runtime OVPN_HK1 = Runtime.getRuntime();
	static Runtime OVPN_LAX1 = Runtime.getRuntime();
	static Runtime OVPN_LV1 = Runtime.getRuntime();
	static Runtime OVPN_NY1 = Runtime.getRuntime();
	
	public void bootUP() {
		
		errorConnecting = "Unable to connect to servers at this time. Please try again later.";
		userpassIncorrect = "You have entered an invalid username or password.";
		tryAgain = "Please try again.";
		
		
		
	}
	
	
	public void openvpn_HK1() {
		
		
		//Temporarily added, will link up with GUI soon. Do not touch yet!
		try {
			Process oHK1 = OVPN_HK1.exec("openvpn hk1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the files.");
			e.printStackTrace();
		}
		
		
	}
	
	
	public void openvpn_LAX1() {
	
		try {
			Process oLAX1 = OVPN_LAX1.exec("openvpn lax1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the files.");
			e.printStackTrace();
		}
		
		
	}
	
	
	public void openvpn_LV1() {
		
		try {
			Process oLV1 = OVPN_LV1.exec("openvpn lax1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the files.");
			e.printStackTrace();
		}
		
	}
	
	public void openvpn_NY1() {
		
		try {
			Process oNY1 = OVPN_NY1.exec("openvpn lax1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the files.");
			e.printStackTrace();
		}
		
	}
	
	
	
}
