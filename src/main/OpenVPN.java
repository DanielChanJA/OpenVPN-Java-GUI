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
	static Runtime OVPN_HK1 = Runtime.getRuntime();
	static Runtime OVPN_LAX1 = Runtime.getRuntime();
	static Runtime OVPN_LV1 = Runtime.getRuntime();
	static Runtime OVPN_NY1 = Runtime.getRuntime();
	
	
	public void openvpn_HK1() {
		
		
		//Temporarily added, will link up with GUI soon. Do not touch yet!
		try {
			Process oHK1 = OVPN_HK1.exec("openvpn-gui hk1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the correct configuration. Please confirm that you have installed OpenVPN correctly.");
			e.printStackTrace();
		}
		
		
	}
	
	
	public void openvpn_LAX1() {
	
		try {
			Process oLAX1 = OVPN_LAX1.exec("openvpn-gui lax1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the correct configuration. Please confirm that you have installed OpenVPN correctly.");
			e.printStackTrace();
		}
		
		
	}
	
	
	public void openvpn_LV1() {
		
		try {
			Process oLV1 = OVPN_LV1.exec("openvpn-gui lv1-scambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the correct configuration. Please confirm that you have installed OpenVPN correctly.");
			e.printStackTrace();
		}
		
	}
	
	public void openvpn_NY1() {
		
		try {
			Process oNY1 = OVPN_NY1.exec("openvpn-gui ny1-scrambled.ovpn");
		} catch (IOException e) {
			System.out.println("Unable to find the correct configuration. Please confirm that you have installed OpenVPN correctly.");
			e.printStackTrace();
		}
		
	}
	
	
	
}
