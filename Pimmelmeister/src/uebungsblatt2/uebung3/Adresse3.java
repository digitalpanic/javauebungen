package uebungsblatt2.uebung3;

public class Adresse3 {

	private String strasse;
	private String hausnummer;
	private int postleitzahl;
	private String ort;
//test
	
	public Adresse3(String str, String hausnr, int plz, String wohnort) {
		strasse = str;
		hausnummer = hausnr;
		postleitzahl = plz;
		ort = wohnort;
	}
	public String toString(){
		System.out.println("Adresse: \n" + strasse + " " + hausnummer);
		return postleitzahl + " " + ort;
		
	}
}
