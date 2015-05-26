package main;

public class ConsoleDebug {

	public static void main(String[] args) {
		
		String[] regionNorthAsia = new String[5];
		
		regionNorthAsia[0] = "Japan - Tokyo";
		regionNorthAsia[1] = "South Korea - Seoul";
		regionNorthAsia[2] = "Taiwan - Taipei";
		
		String[] regionSEA = new String[5];
		
		regionSEA[0] = "Hong Kong - Kowloon";
		regionSEA[1] = "Singapore - Singapore";
		regionSEA[2] = "Malaysia - Kuala Lumpur";
		
		String[] regionNA = new String[10];
		
		regionNA[0] = "USA - Los Angeles (China Unicom)";
		regionNA[1] = "USA - Las Vegas (China Telcome)";
		regionNA[2] = "USA - New York";
		regionNA[3] = "USA - Atlanta";
		regionNA[4] = "USA - Dallas";
		regionNA[5] = "USA - Fremont";
		regionNA[6] = "USA - Newark";
		regionNA[7] = "Canada - Toronto";
		regionNA[8] = "Canada - Vancouver";
		
		String[] regionEUW = new String[10];
		
		regionEUW[0] = "Germany - Berlin (TBA)";
		regionEUW[1] = "France - Paris (TBA)";
		regionEUW[2] = "Netherlands - Amsterdam (TBA)";
		regionEUW[3] = "Switzerland - Bern (TBA)";
		
		String[] regionEUE = new String[10];
		
		regionEUE[0] = "United Kingdom - London (TBA)";
		regionEUE[1] = "United Kingdom - Manchester (TBA)";
		
		String[] regionSAmerica = new String[5];
		
		regionSAmerica[0] = "";
		regionSAmerica[1] = "";
		
		for(int i = 0; i <= regionNorthAsia.length; i++){
			
			String temp_Item = regionNorthAsia[i];
			System.out.println("NAsia: " + temp_Item);

		}
		
		for(int i = 0; i <= regionSEA.length; i++){
			
			String temp_Item = regionSEA[i];
			System.out.println("SEA: " + temp_Item);

		}
		
		for(int i = 0; i <= regionNA.length; i++){
			
			String temp_Item = regionNA[i];
			System.out.println("NA: " + temp_Item);
			
		}
		
		for(int i = 0; i <= regionSAmerica.length; i++){
			
			String temp_Item = regionSAmerica[i];
			System.out.println("SA: " + temp_Item);
			
		}
		
		for(int i = 0; i <= regionEUW.length; i++){
			
			String temp_Item = regionEUW[i];
			System.out.println("EUW: " + temp_Item);

			
		}
		
		for(int i = 0; i <= regionEUE.length; i++){
			
			String temp_Item = regionEUE[i];
			System.out.println("EUE: " + temp_Item);

			
		}
		
		
	}
	
}
