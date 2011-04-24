package uebungsblatt3.uebung5;

public class Adresse5 {

	private String strasse;
	private String hausnummer;
	private int postleitzahl;
	private String ort;

	
	public Adresse5(String str, String hausnr, int plz, String wohnort) {
		strasse = str;
		hausnummer = hausnr;
		postleitzahl = plz;
		ort = wohnort;
	}
	//Kopierkonstruktor erstellen
	public Adresse5(Adresse5 copy){
		strasse = copy.strasse;
		hausnummer = copy.hausnummer;
		postleitzahl = copy.postleitzahl;
		ort = copy.ort;
	}
	
	
	public String toString(){
		return strasse + " "  + hausnummer + "\n" + postleitzahl + " " + ort;
	}
}
