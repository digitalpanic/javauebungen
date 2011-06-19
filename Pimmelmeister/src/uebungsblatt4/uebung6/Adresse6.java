package uebungsblatt4.uebung6;

public class Adresse6 implements Cloneable{

	private String strasse;
	private String hausnummer;
	private int postleitzahl;
	private String ort;

	
	public Adresse6(String str, String hausnr, int plz, String wohnort) {
		strasse = str;
		hausnummer = hausnr;
		postleitzahl = plz;
		ort = wohnort;
	}
//	//Kopierkonstruktor erstellen
//	public Adresse6(Adresse6 copy){
//		strasse = copy.strasse;
//		hausnummer = copy.hausnummer;
//		postleitzahl = copy.postleitzahl;
//		ort = copy.ort;
//	}
	
	//redefinierte Clone Methode ohne zusätzliche Verändernungen 
	//da keine veränderlichen Datentypen 
	public Adresse6 clone() throws CloneNotSupportedException{
		return (Adresse6)super.clone();
	}
	
	public String toString(){
		return strasse + " "  + hausnummer + "\n" + postleitzahl + " " + ort;
	}

	public boolean equals(Object adr){
		if ((adr == null) || (adr.getClass() != this.getClass())){
			return false;
		}
		else return (getStrasse().equals(((Adresse6)adr).getStrasse())&&getHausnummer().equals(((Adresse6)adr).getHausnummer())&&
			getPostleitzahl()==((Adresse6)adr).getPostleitzahl()&&getOrt().equals(((Adresse6)adr).getOrt()));
		}
	
	//Getter erstellen
	String getStrasse() {
		return strasse;
	}
	String getHausnummer() {
		return hausnummer;
	}
	int getPostleitzahl() {
		return postleitzahl;
	}
	String getOrt() {
		return ort;
	}
	//Setter erstellen
	public void setStrasse(String strasse) {
		this.strasse = strasse;
	}
	public void setHausnummer(String hausnummer) {
		this.hausnummer = hausnummer;
	}
	public void setPostleitzahl(int postleitzahl) {
		this.postleitzahl = postleitzahl;
	}
	public void setOrt(String ort) {
		this.ort = ort;
	}
}
