package uebungsblatt2.uebung4;

public class Adresse4 {

	private String strasse;
	private String hausnummer;
	private int postleitzahl;
	private String ort;

	
	public Adresse4(String str, String hausnr, int plz, String wohnort) {
		strasse = str;
		hausnummer = hausnr;
		postleitzahl = plz;
		ort = wohnort;
	}
	//Kopierkonstruktor
	public Adresse4(Adresse4 copy){
		strasse = copy.strasse;
		hausnummer = copy.hausnummer;
		postleitzahl = copy.postleitzahl;
		ort = copy.ort;
	}
	
	
	public String toString(){
		return strasse + " "  + hausnummer + "\n" + postleitzahl + " " + ort;
	}
}
