package uebungsblatt3.uebung5;

public class Hochschulperson5 implements Person {
	
	private String hochschule;
	public String fullName;
	public Ort wohnort;
	public Adresse5 adr;
	
	public Hochschulperson5 (String hochschule, String fullName, Ort wohnort, 
							 String strasse, String hausnummer, int plz){
		this.hochschule = hochschule;
		this.fullName = fullName;
		this.wohnort = wohnort;
		adr = new Adresse5(strasse, hausnummer, plz, wohnort.toString()); 
		
	}
	
	public String ermittleZugehoerigkeit() {
		
		return hochschule;
	}
	
}
