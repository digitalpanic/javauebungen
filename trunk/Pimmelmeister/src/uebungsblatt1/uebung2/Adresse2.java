package uebungsblatt1.uebung2;

public class Adresse2 {

	String strasse;
	String hausnummer;
	int postleitzahl;
	String ort;
	String string;
	
	public Adresse2(String str, String hausnr, int plz, String wohnort) {
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
