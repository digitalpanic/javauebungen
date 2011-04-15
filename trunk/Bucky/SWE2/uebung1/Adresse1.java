package uebungsblatt1.uebung1;

public class Adresse1 {

	String strasse;
	String hausnummer;
	int postleitzahl;
	String ort;
	String String;
	
	public Adresse1(String str, String hausnr, int plz, String wohnort) {
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
